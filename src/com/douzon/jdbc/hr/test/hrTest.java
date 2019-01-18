package com.douzon.jdbc.hr.test;

import java.util.List;
import java.util.Scanner;
import com.douzon.jdbc.hr.dao.hrDao;
import com.douzon.jdbc.hr.vo.hrVo;

public class hrTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름검색:");
		String spell = scanner.nextLine();
		scanner.close();
		
		
		getListTest(spell);
	}
	
	public static void getListTest(String spell) {
		
		List<hrVo> list= new hrDao().getList(spell);
		for(hrVo hrVo:list) {
			System.out.println(hrVo);
		}
	}

}
