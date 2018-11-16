package org.kidding.controller;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.kidding.domain.PageParam;
import org.kidding.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class TimeMapperTests extends AbstractTests {
	
//	@Setter(onMethod_=@Autowired)
//	private TimeMapper mapper;
//	
//	@Setter(onMethod_=@Autowired)
//	private TodoMapper todoMapper;
	
	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testSearch() {
		
		PageParam pageParam = new PageParam();
//		pageParam.setScond("tc");
//		pageParam.setKeyword("아놔진짜");
		
//		Map<String, String> cond = new HashMap<>();
//		cond.put("t", "test");
//		cond.put("c", "sample");
		
		pageParam.setType("t");
		pageParam.setKeyword("sample");
		
		pageParam.setExtend(false);
		
		log.info(mapper.search(pageParam));
		log.info(mapper.searchCount(pageParam));
	}
//	//TimeMapper�� �������̽��ε� ��� �����߳�?
//	//�������� �������̽��� �´� Ŭ������ ������. �ڵ带 ������ �ʾƵ� ���������� ����. 
//	@Test
//	public void testTime() {
//		log.info(mapper.getTime());
//	}
//	
//	@Test
//	public void testTime2() {
//		log.info(mapper.getTime2());
//	}
//	
//	@Test
//	public void testTodo() {
//		log.info(todoMapper.select());
//	}
//	
//	@Test
//	public void testInsert(){
//		todoMapper.insert("�������");
//	}
//	
//	@Test
//	public void testDelete() {
//		todoMapper.delete(3);
//	}
//	
//	@Test
//	public void testUpdate() {
//		
//		Todo todo = todoMapper.select().get(1);
//		todo.setTitle("�����մϴ�.");
//		todoMapper.update(todo);
//	}
}
