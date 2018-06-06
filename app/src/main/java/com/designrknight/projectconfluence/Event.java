package com.designrknight.projectconfluence;

public class Event {
    private String title;
    private String imgUrl;
    private String content;

    public Event(String title, String imgUrl, String content) {

        this.title = title;
        this.imgUrl = imgUrl;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
