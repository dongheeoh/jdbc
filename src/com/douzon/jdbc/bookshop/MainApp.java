package com.douzon.jdbc.bookshop;

import java.util.Scanner;

import com.douzon.jdbc.bookshop.dao.BookDao;
import com.douzon.jdbc.bookshop.test.BookDaoTest;
import com.douzon.jdbc.bookshop.vo.BookVo;


public class MainApp {
	public static void main(String[] args) {
		
		displayBookInfo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
		long no = scanner.nextInt();
		scanner.close();
		
		rent(no);
		displayBookInfo();
		
		
	}
	private static void rent(long no) {
		
		new BookDao().update(no,"대여중");
	}
	
	
	public static void displayBookInfo() {
		System.out.println("*****도서 정보 출력하기******");
		BookDaoTest.getListTest();
	}

}
