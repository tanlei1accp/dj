package com.example.csdj.member.service;

import com.example.csdj.member.entity.PublicPublicity;

import java.util.List;

public interface IPublicPublicityService {
    public List<PublicPublicity> findAllPublicPublicity();
    public int addPublicPublicity(PublicPublicity publicPublicity);
    public PublicPublicity findPublicPublicityById(PublicPublicity publicPublicity);
    public int deletePublicPublicityById(PublicPublicity publicPublicity);
    public int updatePublicPublicityById(PublicPublicity publicPublicity);
    public int updatePublicPublicityFlagById(PublicPublicity publicPublicity);
}
