package com.company;

public class Song {
    private String title;
    private String executor;
    private String text;
    private String genre;

    public Song(String title, String executor, String text, String genre) {
        this.title = title;
        this.executor = executor;
        this.text = text;
        this.genre = genre;
    }

    public Song() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                        ", executor='" + executor + '\'' +
                        ", text='" + text + '\'' +
                        ", genre='" + genre;
    }
}
