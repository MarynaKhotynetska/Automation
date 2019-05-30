package com.skillup.automation.Data;

import com.skillup.automation.utils.ExcelReader;
import org.testng.annotations.DataProvider;

import java.io.IOException;


public class ReadFromExcelprovider {

    @DataProvider(name = "dataLoginFromExcel")
    public Object[][] getData() throws IOException {
        ExcelReader excel = new ExcelReader("/Users/test/IdeaProjects/automation/positiveLoginData.xls");
        int columnSize = excel.getColumnSize();
        int rowSize = excel.getRowsSize() - 1;

        Object[][] data = new Object[rowSize][columnSize];
//
        for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
                data[rowIndex][columnIndex] = excel.getValue(rowIndex + 1, columnIndex);
            }
        }

        return data;
//        return null;
    }
}
