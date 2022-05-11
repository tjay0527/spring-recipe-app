package jay.springframework.springrecipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// make this class a spring component
public class IndexController {

  @RequestMapping({"", "/", "index"})// when we go to one of these URL, we want the getIndexPage called to return a string value that will be used by Thymeleaf
  public String getIndexPage(){
    return "index";// the name of this return string should match the name of the page under templates
  }
}
