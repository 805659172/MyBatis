package com.gg.entity;

import java.util.Date;

public class Note {
    private Integer ID;
    private String sTitle;
    private String ltText;
    private Integer nInputUserID;
    private Date dtInputDate;
    private Integer nStatusID;

    public Note() {
    }

    public Note(Integer ID, String sTitle, String ltText, Integer nInputUserID, Date dtInputDate, Integer nStatusID) {
        this.ID = ID;
        this.sTitle = sTitle;
        this.ltText = ltText;
        this.nInputUserID = nInputUserID;
        this.dtInputDate = dtInputDate;
        this.nStatusID = nStatusID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public String getLtText() {
        return ltText;
    }

    public void setLtText(String ltText) {
        this.ltText = ltText;
    }

    public Integer getnInputUserID() {
        return nInputUserID;
    }

    public void setnInputUserID(Integer nInputUserID) {
        this.nInputUserID = nInputUserID;
    }

    public Date getDtInputDate() {
        return dtInputDate;
    }

    public void setDtInputDate(Date dtInputDate) {
        this.dtInputDate = dtInputDate;
    }

    public Integer getnStatusID() {
        return nStatusID;
    }

    public void setnStatusID(Integer nStatusID) {
        this.nStatusID = nStatusID;
    }

    @Override
    public String toString() {
        return "Note{" +
                "ID=" + ID +
                ", sTitle='" + sTitle + '\'' +
                ", ltText='" + ltText + '\'' +
                ", nInputUserID=" + nInputUserID +
                ", dtInputDate=" + dtInputDate +
                ", nStatusID=" + nStatusID +
                '}';
    }
}
