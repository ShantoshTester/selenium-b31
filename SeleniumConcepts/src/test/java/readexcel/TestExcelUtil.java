package readexcel;

import utils.ExcelUtil;

public class TestExcelUtil {

	public static void main(String[] args) {
		
		ExcelUtil xl = new ExcelUtil("./src/test/resources/data/testdata.xlsx");
		int count = xl.getRowCount(1);
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String row = xl.getCellData(1, i, 0);
			String col = xl.getCellData(1, i, 1);
			System.out.println(row+" : "+col);
		}

	}

}
