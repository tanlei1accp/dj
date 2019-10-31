package com.example.csdj.member.service.impl;

import com.example.csdj.common.service.impl.BaseServiceImpl;
import com.example.csdj.member.entity.PublicClean;
import com.example.csdj.member.mapper.PublicCleanMapper;
import com.example.csdj.member.mapper.PublicPublicityMapper;
import com.example.csdj.member.service.IPublicCleanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicCleanServiceImp extends BaseServiceImpl implements IPublicCleanService {
    @Autowired
    PublicCleanMapper publicCleanMapper;
    @Override
    public List<PublicClean> findAllPublicClean() {
        return publicCleanMapper.findAllPublicClean();
    }

    @Override
    public int addPublicClean(PublicClean publicClean) {
        return publicCleanMapper.addPublicClean(publicClean);
    }

    @Override
    public PublicClean findPublicCleanById(PublicClean publicClean) {
        return publicCleanMapper.findPublicCleanById(publicClean);
    }

    @Override
    public int deletePublicCleanById(PublicClean publicClean) {
        return publicCleanMapper.deletePublicCleanById(publicClean);
    }

    @Override
    public int updatePublicCleanById(PublicClean publicClean) {
        return publicCleanMapper.updatePublicCleanById(publicClean);
    }

    @Override
    public int updatePublicCleanFlagById(PublicClean publicClean) {
        return publicCleanMapper.updatePublicCleanFlagById(publicClean);
    }
}
