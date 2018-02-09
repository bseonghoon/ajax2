package com.naver.homefood2.mapper;

import org.springframework.stereotype.Repository;

import com.naver.homefood2.vo.User;

@Repository
public interface SignMapper {
	public void signUp(User user);
}
