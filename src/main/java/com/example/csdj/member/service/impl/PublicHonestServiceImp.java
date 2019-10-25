package com.example.csdj.member.service.impl;

import com.example.csdj.common.service.impl.BaseServiceImpl;
import com.example.csdj.member.entity.PublicHonest;
import com.example.csdj.member.mapper.PublicHonestMapper;

import com.example.csdj.member.service.IPublicHonestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicHonestServiceImp extends BaseServiceImpl implements IPublicHonestService {
    @Autowired
    PublicHonestMapper publicHonestMapper;

    @Override
    public List<PublicHonest> findAllPublicHonest() {
        return publicHonestMapper.findAllPublicHonest();
    }

    @Override
    public int addPublicHonest(PublicHonest publicHonest) {
        return publicHonestMapper.addPublicHonest(publicHonest);
    }

    @Override
    public PublicHonest findPublicHonestById(PublicHonest publicHonest) {
        return publicHonestMapper.findPublicHonestById(publicHonest);
    }

    @Override
    public int deletePublicHonestById(PublicHonest publicHonest) {
        return publicHonestMapper.deletePublicHonestById(publicHonest);
    }

    @Override
    public int updatePublicHonestById(PublicHonest publicHonest) {
        return publicHonestMapper.updatePublicHonestById(publicHonest);
    }

    @Override
    public int updatePublicHonestFlagById(PublicHonest publicHonest) {
        return publicHonestMapper.updatePublicHonestFlagById(publicHonest);
    }
}
