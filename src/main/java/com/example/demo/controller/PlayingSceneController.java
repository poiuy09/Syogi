package com.example.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Position;
import com.example.demo.service.PositionService;

@Controller
public class PlayingSceneController {
	@Autowired
	PositionService positionService;

	@RequestMapping("/playingScene1")
	String RequestplayingScene1(Model model) {
		int a= 1;
		Position position =positionService.makegameboard(a);
		model.addAttribute("position",position);
	    return "board";
	}

	@RequestMapping("/playingScene2")
	String RequestplayingScene2(Model model) {
		int a= 2;
		Position position =positionService.makegameboard(a);
		model.addAttribute("position",position);
	    return "board2";
	}

//	move1～4の前のやつサンプル
//	@PostMapping("/move")
//	@ResponseBody
//	  public String move(HttpServletResponse response, @RequestBody Board model) {
//		System.out.println("getFromRank =" + model.getFrom_rank());
//		System.out.println("getFromFile =" + model.getFrom_file());
//		System.out.println("getToRank =" + model.getTo_rank());
//		System.out.println("getToFile =" + model.getTo_file());
//		System.out.println("getBoard =" + model.getBoard());
//
//		positionService.updateBoard(model);
//
//	    return "success";
//	  }

	@PostMapping("/move1")
	@ResponseBody
	  public String move1(HttpServletResponse response, @RequestBody Board model1) {

		positionService.updateBoard1(model1);

	    return "success";
	  }

	@PostMapping("/move2")
	@ResponseBody
	  public String move2(HttpServletResponse response, @RequestBody Board model2) {

		positionService.updateBoard2(model2);

	    return "success";
	  }

	@PostMapping("/move3")
	@ResponseBody
	  public String move3(HttpServletResponse response, @RequestBody Board model3) {

		positionService.updateBoard3(model3);

	    return "success";
	  }

	@PostMapping("/move4")
	@ResponseBody
	  public String move4(HttpServletResponse response, @RequestBody Board model4) {

		positionService.updateBoard4(model4);

	    return "success";
	  }

}
