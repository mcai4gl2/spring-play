package spring.play.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import spring.play.lib.LibraryBean;

/**
 * Using Spring boot to load bean.
 */
public class App4 implements CommandLineRunner {

    @Autowired
    private LibraryBean bean;

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(Config4.class);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started");
        System.out.println(bean.aMethod("app4"));
    }
}
