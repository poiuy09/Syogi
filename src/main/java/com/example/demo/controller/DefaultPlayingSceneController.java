package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultPlayingSceneController {

	//ログイン画面遷移
		@RequestMapping("/defaultplayingScene")
		String create() {
		    return "defaultboard";
		}
}
