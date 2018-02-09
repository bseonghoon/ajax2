package com.naver.homefood2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.naver.homefood2.mapper.BoardMapper;
import com.naver.homefood2.vo.Board;

@Controller
@RequestMapping("/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired(required = false)
    private BoardMapper boardMapper;


	@RequestMapping(value = "/boardWritePage", method = RequestMethod.GET)
	public String boardWritePage() {
		logger.info("boardWritePage");

		return "board/boardWritePage";
	}

	@RequestMapping(value = "/boardWriteAction", method = RequestMethod.POST)
	public String boardWriteAction() {
	    logger.info("boardWrite");



	    return "redirect:/";
	}

	@RequestMapping(value = "/boardListInfo/{page}", method = RequestMethod.GET)
    @ResponseBody
    public List<Board> db(@PathVariable int page) {

        page = 10 * (page - 1);
        List<Board> cmdEvntPrptList = boardMapper.getCmdEvntPrpt(page);
        logger.info("list out : {}", cmdEvntPrptList.size() );
        for (Board board : cmdEvntPrptList) {
            logger.info(board.getTitle());
        }

        return cmdEvntPrptList;
    }

    @RequestMapping(value = "/boardList", method = RequestMethod.GET)
    public String viewList() {

        return "board/boardList";
    }
}
