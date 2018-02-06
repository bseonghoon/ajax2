package com.naver.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.naver.demo.model.Student;

@Repository
public interface DemoRepository {
	List<Student> getCmdEvntPrpt(int page);
}
