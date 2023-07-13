package net.eyeb.youqi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"net.eyeb.youqi.db1", "net.eyeb.youqi.db2"})
public class YouqiWebApplication {

  public static void main(String[] args) {
    SpringApplication.run(YouqiWebApplication.class, args);
  }

}
