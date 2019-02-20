package com.mbtechpro.model;

public class WordsBean {
    /**
     * favorite : false
     * isPTEWord : false
     * lastupdate : 2019-02-16T23:23:06Z
     * starred : false
     * createdDate : 2019-02-16T23:23:06Z
     * seenCount : 1
     * completed : false
     * hasHardPronunciation : false
     * inflections :
     * entryID : 8949321
     * attentive : false
     * mastaryLevel : 0
     * derivations : hedonics
     * name : hedonics
     */

    private boolean favorite;
    private boolean isPTEWord;
    private String lastupdate;
    private boolean starred;
    private String createdDate;
    private int seenCount;
    private boolean completed;
    private boolean hasHardPronunciation;
    private String inflections;
    private int entryID;
    private boolean attentive;
    private int mastaryLevel;
    private String derivations;
    private String name;

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public boolean isIsPTEWord() {
        return isPTEWord;
    }

    public void setIsPTEWord(boolean isPTEWord) {
        this.isPTEWord = isPTEWord;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(int seenCount) {
        this.seenCount = seenCount;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isHasHardPronunciation() {
        return hasHardPronunciation;
    }

    public void setHasHardPronunciation(boolean hasHardPronunciation) {
        this.hasHardPronunciation = hasHardPronunciation;
    }

    public String getInflections() {
        return inflections;
    }

    public void setInflections(String inflections) {
        this.inflections = inflections;
    }

    public int getEntryID() {
        return entryID;
    }

    public void setEntryID(int entryID) {
        this.entryID = entryID;
    }

    public boolean isAttentive() {
        return attentive;
    }

    public void setAttentive(boolean attentive) {
        this.attentive = attentive;
    }

    public int getMastaryLevel() {
        return mastaryLevel;
    }

    public void setMastaryLevel(int mastaryLevel) {
        this.mastaryLevel = mastaryLevel;
    }

    public String getDerivations() {
        return derivations;
    }

    public void setDerivations(String derivations) {
        this.derivations = derivations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
