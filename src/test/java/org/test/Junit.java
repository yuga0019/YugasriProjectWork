package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Junit extends BaseClass{

	@BeforeClass
	public static void launchUrl() {
		launchUrl("https://adactinhotelapp.com/");

	}
		@Test
		 public  void test1() throws Exception {
			LoginPage a = new LoginPage();
			enterText(a.getUsername(), excelRead("D:\\practice\\adactin.xlsx","login",0,0));
			enterText(a.getPassword(), excelRead("D:\\practice\\adactin.xlsx","login",0,1));
			btnClick(a.getLoginbutton());
			System.out.println("login page completed");
		}
			@Test
			public  void test2() throws Exception{
			System.out.println("search hotel page completed");
			SearchPage b = new SearchPage();
			selectByIndex(b.getLocation(), Integer.parseInt(excelRead("D:\\practice\\adactin.xlsx", "login", 0,2)));
			selectByIndex(b.getHotels(), Integer.parseInt(excelRead("D:\\practice\\adactin.xlsx", "login", 0,2)));
			selectByIndex(b.getRoomtype(), Integer.parseInt(excelRead("D:\\practice\\adactin.xlsx", "login", 0,2)));
			selectByIndex(b.getRoomnumber(), Integer.parseInt(excelRead("D:\\practice\\adactin.xlsx", "login", 0,2)));
			
			enterText(b.getDatein(), excelRead("D:\\practice\\adactin.xlsx", "login", 0,3));
			enterText(b.getDateout(), excelRead("D:\\practice\\adactin.xlsx", "login", 0,4));
			
			selectByIndex(b.getAdult(), Integer.parseInt(excelRead("D:\\practice\\adactin.xlsx", "login", 0,2)));
			selectByIndex(b.getChild(), Integer.parseInt(excelRead("D:\\practice\\adactin.xlsx", "login", 0,2)));
			btnClick(b.getSelect());
			
			}
			@Test
			public  void test3() {
				SelectPage c = new SelectPage();
				btnClick(c.getIcon());
				btnClick(c.getSelect1());
			System.out.println("selecthotelpage completed");
			}
			@Test
			public  void test4() throws Exception {
				BookingPage d = new BookingPage();
				enterText(d.getFirstname(), excelRead("D:\\practice\\adactin.xlsx", "login", 1,1));
				enterText(d.getLastname(), excelRead("D:\\practice\\adactin.xlsx", "login", 1,2));
				enterText(d.getAddress(), excelRead("D:\\practice\\adactin.xlsx", "login", 1,3));
				enterText(d.getCardnumber(), excelRead("D:\\practice\\adactin.xlsx", "login", 0,5));
				selectByIndex(d.getCardtype(), Integer.parseInt(excelRead("D:\\practice\\adactin.xlsx", "login", 0,2)));
				selectByIndex(d.getCardexpmonth(), Integer.parseInt(excelRead("D:\\practice\\adactin.xlsx", "login", 0,2)));
				selectByIndex(d.getCardexpyear(), Integer.parseInt(excelRead("D:\\practice\\adactin.xlsx", "login", 1,3)));
				enterText(d.getCardcvv(), excelRead("D:\\practice\\adactin.xlsx", "login", 1,4));
				btnClick(d.getBook());
			System.out.println("booking hotel page completed ");
			}
			@AfterClass
			public static void orderNumGet() throws Exception {
				Thread.sleep(6000);
				String orderNum = orderNum("order_no");
				excelWrite(0,0,orderNum);
			System.out.println("completed");
			}
			
			@Before
			public void entryTime() {
				Date d=new Date();
				System.out.println(d);
			}
			
			@After
			public void exitTime() {
				Date d2=new Date();
				System.out.println(d2);
			}

}
