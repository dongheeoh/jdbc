package com.douzon.jdbc.bookshop.test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.douzon.jdbc.bookshop.dao.AuthorDao;
import com.douzon.jdbc.bookshop.vo.AuthorVO;

public class AuthorDaoTest {
	
	public static void main(String[] args) {
//		insertTest("스테파니메이어");
//		insertTest("조정래");
//		insertTest("천상병");
//		insertTest("김동인");
//		insertTest("김난도");
		getListTest();
	
	}
	public static void insertTest(String name) {
		AuthorVO vo = new AuthorVO();
		vo.setName(name);
		vo.setBio("");
		new AuthorDao().insert(vo);
	}
	
	public static void getListTest() {
		List<AuthorVO> list = new AuthorDao().getList();
		for(AuthorVO vo : list) {
			System.out.println(vo);
		}
	}
}
