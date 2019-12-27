package com.esgis.s2aeshop.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esgis.s2aeshop.R;
import com.esgis.s2aeshop.models.Article;

import java.util.List;

public class ArticleCatAdapter extends RecyclerView.Adapter<ArticleCatAdapter.ViewHolder> {


    private List<Article> list;
    private static Context context;

    public ArticleCatAdapter(List<Article> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ArticleCatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_article_cat, viewGroup, false);
        context = viewGroup.getContext();

        return new ArticleCatAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleCatAdapter.ViewHolder viewHolder, int i) {
        Article article = list.get(i);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
