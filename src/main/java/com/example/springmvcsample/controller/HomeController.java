package com.example.springmvcsample.controller;

import com.example.springmvcsample.model.Inquiry;
import com.example.springmvcsample.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

  @GetMapping("/form")
  private String readFrom(@ModelAttribute User user) {
    return "form";
  }

  @PostMapping("/form")
  private String confirm(@ModelAttribute User user) {
    // model.addAttribute("user", user); をしなくて良くなる
    return "confirm";
  }

  @GetMapping("/validation")
  private String validate(@ModelAttribute Inquiry inquiry) {
    return "validation";
  }

  @PostMapping("/validation")
  private String validate(@Validated @ModelAttribute Inquiry inquiry, BindingResult result) {
    if (result.hasErrors()) {
      return "/validation";
    }
    return "clear_validation";
  }
}

/*
@ModelAttribute ... モデル属性にバインドする。

下記2つは同じ意味になります。
@ModelAttribute User user
@ModelAttribute("user") User user

リクエストと同じ名前のものがモデルに流し込まれます。これをデータバインディングと呼びます。
 */
