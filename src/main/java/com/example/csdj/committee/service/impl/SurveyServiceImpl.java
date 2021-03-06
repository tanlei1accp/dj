package com.example.csdj.committee.service.impl;

import com.example.csdj.committee.entity.Issue;
import com.example.csdj.committee.entity.Survey;
import com.example.csdj.committee.entity.Types;
import com.example.csdj.committee.exception.CustomException;
import com.example.csdj.committee.mapper.SurveyMapper;
import com.example.csdj.committee.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SurveyServiceImpl implements SurveyService {
    @Autowired(required = false)
    private SurveyMapper surveyMapper;


    @Override
    public List<Survey> findSurvey() {
        return surveyMapper.findSurvey();
    }

    @Override
    public List<Types> findType() {
        return surveyMapper.findType();
    }

    @Override
    public int addSurvey(Survey survey) {
        int row= surveyMapper.addSurvey(survey);
        return row;
    }

    @Override
    public List<Issue> findSurveyById(int id) {
        return surveyMapper.findSurveyById(id);
    }

    @Override
    public int addIssue(Issue issue) {
        int row=surveyMapper.addIssue(issue);

        return row;
    }

}

