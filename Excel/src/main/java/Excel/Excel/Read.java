package Excel.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read {


    public static void main(String args[]) throws IOException
    {
    	File f = new File("C:\\Users\\owner\\eclipse-workspace\\ZP\\12.xlsx");
    	FileInputStream file = new FileInputStream(f);
    	XSSFWorkbook book = new XSSFWorkbook(file);
    	XSSFSheet sheet = book.getSheetAt(0);
    	int row = sheet.getPhysicalNumberOfRows();
    	
    	int cols = sheet.getRow(0).getPhysicalNumberOfCells();
    	
    	String Data [][] = new String[row][cols];
    	
    	XSSFCell cell;
    	for(int i=1; i<row;i++)
    	{
    		for(int j=0; j<cols;j++)
    		{
    			cell = sheet.getRow(i).getCell(j);
    			String c = cell.getStringCellValue();
    			Data[i][j]  = c;
    			System.out.println(Data[i][j]);
    			
    		}
    	}
    	
    }
}
