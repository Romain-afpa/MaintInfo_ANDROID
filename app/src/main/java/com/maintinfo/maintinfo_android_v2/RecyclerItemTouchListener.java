package com.maintinfo.maintinfo_android_v2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import entity.Article;

/**
 * Created by Romain on 02/03/2016.
 */
public class RecyclerItemTouchListener implements RecyclerView.OnItemTouchListener {

    private Context context;
    private GestureDetector detector;
    private View clickedView;

    public RecyclerItemTouchListener(Context context) {

        this.context = context;
        this.detector = new GestureDetector(context, new SimpleOnGestureListener() {

            @Override
            public boolean onSingleTapUp(MotionEvent e) {

                super.onSingleTapUp(e);
                return true;
            }
        });

    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

        clickedView = rv.findChildViewUnder(e.getX(), e.getY());

        if (clickedView != null && detector.onTouchEvent(e)) {

            View view =  clickedView.findViewById(R.id.prixArt);
            Article art = (Article) view.getTag();
            int id = art.getId_article();

            Toast.makeText(context, id+"" , Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {


    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
