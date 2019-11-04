package com.example.csdj.committee.service;

import com.example.csdj.committee.entity.PioneerColumn;

import java.util.List;

public interface XFZLService {
    List<PioneerColumn> findAll();

    PioneerColumn findByPionId(int pioneerid);

    void save(PioneerColumn pioneerColumn);

    void pioneerUpdate(PioneerColumn pioneerColumn);

    void updatePionDel(int pioneerid);

    void updatePionDelRe(int pioneerid);

    void updatePionFabu(int pioneerid);

    void updatePionFbRe(int pioneerid);
}
