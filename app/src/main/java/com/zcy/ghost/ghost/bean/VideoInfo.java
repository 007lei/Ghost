package com.zcy.ghost.ghost.bean;

/**
 * Description:
 * Creator: yxc
 * date: $date $time
 */
public class VideoInfo extends BaseModel {
    public VideoInfo() {
    }

    public VideoInfo(boolean isFirst) {
        setFirst(isFirst);
    }

    public String shareURL;
    public String title;
    public String pic;
    public String dataId;
    public String score;
    public String airTime;
    public String moreURL;
    //    public String description;
    private boolean isFirst = false;
    private String type;

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
