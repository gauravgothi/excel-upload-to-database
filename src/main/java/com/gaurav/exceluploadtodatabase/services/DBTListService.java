package com.gaurav.exceluploadtodatabase.services;

import com.gaurav.exceluploadtodatabase.entities.DBTList;
import com.gaurav.exceluploadtodatabase.helper.DBTListHelper;
import com.gaurav.exceluploadtodatabase.repository.DBTListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class DBTListService {

    @Autowired
    private DBTListRepo dbtListRepo;

    public void save(MultipartFile file) {

        try {
           List<DBTList> records = DBTListHelper.convertExcelToDBTList(file.getInputStream());
           this.dbtListRepo.saveAll(records);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<DBTList> getAllRecords()   {
        return this.dbtListRepo.findAll();
    }
}
