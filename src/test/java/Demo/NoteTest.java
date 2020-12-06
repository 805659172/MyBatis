package Demo;

import com.gg.controller.NoteController;
import com.gg.dao.NoteDao;
import com.gg.dao.impl.NoteDaoImpl;
import com.gg.dao.impl.NoteDaoProxyImpl;
import com.gg.entity.Note;
import com.gg.factory.CglibProxyFactory;
import com.gg.factory.ProxyFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NoteTest {

    /**
     * 测试NoteDao的findByID方法
     */
    @Test
    public void findByIDTest(){
        /*加载spring的配置文件，并初始化IOC容器*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        NoteController noteController = (NoteController) applicationContext.getBean("noteController");
        noteController.findByID(1);
    }

    /**
     * 静态代理测试
     */
    @Test
    public void staticProxyTest(){
        NoteDao noteDao = new NoteDaoImpl();
        NoteDao noteDaoProxy = new NoteDaoProxyImpl(noteDao);
        noteDaoProxy.findByID(1);
    }

    /**
     * 动态代理测试方法
     */
    @Test
    public void jdkDynamicProxyTest(){
        NoteDao noteDao = new NoteDaoImpl();
        ProxyFactory proxyFactory = new ProxyFactory(noteDao);
        NoteDao noteDaoProxy = (NoteDao) proxyFactory.getProxyInstance();
        noteDaoProxy.ss();
    }

    /**
     * cglib实现动态代理
     */
    @Test
    public void cglibDynamicProxyTest(){
        NoteDao noteDao = new NoteDaoImpl();
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(noteDao);
        NoteDao noteDaoProxy = (NoteDao) cglibProxyFactory.getProxyInstance();
        Note note = noteDaoProxy.findByID(1);
        System.out.println(note);
    }


}
