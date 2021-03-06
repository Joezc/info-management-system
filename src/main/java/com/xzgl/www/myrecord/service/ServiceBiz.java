package com.xzgl.www.myrecord.service;

import com.xzgl.www.entity.Serviceinformation;

import java.util.List;

/**
 * Created by Yyk on 17-7-5.
 * 业务信息增改 查
 * 
 */
public interface ServiceBiz {

    public void createService(Serviceinformation serviceinformation);
    
    public void updateService(Serviceinformation serviceinformation);
    
    public void deleteService(String bunumber);

    public Serviceinformation findById(String bunumber);

    public List<Serviceinformation> findAll();

    public List<Serviceinformation> findByType(String type);
}
