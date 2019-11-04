package com.example.csdj.committee.mapper;

import com.example.csdj.committee.entity.MeritorDeed;

import java.util.List;

public interface XJSJMapper {


    List<MeritorDeed> findAll();

    MeritorDeed findByDeedId(int deedid);

    void add(MeritorDeed meritorDeed);

    void updateDeedFabu(int deedid);

    void updateDeedFbRe(int deedid);

    void updateDeedDelRe(int deedid);

    void updateDeedDel(int deedid);

    void update(MeritorDeed meritorDeed);
}
