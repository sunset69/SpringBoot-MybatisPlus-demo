package cc.lexur.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cc.lexur") // 这个一定要换成自己的包名
public class MybatisApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApiApplication.class, args);
    }

}
