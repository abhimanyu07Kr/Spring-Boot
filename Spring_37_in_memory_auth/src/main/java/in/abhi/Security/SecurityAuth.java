package in.abhi.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityAuth {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/contact", "/swagger-ui.html").permitAll()
                .anyRequest().authenticated()
        )
        .httpBasic(withDefaults())
        .formLogin(withDefaults());
        return http.build();
    }
    
    
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager()
    {
    	UserDetails u1 = User.withDefaultPasswordEncoder()
    	.username("abhi")
    	.password("abhi")
    	.authorities("User")
    	.build();
    	
    	UserDetails u2 = User.withDefaultPasswordEncoder()
    	.username("manu")
    	.password("manu")
    	.authorities("Admin","User")
    	.build();
    	
    	return new InMemoryUserDetailsManager(u1,u2);
    }
}
