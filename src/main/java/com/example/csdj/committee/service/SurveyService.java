package com.example.csdj.committee.service;

import com.example.csdj.committee.entity.Issue;
import com.example.csdj.committee.entity.Survey;
import com.example.csdj.committee.entity.Types;

import java.util.List;

public interface SurveyService {
    List<Survey> findSurvey();
    List<Types> findType();
    int addSurvey(Survey survey);
    List<Issue> findSurveyById(int id);
    int addIssue(Issue issue);

}
