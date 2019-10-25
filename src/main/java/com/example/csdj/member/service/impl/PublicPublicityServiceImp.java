package com.example.csdj.member.service.impl;

import com.example.csdj.common.service.impl.BaseServiceImpl;
import com.example.csdj.member.entity.PublicPublicity;
import com.example.csdj.member.mapper.PublicPublicityMapper;
import com.example.csdj.member.service.IPublicPublicityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicPublicityServiceImp extends BaseServiceImpl implements IPublicPublicityService {

    @Autowired
    PublicPublicityMapper publicPublicityMapper;
    @Override
    public List<PublicPublicity> findAllPublicPublicity() {
        return publicPublicityMapper.findAllPublicPublicity();
    }

    @Override
    public int addPublicPublicity(PublicPublicity publicPublicity) {
       return  publicPublicityMapper.addPublicPublicity(publicPublicity);
    }

    @Override
    public PublicPublicity findPublicPublicityById(PublicPublicity publicPublicity) {
        return publicPublicityMapper.findPublicPublicityById(publicPublicity);
    }

    @Override
    public int deletePublicPublicityById(PublicPublicity publicPublicity) {
        return publicPublicityMapper.deletePublicPublicityById(publicPublicity);
    }

    @Override
    public int updatePublicPublicityById(PublicPublicity publicPublicity) {
        return publicPublicityMapper.updatePublicPublicityById(publicPublicity);
    }

    @Override
    public int updatePublicPublicityFlagById(PublicPublicity publicPublicity) {
        return publicPublicityMapper.updatePublicPublicityFlagById(publicPublicity);
    }
}
