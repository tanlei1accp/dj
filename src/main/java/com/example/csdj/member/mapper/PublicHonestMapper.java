package com.example.csdj.member.mapper;

import com.example.csdj.member.entity.PublicHonest;
import com.example.csdj.member.entity.PublicPublicity;

import java.util.List;

public interface PublicHonestMapper {
    public List<PublicHonest> findAllPublicHonest();
    public int addPublicHonest(PublicHonest publicHonest);
    public PublicHonest findPublicHonestById(PublicHonest publicHonest);
    public int deletePublicHonestById(PublicHonest publicHonest);
    public int updatePublicHonestById(PublicHonest publicHonest);
    public int updatePublicHonestFlagById(PublicHonest publicHonest);
}
