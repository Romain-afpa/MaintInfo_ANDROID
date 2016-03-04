package com.maintinfo.maintinfo_android_v2;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import entity.Article;
import entity.ArticleWrapper;
import model.ArticlesAdapter;

/**
 * Created by Romain on 04/03/2016.
 */
public class ArticlesTask extends AsyncTask<String, String, List<Article>> {

    private ProgressDialog dialog;
    private Context context;
    private RecyclerView rv;
    public ArticlesTask(Context context, RecyclerView rv){
        this.context = context;
        this.rv = rv;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog = new ProgressDialog(context);
        dialog.setTitle(context.getString(R.string.progress_title));
        dialog.setMessage(context.getString(R.string.dialog_message));
        dialog.show();
    }

    @Override
    protected List<Article>  doInBackground(String... params) {

        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try {

            URL url = new URL(params[0]);
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream stream = connection.getInputStream();

            reader = new BufferedReader(new InputStreamReader(stream));

            StringBuffer buffer = new StringBuffer();

            String line = "";

            while((line = reader.readLine()) != null){
                buffer.append(line);
            }

            Gson gson = new GsonBuilder().create();

            ArticleWrapper art = gson.fromJson(buffer.toString(), ArticleWrapper.class);

            return art.getArticles();

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(connection != null) {
                connection.disconnect();
            }
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(List<Article> articles) {
        super.onPostExecute(articles);

        ArticlesAdapter adapter = new ArticlesAdapter(articles);
        rv.setAdapter(adapter);

        if(dialog.isShowing()){
            dialog.dismiss();
        }
    }
}//taskClass
