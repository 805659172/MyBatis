package Demo;

import com.gg.controller.NoteController;
import com.gg.entity.Man;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManTest {
    ApplicationContext applicationContext = null;
    Man man = null;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        man = (Man) applicationContext.getBean("man");
    }

    /**
     * 前置通知测试
     */
    @Test
    public void beforeAdviseTest(){
        man.eat();
    }

    /**
     * 后置通知测试方法
     */
    @Test
    public void afterAdviseTest() {
        man.eat();

    }

    /**
     * 环绕通知测试方法
     */
    @Test
    public void aroundAdviseTest() {
        man.eat();
    }

    /**
     * 异常通知测试方法
     */
    @Test
    public void exceptionAdviseTest() {
        man.exception();
    }

}
