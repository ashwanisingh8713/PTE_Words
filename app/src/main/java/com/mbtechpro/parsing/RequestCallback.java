package com.mbtechpro.parsing;

/**
 * Created by ashwanisingh on 08/03/18.
 */

public interface RequestCallback<T> {

    void onNext(T t);
    void onError(Throwable t, String str);
    void onComplete(String str);
}
