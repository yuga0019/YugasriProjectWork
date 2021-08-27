package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static Select s;
	public static String orderNumber;
	
	public static void launchUrl (String url)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\MavenProject2021\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	public static WebElement elementlocatorById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	
	public static WebElement elementlocatorXpath (String xpath) {
		return driver.findElement(By.xpath(xpath));
		
	}
	
	public static void enterText (WebElement element, String text) {
		
		element.sendKeys(text);
	}
	
	public static void btnClick (WebElement element) {
		element.click();
		
	}
	
	public static void selectByIndex(WebElement element, int index) {
		s= new Select(element);
		s.selectByIndex(index);
	}
	
	public static String orderNum(String Loc) {
		WebElement order = driver.findElement(By.id(Loc));
		orderNumber = order.getAttribute("value");
		System.out.println(orderNumber);
		return orderNumber;
	}
	
	public static String excelRead (String path, String sname, int rownum, int cellnum) throws IOException {
		File f = new File(path);
		FileInputStream str = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(str);
		Sheet sheet = w.getSheet(sname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();
		String data = null;
		
		if(cellType==1) {
			data = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat fd = new SimpleDateFormat("MMM-dd-yyyy");
			data= fd.format(dateCellValue);
			
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long)numericCellValue;
			data = String.valueOf(l);
		}
		return data;
		
		
	}
	
	//public static void excelWrite(String path, String sname, int rownum, int rowcell, String data) throws IOException {
	   //File f = new File(path);
		//Workbook w = new XSSFWorkbook();
		//Sheet createSheet = w.createSheet(sname);
		//Row createRow = createSheet.createRow(rownum);
		//Cell createCell = createRow.createCell(rowcell);
		//createCell.setCellValue(data);
		//FileOutputStream str1 = new FileOutputStream (f);
		//w.write(str1);
		
	//}
	
	public static void excelWrite(int rownum,int cellnum,String orderNo) throws InvalidFormatException, IOException {
		File f=new File("D:\\Output.xlsx");
		f.createNewFile();
		Workbook  w = new XSSFWorkbook();
        Sheet createSheet = w.createSheet("Output"); 
	    Row createRow = createSheet.createRow(rownum);
        Cell createCell = createRow.createCell( cellnum);
		createCell.setCellValue(orderNo);
		FileOutputStream f1=new FileOutputStream(f);
		w.write(f1);
		f1.close();
		System.out.println("Done");
		
}


	
	//public static String gettingAttribute(WebElement element, String id){
		//String attributeValue = element.getAttribute("value");
		//System.out.println(attributeValue);
		//return attributeValue;
		
	//}
	
	public static String getAttribute(String id,WebElement element) {
		   String ref = element.getAttribute("value");
		  System.out.println(ref);
		  return ref;
	}

}
