package com.mbtechpro.model;

import java.util.List;

public class WordsJsonData {


    /**
     * count : 17868
     * name : Version1.0
     * lastUpdate : 2019-02-17T04:28:27Z
     * mywords : [{"favorite":false,"isPTEWord":false,"lastupdate":"2019-02-16T23:23:06Z","starred":false,"createdDate":"2019-02-16T23:23:06Z","seenCount":1,"completed":false,"hasHardPronunciation":false,"inflections":"","entryID":8949321,"attentive":false,"mastaryLevel":0,"derivations":"hedonics","name":"hedonics"}]
     */

    private int count;
    private String name;
    private String lastUpdate;
    private List<WordsBean> mywords;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<WordsBean> getMywords() {
        return mywords;
    }

    public void setMywords(List<WordsBean> mywords) {
        this.mywords = mywords;
    }


}
