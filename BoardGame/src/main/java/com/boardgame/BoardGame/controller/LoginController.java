package com.boardgame.BoardGame.controller;

import com.boardgame.BoardGame.entity.User;
import com.boardgame.BoardGame.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;


    public class LoginController {
        @Autowired
        private final LoginService loginService;

        public LoginController(LoginService loginService)
        {
            this.loginService = loginService;
        }

        @GetMapping("/login")
        @ResponseBody
        public String loginId(@ModelAttribute User user) {
            System.out.println("로그인22");
            if(loginService.login(user)){

                return "Ok";
            }else{
                return "Fail";
            }

        }
}
