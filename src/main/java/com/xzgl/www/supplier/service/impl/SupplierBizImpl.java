package com.xzgl.www.supplier.service.impl;

import com.xzgl.www.college.dao.OrderBookDao;
import com.xzgl.www.entity.custom.ReviewedBookVo;
import com.xzgl.www.supplier.service.SupplierBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by c0de8ug on 16-2-16.
 */
@Service
public class SupplierBizImpl implements SupplierBiz {

    @Resource
    private OrderBookDao orderBookDao;


    //TODO 这个代码偷懒了！！！！！要多烂有多烂直接拷贝的。。
    public List<ReviewedBookVo> findAllReviewedBook() {
        List<ReviewedBookVo> reviewedBookVoList = orderBookDao.findAllReviewedBook();
        return reviewedBookVoList;
    }

}
