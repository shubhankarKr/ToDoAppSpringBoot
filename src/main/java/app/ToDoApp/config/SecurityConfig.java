package app.ToDoApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.cache.NullUserCache;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//		http.csrf((csrf) -> csrf.disable())
				http.authorizeHttpRequests((requests) -> 
				 requests.requestMatchers("/user/register").permitAll()
				.requestMatchers("/**").authenticated()
				)
				.formLogin(Customizer.withDefaults());
		return http.build();
	}
	
	@Bean
	UserCache userCache() {
	    return new NullUserCache();
	}
	
//	@Bean
//	InMemoryUserDetailsManager inMemoryUserDetailsManager(PasswordEncoder encoder) {
//		UserDetails hello=User.withUsername("hello").password(encoder.encode("12345")).build();
//		return new InMemoryUserDetailsManager(hello);
//	}
	
//	@Bean
//	JdbcUserDetailsManager jdbcUserDetailsManager(DataSource datasource) {
//		return new JdbcUserDetailsManager(datasource);
//	}
}
