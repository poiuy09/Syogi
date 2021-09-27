package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BattleController {

	//ログイン画面遷移
	@RequestMapping("/Battle")
	String create() {
	    return "board";
	}


}
