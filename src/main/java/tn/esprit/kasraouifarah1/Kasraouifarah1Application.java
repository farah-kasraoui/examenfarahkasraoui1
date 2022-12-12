package tn.esprit.kasraouifarah1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class Kasraouifarah1Application {

    public static void main(String[] args) {
        SpringApplication.run(Kasraouifarah1Application.class, args);
    }

}
