package com.gg.service.impl;

import com.gg.dao.NoteDao;
import com.gg.entity.Note;
import com.gg.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service/*告诉springIOC容器要在IOC容器里面创建NoteServiceImpl对象，id为noteServiceImpl*/ /*意为服务，一般注解service的实现类*/
public class NoteServiceImpl implements NoteService {

    @Autowired/*从IOC容器里面找该类型的对象去赋值*/
    private NoteDao noteDao;

    public Note findByID(Integer ID) {
        return noteDao.findByID(ID);
    }
//    @Autowired 作用于方法上面时set方法的方法名可以随意，，根据参数的类型来进行注入的，所以方法名随意
//    public void setNoteDao(NoteDao noteDao) {
//        this.noteDao = noteDao;
//    }
}
