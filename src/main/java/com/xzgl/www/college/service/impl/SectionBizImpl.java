package com.xzgl.www.college.service.impl;

import com.xzgl.www.college.dao.CourseDao;
import com.xzgl.www.college.dao.SectionDao;
import com.xzgl.www.college.dao.StaffDao;
import com.xzgl.www.college.dao.TimetableDao;
import com.xzgl.www.college.service.SectionBiz;
import com.xzgl.www.entity.Section;
import com.xzgl.www.entity.Staff;
import com.xzgl.www.entity.Timetable;
import com.xzgl.www.entity.custom.SectionCustom;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by c0de8ug on 16-2-12.
 */
@Service
public class SectionBizImpl implements SectionBiz {

    @Resource
    private SectionDao sectionDao;
    @Resource
    private CourseDao courseDao;
    @Resource
    private StaffDao staffDao;

    @Resource
    private TimetableDao timetableDao;

    @Transactional
    @Override
    public void delete(int secId) {
        sectionDao.delete(secId);
        timetableDao.delete(secId);
    }

    @Override
    public void add(Section section) {
        sectionDao.add(section);

    }

    @Override
    public List<SectionCustom> findAllCustom() {
        return sectionDao.findAllCustom();
    }

    @Override
    public List<String> findAllCourseTitle() {
        return courseDao.findAllCourseTitle();
    }


    @Override
    public List<Staff> findAllStaff() {
        return staffDao.findAll();
    }

    @Override
    public void addTimetable(Timetable timetable) {
        timetableDao.add(timetable);
    }


}
