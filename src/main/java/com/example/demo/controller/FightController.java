package com.example.demo.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.model.User;
import com.example.demo.model.User_point;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.service.User_pointService;
@Controller
public class FightController
{
	private final UserRepository repository;
    @Autowired //← コンストラクタが１つの場合、@Autowiredは省略できます
    HttpSession session;
    @Autowired
    UserService userService;
    @Autowired
    User_pointService userpointService;

    public FightController(UserRepository repository)
    {
        this.repository = repository;

    }


		//トップページは特段渡す数字とかないから引数渡さんでよい
	    @GetMapping("/history")
	    public String history(@ModelAttribute User user,Model model){
	    	User users=(User)session.getAttribute("login");
	    	int id=users.getId();
	    	User_point userpoint=userpointService.findId(id);
	    	model.addAttribute("userpoint", userpoint);

	        return "history";
	    }

	    @GetMapping("/roby")
	    public String roby(@ModelAttribute User user,Model model){

	        return "roby";
	    }
	    @GetMapping("/battle")
	    public String battle(@ModelAttribute User user,Model model){

	        return "battle";
	    }

	    @GetMapping("/win")
	    public String win(@ModelAttribute User user,Model model){

	        return "win";
	    }


	    @GetMapping("/lose")
	    public String lose(@ModelAttribute User user,Model model){

	        return "lose";
	    }
	    @GetMapping("/up")
	    public String up(@ModelAttribute User user,Model model){

	        return "up";
	    }


	    @GetMapping("/down")
	    public String down(@ModelAttribute User user,Model model){

	        return "down";
	    }


}