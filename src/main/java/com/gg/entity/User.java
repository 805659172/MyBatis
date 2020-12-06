package com.gg.entity;

import java.util.*;

public class User {

    private Integer ID;//id

    private String sName;//名称

    private String sAddress;//地址

    private List<String> strList;

    private List<Note> noteList;

    private Set<String> strSet;

    private Set<Note> notesSet;

    private Map<String,String> strMap;

    private Map<Integer, Note> noteMap;

    private String[] strings;

    private Note[] notes;

    private Properties properties;

    public User() {
    }

    public User(Integer ID, String sName, String sAddress) {
        this.ID = ID;
        this.sName = sName;
        this.sAddress = sAddress;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public Set<String> getStrSet() {
        return strSet;
    }

    public void setStrSet(Set<String> strSet) {
        this.strSet = strSet;
    }

    public Set<Note> getNotesSet() {
        return notesSet;
    }

    public void setNotesSet(Set<Note> notesSet) {
        this.notesSet = notesSet;
    }

    public Map<String, String> getStrMap() {
        return strMap;
    }

    public void setStrMap(Map<String, String> strMap) {
        this.strMap = strMap;
    }

    public Map<Integer, Note> getNoteMap() {
        return noteMap;
    }

    public void setNoteMap(Map<Integer, Note> noteMap) {
        this.noteMap = noteMap;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public Note[] getNotes() {
        return notes;
    }

    public void setNotes(Note[] notes) {
        this.notes = notes;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                ", strList=" + strList +
                ", noteList=" + noteList +
                ", strSet=" + strSet +
                ", notesSet=" + notesSet +
                ", strMap=" + strMap +
                ", noteMap=" + noteMap +
                ", strings=" + Arrays.toString(strings) +
                ", notes=" + Arrays.toString(notes) +
                ", properties=" + properties +
                '}';
    }
}
