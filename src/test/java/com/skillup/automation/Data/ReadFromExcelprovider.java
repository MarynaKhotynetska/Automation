package com.skillup.automation.Data;

import com.skillup.automation.utils.ExcelReader;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Paths.get;


public class ReadFromExcelprovider {

    @DataProvider(name = "dataLoginFromExcel")
    public Object[][] getData() throws IOException {
//пути спільні для різних ос
        String path = Paths.get(System.getProperty("user.dir"), "positiveLoginData.xls").toAbsolutePath().toString();
        //Paths.get("parentFolder", "childFolder", "grandChildFolder").toAbsolutePath().toString();

        ExcelReader excel = new ExcelReader("/Users/test/IdeaProjects/automation/positiveLoginData.xls");
        int columnSize = excel.getColumnSize();
        int rowSize = excel.getRowsSize() - 1;

        Object[][] data = new Object[rowSize][columnSize];

        for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
                data[rowIndex][columnIndex] = excel.getValue(rowIndex + 1, columnIndex);
            }
        }

        return data;
    }

//    public static void main (String [] args) {
//        String path = Paths.get(System.getProperty("user.dir"), "positiveLoginData.xls").toAbsolutePath().toString();
//
//        System.out.println(path);
    }

