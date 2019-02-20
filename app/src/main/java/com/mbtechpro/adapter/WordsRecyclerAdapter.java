package com.mbtechpro.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.mbtechpro.holder.WordsHolder;
import com.mbtechpro.model.WordsBean;

import java.util.List;

public class WordsRecyclerAdapter extends RecyclerView.Adapter {

    private List<WordsBean> mWordsBean;

    public WordsRecyclerAdapter(List<WordsBean> wordsBean) {
        mWordsBean = wordsBean;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        WordsHolder holder =

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
