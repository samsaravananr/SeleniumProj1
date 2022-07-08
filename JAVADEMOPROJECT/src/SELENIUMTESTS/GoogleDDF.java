package SELENIUMTESTS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDDF {

	
	public static WebDriver myD;
	public static String vATitle;
	public static int xlRows,xlCols;
	public static String xData[][];
	
	
	public static void main(String[] args) throws Exception 
	{
	
		xlRead("C:\\Users\\SARAVANAN R\\JAVA_SELENIUM\\JAVADEMOPROJECT\\AmazonDataFrameworks.xls");
		
		for (int i=1;i<xlRows;i++)
		{
		if (xData[i][1].contains("Y"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SARAVANAN R\\Downloads\\JavaIND\\chromedriver.exe");
		myD=new ChromeDriver();
		myD.get("https://www.google.com");
		myD.manage().window().maximize();
		myD.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		myD.findElement(By.className("gLFyf")).sendKeys(xData[i][2]);
		myD.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		vATitle=myD.getTitle();
		xData[i][4]=vATitle;
		
		if(xData[i][4].contains(xData[i][3]))
		{
			xData[i][5]="PASS";
		}
		else
		{
			xData[i][5]="FAIL";
		}
		
		myD.close();
		}
		}
		
		xlwrite("C:\\Users\\SARAVANAN R\\JAVA_SELENIUM\\JAVADEMOPROJECT\\GoogleResult.xls", xData);
	}
	
	
	//
	
	public static void xlRead(String sPath) throws Exception
	{
		File myFile=new File(sPath);
		FileInputStream myStream=new FileInputStream(myFile);
		
		// ADD APACHE POI JAR FILE to the project
		// Link - http://www.java2s.com/Code/Jar/p/Downloadpoi39jar.htm
		
		HSSFWorkbook myWorkbook=new HSSFWorkbook(myStream);
		HSSFSheet mySheet=myWorkbook.getSheetAt(0);
		xlRows=mySheet.getLastRowNum()+1;
		xlCols=mySheet.getRow(0).getLastCellNum();
		System.out.println("Row Count is "+xlRows);
		System.out.println("Col Count is "+xlCols);
		
		//TwoD array is ROWS AND COLUMNS
		// XDATA[ROWS][COLS]
		
		xData =new String[xlRows][xlCols];
		
		// ROWS
		for (int i=0;i<xlRows;i++)
		{
			HSSFRow row=mySheet.getRow(i);
			
			//COLS
			for (short j=0;j<xlCols;j++)
			{
				HSSFCell cell=row.getCell(j);
				String value=cellToString(cell);
				xData[i][j]=value;
				System.out.print(xData[i][j]+"    ");
			}
			System.out.println();
		}
	}
	public static String cellToString(HSSFCell cell)
		{
		int type=cell.getCellType();
		Object result;
		switch(type)
		{
		case HSSFCell.CELL_TYPE_NUMERIC:
		result=cell.getNumericCellValue();
		break;
		case HSSFCell.CELL_TYPE_STRING:
		result=cell.getStringCellValue();
		break;
		case HSSFCell.CELL_TYPE_FORMULA:
		throw new RuntimeException("We cannot evaluate formula");
		case HSSFCell.CELL_TYPE_BLANK:
		result="-";
		case HSSFCell.CELL_TYPE_BOOLEAN:
		result=cell.getBooleanCellValue();
		case HSSFCell.CELL_TYPE_ERROR:
		result="This Cell has some error";
		default:
		throw new RuntimeException("We do not evaluate this data");
		}
		return result.toString();
		}


	public static void xlwrite(String xlpath1,String[][] xData) throws Exception
	{
//		System.out.println("Inside XL Write");
		
		//Creating the file instance of File Class.
		File myFile1=new File(xlpath1);
		
		//Creating the instance of Input Stream Class
		FileOutputStream fout=new FileOutputStream(myFile1);
		
		//Selecting the WorkBook
		HSSFWorkbook wb=new HSSFWorkbook();
		
		//creating the Sheet.
		HSSFSheet mySheet1=wb.createSheet("TestResults");
		for(int i=0;i<xlRows;i++)
		{
			//selecting the row.
			HSSFRow row1=mySheet1.createRow(i);
			for(short j=0;j<xlCols;j++)
			{
				//selecting the cell to write the data
				HSSFCell cell1=row1.createCell(j);
				cell1.setCellType(HSSFCell.CELL_TYPE_STRING);
				cell1.setCellValue(xData[i][j]);
			}
		}
		wb.write(fout);
		fout.flush();
		fout.close();
	}
	

	

}
