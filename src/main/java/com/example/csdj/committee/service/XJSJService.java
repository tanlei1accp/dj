package com.example.csdj.committee.service;

import com.example.csdj.committee.entity.MeritorDeed;

import java.util.List;

public interface XJSJService {

    List<MeritorDeed> findAll();

    void updateDeedFbRe(int deedid);

    void updateDeedFabu(int deedid);

    void updateDeedDelRe(int deedid);

    void updateDeedDel(int deedid);

    MeritorDeed findByDeedId(int deedid);

    void update(MeritorDeed meritorDeed);

    void add(MeritorDeed meritorDeed);

    List<MeritorDeed> findByNdYb();
}
