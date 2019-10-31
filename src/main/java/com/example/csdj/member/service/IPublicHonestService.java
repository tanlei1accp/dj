package com.example.csdj.member.service;

import com.example.csdj.member.entity.PublicHonest;

import java.util.List;

public interface IPublicHonestService {
    public List<PublicHonest> findAllPublicHonest();
    public int addPublicHonest(PublicHonest publicHonest);
    public PublicHonest findPublicHonestById(PublicHonest publicHonest);
    public int deletePublicHonestById(PublicHonest publicHonest);
    public int updatePublicHonestById(PublicHonest publicHonest);
    public int updatePublicHonestFlagById(PublicHonest publicHonest);
}
