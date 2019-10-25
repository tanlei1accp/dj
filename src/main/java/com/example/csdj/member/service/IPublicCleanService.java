package com.example.csdj.member.service;

import com.example.csdj.member.entity.PublicClean;

import java.util.List;

public interface IPublicCleanService {
    public List<PublicClean> findAllPublicClean();
    public int addPublicClean(PublicClean publicClean);
    public PublicClean findPublicCleanById(PublicClean publicClean);
    public int deletePublicCleanById(PublicClean publicClean);
    public int updatePublicCleanById(PublicClean publicClean);
    public int updatePublicCleanFlagById(PublicClean publicClean);
}
