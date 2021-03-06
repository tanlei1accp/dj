package com.example.csdj.committee.mapper;

import com.example.csdj.committee.entity.DocumentLearn;

import java.util.List;

public interface XXJYMapper {
    List<DocumentLearn> findAll();

    void add(DocumentLearn documentLearn);

    DocumentLearn findById(int docuid);

    void update(DocumentLearn documentLearn);

    void updateFabu(int docuid);

    void updateDel(int docuid);

    void updateDelRe(int docuid);

    void updateFbRe(int docuid);

    List<DocumentLearn> findByNdYb();
}
