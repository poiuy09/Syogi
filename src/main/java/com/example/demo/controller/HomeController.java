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

import com.example.demo.model.Emailbox;
import com.example.demo.model.Login;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
@Controller
public class HomeController
{
	private final UserRepository repository;
    @Autowired //← コンストラクタが１つの場合、@Autowiredは省略できます
    HttpSession session;
    @Autowired
    UserService userService;
    public HomeController(UserRepository repository)
    {
        this.repository = repository;

    }


		//トップページは特段渡す数字とかないから引数渡さんでよい
	    @GetMapping("/")
	    public String index(){
	        return "index";
	    }
	    @GetMapping("/logout")
	    public String logout(){

	        return "index";
	    }


	@GetMapping("/temporary_registration")
    public String register(Emailbox emailbox)//タイムリーフに情報の受け渡しをする箱としての Emailbox emailboxを定義する必要がある
	{
        return "temporary_registration";
    }

	@GetMapping("/registration")
	  public String login(@ModelAttribute User user, Emailbox emailbox,Model model)
	{

		return "registration";
	}


	@GetMapping("/login")
	  public String login(@ModelAttribute Login login)
	{
		return "login";
	}


//メアド送られてきたときの処理
	@PostMapping("/mail")

    public String confirm(@Validated @ModelAttribute Emailbox emailbox,
    		BindingResult result)
	{
		if (result.hasErrors())
		{
            // エラーがある場合、index.htmlに戻る
            return "temporary_registration";
        }

		session.setAttribute("Data",emailbox);
		return "recieved_email";
	}
//個人情報送られて来た時の処理　確認画面に続く
	@PostMapping("/confirm")

    public String confirm(@Validated @ModelAttribute User user,Model model, Emailbox emailbox,
            BindingResult result)
	{
		Emailbox registeredemailbox=(Emailbox)session.getAttribute("Data");
		model.addAttribute("emailbox",registeredemailbox);
		if (result.hasErrors())
		{

            return "registration";
        }
	return "confirm";
}





	//ログイン時の処理
	@PostMapping("/login")
	 public String sucsess(@Validated  @ModelAttribute Login login,
	            BindingResult result)
	{
		User users=userService.findEmailPassword(login.getEmail(),login.getPassword());

			if (result.hasErrors()||users==null)
			{
	            // エラーがある場合、login.htmlに戻る
	            return "login";
			}

		session.setAttribute("login",users);
		return "sucsess";
	}
//ログイン成功時の処理
	 @GetMapping("/home")
	    public String home(@ModelAttribute User user, Model model){
	    	User users=(User)session.getAttribute("login");
	    	model.addAttribute("user",users);
	    	return "home";
	    }

	@PostMapping("/revisedone")
	public String revisedone(@Validated @ModelAttribute User user,
			BindingResult result)
	{
			/*if (result.hasErrors()) {
	            // エラーがある場合、login.htmlに戻る
	            return "login";
	        }*/
		return "sucsess";
	}





	@PostMapping("/regist")
    public String addComment(@Validated @ModelAttribute User user, BindingResult result, Model model)
	{
		Emailbox registeredemailbox=(Emailbox)session.getAttribute("Data");
		user.setEmail(registeredemailbox.getEmail());//セッションから持ってきたメアドをuserの箱に入れる
		model.addAttribute("user", repository.findAll());
        if (result.hasErrors()){
            return "confirm";
        }

        repository.save(user);
        return "done";
	}
}