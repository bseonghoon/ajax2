package com.naver.homefood2.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.naver.homefood2.vo.Board;

@Repository
public interface BoardMapper {
	List<Board> getCmdEvntPrpt(int page);
}
