package com.gg.dao.impl;

import com.gg.dao.NoteDao;
import com.gg.entity.Note;

public class NoteDaoProxyImpl implements NoteDao {

    NoteDao noteDao = new NoteDaoImpl();

    public NoteDaoProxyImpl(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    public Note findByID(Integer ID) {
        begin();
        Note note = noteDao.findByID(ID);
        System.out.println(note);
        end();
        return note;
    }

    public void ss() {

    }

    public void begin(){
        System.out.println("开启事务");
    }

    public void end(){
        System.out.println("提交事务");
    }

}
