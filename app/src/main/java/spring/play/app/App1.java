package spring.play.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.play.lib.LibraryBean;

/**
 * Spring with XML configuration only
 */
public class App1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app1.xml");
        LibraryBean bean = context.getBean(LibraryBean.class);
        System.out.println(bean.aMethod("app1"));
    }

}
