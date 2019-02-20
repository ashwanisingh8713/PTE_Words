package com.mbtechpro.parsing;

import android.content.Context;

import com.google.gson.Gson;
import com.mbtechpro.model.WordsBean;
import com.mbtechpro.model.WordsJsonData;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class LocalParserUtil {

    private static String loadJSONFromAsset(Context context, String fileName) {
        String json = null;
        try {
            InputStream is = context.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }


    public static void parseWordsJsonFile(final RequestCallback callback, final Context context,
                                        String fileName) {
        Observable.just(fileName)
                .subscribeOn(Schedulers.io())
                .map(new Function<String, WordsJsonData>() {
                    @Override
                    public WordsJsonData apply(String fileName) throws Exception {
                        Gson gson = new Gson();
                        return gson.fromJson(loadJSONFromAsset(context, fileName), WordsJsonData.class);
                    }
                })
                .map(new Function<WordsJsonData, List<WordsBean>>() {
                    @Override
                    public List<WordsBean> apply(WordsJsonData wordsJsonData) throws Exception {

                        List<WordsBean> updatedVertex = new ArrayList<>();


                            return updatedVertex;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<WordsBean>>() {
                    @Override
                    public void accept(List<WordsBean> o) throws Exception {
                        if(callback != null) {
                            callback.onNext(o);
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if(callback != null) {
                            callback.onError(throwable, "parseWordsJsonFile");
                        }
                    }
                }, new Action() {
                    @Override
                    public void run() throws Exception {
                        if(callback != null) {
                            callback.onComplete("parseWordsJsonFile");
                        }
                    }
                });
    }
}
