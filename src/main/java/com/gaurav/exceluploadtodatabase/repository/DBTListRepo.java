package com.gaurav.exceluploadtodatabase.repository;

import com.gaurav.exceluploadtodatabase.entities.DBTList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DBTListRepo extends JpaRepository<DBTList,Long> {

    public List<DBTList> findDBTListByLocationCode(String locationCode);

    public List<DBTList> findDBTListByServiceNo(String locationCode);


}
