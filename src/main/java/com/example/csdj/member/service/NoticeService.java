package com.example.csdj.member.service;

import com.example.csdj.member.entity.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> findAll();
    void addNotice(Notice notice);
    Notice findById(int id);
    void delById(Notice notice);
    void updById(Notice notice);
}
