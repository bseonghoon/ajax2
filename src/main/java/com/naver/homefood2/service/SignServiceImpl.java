package com.naver.homefood2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.homefood2.mapper.SignMapper;
import com.naver.homefood2.vo.User;

@Service
public class SignServiceImpl implements SignService {

    @Autowired(required = false)
    SignMapper signMapper;

    @Override
    public int signUp(User user, String password2) {

        if(user.getPassword().equals(password2)) {
            signMapper.signUp(user);
            return 1;
        }else {
            return 0;
        }

    }
}
