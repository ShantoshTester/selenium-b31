package readexcel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {

	public static void main(String[] args) {
		
		try
		{
			File file = new File("./src/test/resources/data/testdata.xlsx");
			
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook excel = new XSSFWorkbook(fis);
			
			int count = excel.getSheetAt(0).getLastRowNum();
			
			for(int i=0; i<=count;i++)
			{
				String row = excel.getSheetAt(0).getRow(i).getCell(0).toString();
				String col = excel.getSheetAt(0).getRow(i).getCell(1).toString();
				System.out.println(row+" : "+col);
			}
			
			excel.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("unable to load the excel file. please check "+e.getMessage());
		}
		


	}

}
