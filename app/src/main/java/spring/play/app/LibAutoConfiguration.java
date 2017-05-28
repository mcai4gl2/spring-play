package spring.play.app;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.play.lib.LibraryBean;
import spring.play.lib.LibraryBeanImpl;

@Configuration
@ConditionalOnClass(LibraryBean.class)
public class LibAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public LibraryBean libraryBean() {
        return new LibraryBeanImpl(str -> str);
    }

}
