package live.foreach.novel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
    
    
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
    	// TODO: erroPage
    	return null;
    }
    
}
