package scrib.hyde.rest.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("rest")
                .password("{noop}rocks")
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*
        Setting up Basic Authentication
         */
        //http.authorizeRequests().anyRequest().authenticated().and().httpBasic();

        /*
        Setup
         */
    }
}
