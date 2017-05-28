package spring.play.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.play.lib.LibraryBean;

/**
 * Spring mixing XML and Java configuration but loading from java.
 */
public class App3 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config3.class);
        LibraryBean bean = context.getBean(LibraryBean.class);
        System.out.println(bean.aMethod("app3"));
    }

}
