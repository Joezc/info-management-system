package com.xzgl.www.myrecord.service.impl;

import java.util.List;

import com.xzgl.www.entity.Recordinformation;
import com.xzgl.www.mapper.RecordinformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzgl.www.myrecord.service.BussinessBiz;

@Service
public class BussinessBizImpl implements BussinessBiz{
	@Autowired
	RecordinformationMapper recordinformationMapper;

	@Override
	public void createBussiness(Recordinformation recordinformation) {
		recordinformationMapper.insert(recordinformation);
	}

	@Override
	public void updateBussiness(Recordinformation recordinformation) {
		recordinformationMapper.updateByPrimaryKey(recordinformation);
	}

	@Override
	public void deleteBussiness(String casenumber) {
		recordinformationMapper.deleteByPrimaryKey(casenumber);
	}

	@Override
	public Recordinformation findById(String casenumber) {
		return recordinformationMapper.selectByPrimaryKey(casenumber);
	}

	@Override
	public List<Recordinformation> findAll() {
		return recordinformationMapper.findAll();
	}
}
