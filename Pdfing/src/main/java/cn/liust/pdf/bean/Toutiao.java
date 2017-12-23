package cn.liust.pdf.bean;

public class Toutiao {
    private int id;
    private String image_url;
    private String title;
    private int media_creator_id;
    private String media_name;

    public Toutiao(int id, String image_url, String title, int media_creator_id, String media_name) {
        this.id = id;
        this.image_url = image_url;
        this.title = title;
        this.media_creator_id = media_creator_id;
        this.media_name = media_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMedia_creator_id() {
        return media_creator_id;
    }

    public void setMedia_creator_id(int media_creator_id) {
        this.media_creator_id = media_creator_id;
    }

    public String getMedia_name() {
        return media_name;
    }

    public void setMedia_name(String media_name) {
        this.media_name = media_name;
    }
}
