package com.util;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;

public class RegisterDataProvider {

	@DataProvider
	public String[][] getRegistrationData() {
		String[][] registerData=null;
		
		GetSheetData g=new GetSheetData("sheet1");
		Sheet s=g.getSheet();
		int row=g.getRow();
		int col=g.getColumn();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				registerData[i][j]=s.getRow(i).getCell(j).toString();
			}
		}

		return registerData;
		
	}
	
}
