package com.example.csdj.member.mapper;

import com.example.csdj.member.entity.Notice;

import java.util.List;

public interface NoticeMapper {
    List<Notice> findAll();
    void addNotice(Notice notice);
    Notice findById(int id);
    void delById(Notice notice);
    void updById(Notice notice);
}
