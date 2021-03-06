package com.xzgl.www.college.dao;

import com.xzgl.www.entity.OrderBook;
import com.xzgl.www.entity.custom.AddedBookVo;
import com.xzgl.www.entity.custom.OrderBookReviewVo;
import com.xzgl.www.entity.custom.ReviewedBookVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by c0de8ug on 16-2-13.
 */
public interface OrderBookDao {
    public void add(OrderBook orderBook);

    public List<AddedBookVo> findAddedBookInfoList(String staffId);

    public int usedByOtherSec(@Param("bookTitle") String bookTitle, @Param("isbn") String isbn, @Param("secId") int secId);

    public void delete(@Param("secId") int secId, @Param("bookTitle") String bookTitle, @Param("isbn") String isbn);

    public List<OrderBookReviewVo> findAllNotReviewedBook();

    public void audit(@Param("secId") int secId, @Param("bookTitle") String bookTitle, @Param("isbn") String isbn);

    public List<ReviewedBookVo> findAllReviewedBook();
}
