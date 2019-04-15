package ProprtyHandlng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DemoB {
	@Test
	public static void testA() throws Exception{
		//Read
		Workbook w= WorkbookFactory.create(new FileInputStream("./input/Booka.xlsx"));
		String v= w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(v);
		//create row and write
		//w.getSheet("sheet1").createRow(2).createCell(0).setCellValue("bijil");
//	write
		w.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("bijil");
		w.write(new FileOutputStream("./input/Book2.xlsx"));
	}
}
