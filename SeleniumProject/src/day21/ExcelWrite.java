package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		
		//Modidf an existing Cell
		Row r=ws.getRow(0);
		Cell c=r.getCell(1);
		c.setCellValue("abc");
		
		//Write into a blank cell in an existing row
		r=ws.getRow(1);
		c=r.createCell(3);
		c.setCellValue("xyz");
		
		//Write into a blank row and blank cell
		r=ws.createRow(3);
		c=r.createCell(0);
		c.setCellValue("DEF");
		
		//Save the excel file
		FileOutputStream f=new FileOutputStream("C:\\Users\\Sai\\Desktop\\Book1.xlsx");
		wb.write(f);
		wb.close();
		
		

	}

}
