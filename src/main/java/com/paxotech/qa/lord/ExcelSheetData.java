package com.paxotech.qa.lord;

import java.io.File;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;


public class ExcelSheetData extends PageBase{

	public ExcelSheetData(WebDriver driver) {
		super(driver);
	}

	@DataProvider
	public static Object[][] excelDataProvider() {

		try {
			String inputFile = System.getProperty("user.dir")
					+ "/src/test/resources/Data/XclData.xls";
			File inputWorkbook = new File(inputFile);

			Workbook w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			Sheet sheet = w.getSheet(0);

			Object[][] data = new Object[sheet.getRows() - 1][sheet.getColumns()];

			String cellData = null;
			for (int j = 0; j < sheet.getColumns(); j++) {
				for (int i = 1; i < sheet.getRows(); i++) {

					Cell cell = sheet.getCell(j, i);
					CellType type = cell.getType();
					if (type == CellType.LABEL) {
						cellData = cell.getContents();
					}

					if (type == CellType.NUMBER) {
						cellData = cell.getContents().toString();
				}

					data[i - 1][j] = cellData;
				}
			}

			return data;

		} catch (Exception ex) {

		}

		return null;

	}
}
