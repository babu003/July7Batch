package com.orangehrm.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangehrm.utilty.ExcelOperations;
import com.orangehrm.utilty.Screenshots;

public class BaseClass {
	
	static WebDriver driver=null;
	ExcelOperations eo=new ExcelOperations();
	Screenshots sc=new Screenshots();
	String empList=".\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String scrPath=".\\src\\com\\orangehrm\\screenshots\\";
	String dataEngine=".\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
}
