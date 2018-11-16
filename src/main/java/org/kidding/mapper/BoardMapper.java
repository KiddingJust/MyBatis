package org.kidding.mapper;

import java.util.List;

import org.kidding.domain.BoardVO;
import org.kidding.domain.PageParam;

public interface BoardMapper {
	
	
//	public List<BoardVO> search(@Param("scond") String scond, 
//			@Param("keyword") String keyword);

	public List<BoardVO> search(PageParam pageParam);
	
	public int searchCount(PageParam pageParam);
}
