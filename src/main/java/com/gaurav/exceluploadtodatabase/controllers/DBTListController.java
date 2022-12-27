package com.gaurav.exceluploadtodatabase.controllers;

import com.gaurav.exceluploadtodatabase.entities.DBTList;
import com.gaurav.exceluploadtodatabase.helper.DBTListHelper;
import com.gaurav.exceluploadtodatabase.services.DBTListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class DBTListController {
    @Autowired
    private DBTListService dbtListService;

    @PostMapping("/DBTList/upload")
    public ResponseEntity<?> upload(@RequestParam("file")MultipartFile file)    {
        if(DBTListHelper.checkExcelFormat(file))    {
                this.dbtListService.save(file);
                return ResponseEntity.ok(Map.of("message","file is uploaded.."));
        }else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please provide valid file format..");
    }

    @GetMapping("/DBTList")
    public List<DBTList> getAllDBTList()    {
        return this.dbtListService.getAllRecords();
    }

}
