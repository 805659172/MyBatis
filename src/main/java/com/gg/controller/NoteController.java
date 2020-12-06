package com.gg.controller;

import com.gg.entity.Note;
import com.gg.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component /*意为组件，如果一个类无法归类为dao，service，controller就用它，spring3.0出来的注解之后进行了拆分*/
@Controller /*和service，Dao的实现类里面的注解一样的效果*/ /*一般注解控制层*/
public class NoteController {

    @Autowired/*一般作用于属性，方法，构造方法上面*/
    private NoteService noteService;

    public void findByID(Integer id) {
        Note note = noteService.findByID(id);
        System.out.println(note);
    }


}
