package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class ReviseController
{



    @Autowired //← コンストラクタが１つの場合、@Autowiredは省略できます
    HttpSession session;

    @Autowired
    UserService userService;



    @GetMapping("/revise")
	public String revise(@ModelAttribute User user, Model model)
	{
		User users=(User)session.getAttribute("login");
		model.addAttribute("user",users);
		return "revise";
	}

  //名前フィールドの更新
  	@GetMapping("/name")
  	public String name(@ModelAttribute User user, Model model)
  	{
  		User users=(User)session.getAttribute("login");
  		model.addAttribute("user",users);
  		return "name";
  	}

  	@PostMapping("/revisename")
  	public String revisename(@Validated @ModelAttribute User user,BindingResult result, Model model)
  	{
  		if (result.hasErrors())
        {
            return "name";
        }
  		User users=(User)session.getAttribute("login");
  		users.setName(user.getName());
  		userService.updateUser(users);

  		return "revisedone";
  	}

  //ニックネームフィールドの更新
  	@GetMapping("/nickname")
  	public String nickname(@ModelAttribute User user, Model model)
  	{
  		User users=(User)session.getAttribute("login");
  		model.addAttribute("user",users);
  		return "nickname";
  	}

  	@PostMapping("/revisenickname")
  	public String nickname(@Validated @ModelAttribute User user,BindingResult result, Model model)
  	{
  		if (result.hasErrors())
        {
            return "nickname";
        }
  		User users=(User)session.getAttribute("login");
  		users.setNickname(user.getNickname());
  		userService.updateUser(users);

  		return "revisedone";
  	}



  	@GetMapping("/email")
  	public String email(@ModelAttribute User user, Model model)
  	{
  		User users=(User)session.getAttribute("login");
  		model.addAttribute("user",users);
  		return "email";
  	}

  	@PostMapping("/reviseemail")
  	public String reviseemail(@Validated @ModelAttribute User user,BindingResult result, Model model)
  	{
  		if (result.hasErrors())
        {
            return "email";
        }
  		User users=(User)session.getAttribute("login");
  		users.setEmail(user.getEmail());
  		userService.updateUser(users);

  		return "revisedone";
  	}



  	@GetMapping("/password")
  	public String password(@ModelAttribute User user, Model model)
  	{
  		User users=(User)session.getAttribute("login");
  		model.addAttribute("user",users);
  		return "password";
  	}

  	@PostMapping("/revisepassword")
  	public String revisepassword(@Validated @ModelAttribute User user,BindingResult result, Model model)
  	{
  		if (result.hasErrors())
        {
            return "password";
        }
  		User users=(User)session.getAttribute("login");
  		users.setPassword(user.getPassword());
  		userService.updateUser(users);

  		return "revisedone";
  	}



}



