package spring.play.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.play.lib.LibraryBean;
import spring.play.lib.LibraryBeanImpl;

@Configuration
public class Config2 {

    @Bean
    public LibraryBean libraryBean() {
        return new LibraryBeanImpl();
    }

}
