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

public class ArticleHotAdapter extends RecyclerView.Adapter<ArticleHotAdapter.ViewHolder> {

    private List<Article> list;
    private static Context context;

    public ArticleHotAdapter(List<Article> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ArticleHotAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_article_hot, viewGroup, false);
        context = viewGroup.getContext();

        return new ArticleHotAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleHotAdapter.ViewHolder viewHolder, int i) {
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
