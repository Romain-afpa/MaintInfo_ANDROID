package model;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.maintinfo.maintinfo_android_v2.R;

import java.util.List;

import Util.ImageGenerator;
import entity.Article;

/**
 * Created by Romain on 01/03/2016.
 */
public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ViewHolder> {

    private List<Article> articles;

    public ArticlesAdapter(){

    }
    public ArticlesAdapter(List<Article> articles) {

        this.articles = articles;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView desArt;
        TextView prixArt;
        ImageView image;
        int idArticle;

        public ViewHolder(View v){

            super(v);
            this.desArt = (TextView) v.findViewById(R.id.desArt);
            this.prixArt = (TextView) v.findViewById(R.id.prixArt);
            this.image = (ImageView) v.findViewById((R.id.image));

        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ArticlesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_articles_item, null );

        // create ViewHolder
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);

        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        Article article = articles.get(position);

        viewHolder.desArt.setText(article.getDesart());
        viewHolder.prixArt.setText(article.getPrixart() + "0 €");
        viewHolder.image.setImageResource(ImageGenerator.randomImage());

        viewHolder.prixArt.setTag(article);


    }


    @Override
    public int getItemCount() {
        return articles.size();
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}


