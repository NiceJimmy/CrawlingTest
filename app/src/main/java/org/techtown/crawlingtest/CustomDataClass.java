package org.techtown.crawlingtest;

public class CustomDataClass {

    private String title;
    private String img_url;

    public CustomDataClass(String title, String img_url) {
        this.title = title;
        this.img_url = img_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
