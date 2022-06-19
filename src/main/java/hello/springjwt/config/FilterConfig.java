package hello.springjwt.config;

import hello.springjwt.filter.MyFilter1;
import hello.springjwt.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter1> filter1() {
        FilterRegistrationBean<MyFilter1> filter = new FilterRegistrationBean<>(new MyFilter1());
        filter.addUrlPatterns("/*");
        filter.setOrder(0);
        return filter;
    }

    @Bean
    public FilterRegistrationBean<MyFilter2> filter2() {
        FilterRegistrationBean<MyFilter2> filter = new FilterRegistrationBean<>(new MyFilter2());
        filter.addUrlPatterns("/*");
        filter.setOrder(1);
        return filter;
    }
}
