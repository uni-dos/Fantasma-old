package com.dev.rj3.fantasma.model.children;

import com.google.gson.annotations.SerializedName;
public class Children {


    @SerializedName("data")
    private Entry entry;


    @SerializedName("kind")
    private String kind;


    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Children{" +
                "entry=" + entry +
                ", kind='" + kind + '\'' +
                '}';
    }
}
