package com.lhj.minitea.po;

public class Backmenu {
    private Integer id;

    private String name;

    private Integer pId;

    private String url;

    private String insertUrl;

    private String deleteUrl;

    private String selectUrl;

    private String updateUrl;

    private String images;

    private String tableName;

    private String iconOpen;

    private String iconClose;

    private String icon;

    private String fontCss;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getInsertUrl() {
        return insertUrl;
    }

    public void setInsertUrl(String insertUrl) {
        this.insertUrl = insertUrl == null ? null : insertUrl.trim();
    }

    public String getDeleteUrl() {
        return deleteUrl;
    }

    public void setDeleteUrl(String deleteUrl) {
        this.deleteUrl = deleteUrl == null ? null : deleteUrl.trim();
    }

    public String getSelectUrl() {
        return selectUrl;
    }

    public void setSelectUrl(String selectUrl) {
        this.selectUrl = selectUrl == null ? null : selectUrl.trim();
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl == null ? null : updateUrl.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getIconOpen() {
        return iconOpen;
    }

    public void setIconOpen(String iconOpen) {
        this.iconOpen = iconOpen == null ? null : iconOpen.trim();
    }

    public String getIconClose() {
        return iconClose;
    }

    public void setIconClose(String iconClose) {
        this.iconClose = iconClose == null ? null : iconClose.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getFontCss() {
        return fontCss;
    }

    public void setFontCss(String fontCss) {
        this.fontCss = fontCss == null ? null : fontCss.trim();
    }
}