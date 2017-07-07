package com.giit.www.myrecord.service.impl;

import com.giit.www.entity.Recordinformation;
import com.giit.www.entity.RecordinformationExample;
import com.giit.www.entity.Userinfo;
import com.giit.www.mapper.RecordinformationMapper;
import com.giit.www.myrecord.service.XzlevelBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lzc on 17-7-6.
 */
@Service
public class XzlevelBizImpl implements XzlevelBiz {
    @Autowired
    RecordinformationMapper recordinformationMapper;

    @Override
    public void createXzlevel(Userinfo XzlevelInfo) {

    }

    @Override
    public void updateXzlevel(Userinfo XzlevelInfo) {

    }

    @Override
    public void deleteXzlevel(Userinfo XzlevelInfo) {

    }

    @Override
    public void findByDescription(String description) {

    }

    @Override
    public List<Userinfo> findAll() {
        return null;
    }

    @Override
    public List<Integer> searchByTime(Date starttime, Date endtime) {
        List<Recordinformation> tmp = recordinformationMapper.findAll();

        List<Integer> ret = new ArrayList<>();

        RecordinformationExample example1 = new RecordinformationExample();
        example1.createCriteria().andRecordtimeBetween(starttime, endtime);
        int tot = recordinformationMapper.countByExample(example1);

        RecordinformationExample example2 = new RecordinformationExample();
        example2.createCriteria().andRecordtimeBetween(starttime, endtime)
                .andCurrentstauisEqualTo("Yes");
        int finished = recordinformationMapper.countByExample(example2);

        ret.add(finished);
        ret.add(tot);
        return ret;
    }
}
