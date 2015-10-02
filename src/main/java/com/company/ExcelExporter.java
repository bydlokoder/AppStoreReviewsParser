package com.company;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

public class ExcelExporter {

    private static final String VERSION_COLUMN = "Version";
    private static final String RATE_COLUMN = "Rate";
    private static final String TITLE_COLUMN = "Title";
    private static final String REVIEW_COLUMN = "Review";
    private static final String DATE_COLUMN = "Date";
    private static final String COUNTRY_COLUMN = "Country";
    private static final String DATE_FORMAT = "m/d/yy";

    public static void export(long appId, Collection<Review> reviewList) {
        String excelFileName = "reviews.xlsx";//name of excel file
        String sheetName = Long.toString(appId);//name of sheet

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet(sheetName);
        CellStyle cellStyle = wb.createCellStyle();
        CreationHelper createHelper = wb.getCreationHelper();
        cellStyle.setDataFormat(
                createHelper.createDataFormat().getFormat(DATE_FORMAT));

        createFirstRow(sheet);
        int r = 1;
        //iterating r number of rows
        for (Review review : reviewList) {
            XSSFRow row = sheet.createRow(r);

            row.createCell(0).setCellValue(review.getVersion());
            row.createCell(1).setCellValue(review.getRate());
            row.createCell(2).setCellValue(review.getTitle());
            row.createCell(3).setCellValue(review.getBody());

            XSSFCell dateCell = row.createCell(4);
            dateCell.setCellValue(review.getDate());
            dateCell.setCellStyle(cellStyle);

            row.createCell(5).setCellValue(review.getCountry().getName());
            r++;
        }
        try (FileOutputStream fileOut = new FileOutputStream(excelFileName)) {
            //write this workbook to an Outputstream.
            wb.write(fileOut);
            fileOut.flush();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFirstRow(XSSFSheet sheet) {
        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue(VERSION_COLUMN);
        row.createCell(1).setCellValue(RATE_COLUMN);
        row.createCell(2).setCellValue(TITLE_COLUMN);
        row.createCell(3).setCellValue(REVIEW_COLUMN);
        row.createCell(4).setCellValue(DATE_COLUMN);
        row.createCell(5).setCellValue(COUNTRY_COLUMN);
    }
}
