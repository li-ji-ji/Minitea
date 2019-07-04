package com.lhj.minitea.po;

public class Template {
    private Integer tId;

    private String tName;

    private String tKind;

    private Integer tStatus;

    private String tContent;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettKind() {
        return tKind;
    }

    public void settKind(String tKind) {
        this.tKind = tKind == null ? null : tKind.trim();
    }

    public Integer gettStatus() {
        return tStatus;
    }

    public void settStatus(Integer tStatus) {
        this.tStatus = tStatus;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent == null ? null : tContent.trim();
    }
}