package com.example.csdj.committee.service.impl;

import com.example.csdj.committee.entity.PioneerColumn;
import com.example.csdj.committee.mapper.XFZLMapper;
import com.example.csdj.committee.service.XFZLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class XFZLServiceImpl implements XFZLService {

    @Autowired(required = false)
    private XFZLMapper xfzlMapper;

    @Override
    public List<PioneerColumn> findAll() {
        List<PioneerColumn> list=xfzlMapper.findAll();

        return list;
    }

    @Override
    public PioneerColumn findByPionId(int pioneerid) {
        PioneerColumn pioneerColumn= xfzlMapper.findByPionId(pioneerid);

        return pioneerColumn;
    }

    @Override
    public void save(PioneerColumn pioneerColumn) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();

        try {

            pioneerColumn.setCreatetime(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        pioneerColumn.setDeletetag(0);
        pioneerColumn.setPioneerstate(0);

        xfzlMapper.save(pioneerColumn);
    }

    @Override
    public void pioneerUpdate(PioneerColumn pioneerColumn) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();

        try {

            pioneerColumn.setUpdatetime(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        xfzlMapper.pioneerUpdate(pioneerColumn);
    }

    @Override
    public void updatePionDel(int pioneerid) {
        xfzlMapper.updatePionDel(pioneerid);
    }

    @Override
    public void updatePionDelRe(int pioneerid) {
        xfzlMapper.updatePionDelRe(pioneerid);
    }

    @Override
    public void updatePionFabu(int pioneerid) {
        xfzlMapper.updatePionFabu(pioneerid);
    }

    @Override
    public void updatePionFbRe(int pioneerid) {
       xfzlMapper.updatePionFbRe(pioneerid);
    }

    @Override
    public List<PioneerColumn> findByNdYb() {

        List<PioneerColumn> list= xfzlMapper.findByNdYb();
        return list;
    }
}
