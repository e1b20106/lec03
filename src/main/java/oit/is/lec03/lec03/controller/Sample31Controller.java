package oit.is.lec03.lec03.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sample3")
public class Sample31Controller {
  @GetMapping("step1")
  public String sample31() {
    return "sample31.html";
  }

  @GetMapping("step2")
  public String sample32(ModelMap model, Principal prin) {
    String loginUser = prin.getName(); // ログインユーザ情報
    model.addAttribute("login_user", loginUser);
    return "sample31.html";
  }

  @GetMapping("step3")
  public String sample33() {
    return "sample33.html";
  }

}
