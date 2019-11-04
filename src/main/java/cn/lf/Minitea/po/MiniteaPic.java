package cn.lf.Minitea.po;

import java.util.Date;

public class MiniteaPic {
    private Integer id;

    private String picName;

    private String picUrl;

    private Integer picStatus;

    private Double picWidth;

    private Double picHeight;

    private String picIntro;

    private Date uploadTime;

    private String picKey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getPicStatus() {
        return picStatus;
    }

    public void setPicStatus(Integer picStatus) {
        this.picStatus = picStatus;
    }

    public Double getPicWidth() {
        return picWidth;
    }

    public void setPicWidth(Double picWidth) {
        this.picWidth = picWidth;
    }

    public Double getPicHeight() {
        return picHeight;
    }

    public void setPicHeight(Double picHeight) {
        this.picHeight = picHeight;
    }

    public String getPicIntro() {
        return picIntro;
    }

    public void setPicIntro(String picIntro) {
        this.picIntro = picIntro == null ? null : picIntro.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getPicKey() {
        return picKey;
    }

    public void setPicKey(String picKey) {
        this.picKey = picKey == null ? null : picKey.trim();
    }
}