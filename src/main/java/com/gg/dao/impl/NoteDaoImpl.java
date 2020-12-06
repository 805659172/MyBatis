package com.gg.dao.impl;

import com.gg.dao.NoteDao;
import com.gg.entity.Note;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository(value = "noteDaoImpl")/*告诉spring的IOC容器，要在IOC容器里面创建NoteDaoImpl实现类的对象默认为 id=noteDaoImpl 其中value值为id，类名的首字母小写作为ID值*/  /*意为仓库，一般注解数据库访问层*/
public class NoteDaoImpl implements NoteDao {
    public Note findByID(Integer ID) {
        Note note = null;
        switch (ID) {
            case 1:
                note = new Note(1,"1","1",1,new Date(),1);
                break;
            case 2:
                note = new Note(2,"2","2",2,new Date(),1);
                break;
            case 3:
                note = new Note(3,"3","3",3,new Date(),1);
                break;
        }
        return note;
    }

    public void ss(){
        System.out.println("GG");
    }
}
