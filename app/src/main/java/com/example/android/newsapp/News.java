package com.example.android.newsapp;

public class News {
    private String mTitle;
    private String mUrl;
    private String mSection;
    private String mDate;
    private String mAuthor;

    public News(String title, String url, String section, String date, String author) {
        mTitle = title;
        mUrl = url;
        mSection = section;
        mDate = date;
        mAuthor = author;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getSection() { return mSection; }

    public String getDate() { return mDate; }

    public String getAuthor() { return mAuthor; }
}
