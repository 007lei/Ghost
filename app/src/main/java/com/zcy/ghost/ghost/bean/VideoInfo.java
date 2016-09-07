package com.zcy.ghost.ghost.bean;

/**
 * Description:
 * Creator: yxc
 * date: $date $time
 */
public class VideoInfo {
    VideoInfo() {
    }

    public VideoInfo(boolean isFirst) {
        setFirst(isFirst);
    }

    public String shareURL;
    public String title;
    public String pic;
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
