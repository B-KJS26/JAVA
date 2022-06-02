package com.boardgame.BoardGame.service;

import com.boardgame.BoardGame.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import com.boardgame.BoardGame.repository.userRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginService {

    @Autowired
    //private final userRepository userRepository;
    private final userRepository userRepository;

    public boolean login(User user) {
        User findUser = userRepository.findUser(user.getEmail(),user.getPassword());

        if(findUser == null){
            return false;
        }
        if(!findUser.getPassword().equals(user.getPassword())){
            return false;
        }
        return true;
    }
}
