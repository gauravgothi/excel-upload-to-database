package com.gaurav.exceluploadtodatabase.helper;

import com.gaurav.exceluploadtodatabase.entities.DBTList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DBTListHelper {

    //method check to file is excel or not
    public static boolean checkExcelFormat(MultipartFile file)    {

        String fileContent = file.getContentType();

        if (fileContent.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))    {
            return true;
        }else {
            return false;
        }
    }

    //method for converts excel to list
    public static List<DBTList> convertExcelToDBTList(InputStream inputStream)    {
        List<DBTList> lists = new ArrayList<>();

        try {

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet("DBT List");

            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext())  {
                Row row = iterator.next();
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }
                Iterator<Cell> cells = row.iterator();

                int cid=0;
                DBTList dbtList =new DBTList();
                while (cells.hasNext()) {

                    Cell cell = cells.next();
                    switch (cid)    {
                        case 0: dbtList.setLocationCode(cell.getStringCellValue()); break;
                        case 1: dbtList.setGroupNo(cell.getStringCellValue());  break;
                        case 2: dbtList.setDiaryNo(cell.getStringCellValue());  break;
                        case 3: dbtList.setServiceNo(cell.getStringCellValue());    break;
                        case 4: dbtList.setConsumerName(cell.getStringCellValue()); break;
                        case 5: dbtList.setConsumerAddress(cell.getStringCellValue());  break;
                        case 6: dbtList.setVillage(cell.getStringCellValue());  break;
                        case 7: dbtList.setMobileNo(cell.getStringCellValue()); break;
                        case 8: dbtList.setIVRS(cell.getStringCellValue()); break;
                        case 9: dbtList.seteCashAccountNo(cell.getStringCellValue());   break;
                        case 10: dbtList.setBillMonth(cell.getStringCellValue()); break;
                        case 11: dbtList.setCategory(cell.getStringCellValue());    break;
                        case 12: dbtList.setLoadInHP((int) cell.getNumericCellValue()); break;
                        case 13: dbtList.setSubsidy(cell.getNumericCellValue());    break;
                        case 14: dbtList.setFcaCharge(cell.getNumericCellValue());  break;
                        default: break;
                    }
                    cid++;
                }
                lists.add(dbtList);
            }

        }catch (Exception exception)    {
            exception.printStackTrace();
        }
        return lists;
    }

}
