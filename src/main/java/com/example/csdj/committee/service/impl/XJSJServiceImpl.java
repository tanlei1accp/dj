package com.example.csdj.committee.service.impl;

import com.example.csdj.committee.entity.MeritorDeed;
import com.example.csdj.committee.mapper.XJSJMapper;
import com.example.csdj.committee.service.XJSJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class XJSJServiceImpl implements XJSJService {

    @Autowired(required = false)
    private XJSJMapper xjsjMapper;

    @Override
    public List<MeritorDeed> findAll() {
        List<MeritorDeed> list=xjsjMapper.findAll();
        return list;
    }

    @Override
    public void updateDeedFbRe(int deedid) {
       xjsjMapper.updateDeedFbRe(deedid);
    }

    @Override
    public void updateDeedFabu(int deedid) {
        xjsjMapper.updateDeedFabu(deedid);
    }

    @Override
    public void updateDeedDelRe(int deedid) {
       xjsjMapper.updateDeedDelRe(deedid);
    }

    @Override
    public void updateDeedDel(int deedid) {
       xjsjMapper.updateDeedDel(deedid);
    }

    @Override
    public MeritorDeed findByDeedId(int deedid) {
        MeritorDeed s=xjsjMapper.findByDeedId(deedid);
        return s;
    }

    @Override
    public void update(MeritorDeed meritorDeed) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();

        try {
            meritorDeed.setUpdatetime(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        xjsjMapper.update(meritorDeed);
    }

    @Override
    public void add(MeritorDeed meritorDeed) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();

        try {
            meritorDeed.setCreatetime(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        meritorDeed.setDeedstate(0);
        meritorDeed.setDeleteflag(0);

         xjsjMapper.add(meritorDeed);
    }
}
