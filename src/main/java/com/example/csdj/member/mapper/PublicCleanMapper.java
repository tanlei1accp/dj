package com.example.csdj.member.mapper;

import com.example.csdj.member.entity.PublicClean;
import com.example.csdj.member.entity.PublicHonest;

import java.util.List;

public interface PublicCleanMapper {
    public List<PublicClean> findAllPublicClean();
    public int addPublicClean(PublicClean publicClean);
    public PublicClean findPublicCleanById(PublicClean publicClean);
    public int deletePublicCleanById(PublicClean publicClean);
    public int updatePublicCleanById(PublicClean publicClean);
    public int updatePublicCleanFlagById(PublicClean publicClean);
}
