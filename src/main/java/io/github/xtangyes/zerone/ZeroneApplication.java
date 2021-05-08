package io.github.xtangyes.zerone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.xtangyes.zerone.dao")
public class ZeroneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroneApplication.class, args);
    }

}
