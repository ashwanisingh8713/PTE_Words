package com.mbtechpro.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mbtechpro.myapplication.R;

public class WordsHolder extends RecyclerView.ViewHolder {

    public TextView mainWord_TV;
    public TextView derivations_TV;
    public ImageView favImg;
    public TextView isDone_TV;
    public TextView seenCount_TV;
    public TextView hasHardPronunciation_TV;

    public WordsHolder(@NonNull View itemView) {
        super(itemView);

        mainWord_TV = itemView.findViewById(R.id.mainWord_TV);
        derivations_TV = itemView.findViewById(R.id.derivations_TV);
        favImg = itemView.findViewById(R.id.favImg);
        isDone_TV = itemView.findViewById(R.id.isDone_TV);
        seenCount_TV = itemView.findViewById(R.id.seenCount_TV);
        hasHardPronunciation_TV = itemView.findViewById(R.id.hasHardPronunciation_TV);

    }



}
