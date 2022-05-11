package jay.springframework.springrecipeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// this tag will do a package scan on any folders that is under it
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
