package com.naver.homefood2.service;

import com.naver.homefood2.vo.User;

public interface SignService {
    public int signUp(User user, String password2);
}
