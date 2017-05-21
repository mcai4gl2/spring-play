package spring.play.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.play.lib.LibraryBean;

/**
 * Spring mixing XML and Java configuration but loading from xml.
 */
public class App2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app2.xml");
        LibraryBean bean = context.getBean(LibraryBean.class);
        System.out.println(bean.aMethod("app2"));
    }

}
