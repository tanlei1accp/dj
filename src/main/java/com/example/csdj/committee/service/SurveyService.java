package com.example.csdj.committee.service;

import com.example.csdj.committee.entity.Issue;
import com.example.csdj.committee.entity.Survey;
import com.example.csdj.committee.entity.Types;

import java.util.List;

public interface SurveyService {
    List<Survey> findSurvey();
    List<Types> findType();
    boolean addSurvey(Survey survey);
    List<Issue> findSurveyById(int id);
    boolean addIssue(Issue issue);

}
