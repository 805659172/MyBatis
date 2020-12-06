package Demo;

import com.gg.controller.UserController;
import com.gg.controller.UserController2;
import com.gg.entity.User;
import com.gg.factory.BeanFactory2;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class UserTest {

    /**
     * 通过自己写bean.properties实现控制反转
     */
    @Test
    public void findByID2(){
        UserController2 userController = BeanFactory2.getBean("userController2");
        userController.findByID();
    }

    /**
     * 通过Spring框架实现配置反转
     */
    @Test
    public void findByID(){
        /*加载spring的配置文件，并初始化IOC容器*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext);
        /*所以用ID从IOC容器中取出对象*/
//        UserController userController = (UserController) applicationContext.getBean("userController");
//        userController.findByID();
        User user = (User) applicationContext.getBean("user06");
        System.out.println(user.toString());
    }

    /**
     * 使用JdbcTemplate
     */
    @Test
    public void UseJdbcTemplate(){
        //1、创建数据源对象
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        //2、设置连接参数 driver url username password
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql:114.116.246.188:3306/ggbooks");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123456");
        System.out.println(driverManagerDataSource);
        //3、创建JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

    }
}
