package com.rubato.home.dao;

import java.util.List;

import com.rubato.home.dto.RFboardDto;

public interface IDao {
	
	public int boardWriteDao(String bname, String btitle, String bcontent, String buserid, int filecount);
	public List<RFboardDto> boardListDao();//게시판 모든 글 리스트
	public int boardTotalCountDao();//게시판 총 게시글 개수
	public RFboardDto boardContentViewDao(String bnum);//클릭한 글의 내용 보기
	public void boardHitDao(String bnum);//조회수 증가
		
}
