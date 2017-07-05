package com.giit.www.myrecord.service;

import java.util.List;

import com.giit.www.entity.RecordInformation;

/**
 * Created by lzc on 17-7-1.
 */
public interface RecordBiz {

    public void createRecord(RecordInformation recordInfo);

    public void updateRecord(RecordInformation recordInfo);
    
    public void findByDescription(String description);

    public List<RecordInformation> findAll();

}