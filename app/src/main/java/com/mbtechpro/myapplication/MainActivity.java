package com.mbtechpro.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.mbtechpro.model.WordsBean;
import com.mbtechpro.parsing.LocalParserUtil;
import com.mbtechpro.parsing.RequestCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(llm);

        LocalParserUtil.parseWordsJsonFile(new RequestCallback<List<WordsBean>>() {
            @Override
            public void onNext(List<WordsBean> o) {
                Log.i("", "");
            }

            @Override
            public void onError(Throwable t, String str) {
                Log.i("", "");
            }

            @Override
            public void onComplete(String str) {
                Log.i("", "");

            }
        }, this, "vocabularies.json");



    }



}
