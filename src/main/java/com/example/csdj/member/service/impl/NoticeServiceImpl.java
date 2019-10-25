package com.example.csdj.member.service.impl;

import com.example.csdj.member.entity.Notice;
import com.example.csdj.member.mapper.NoticeMapper;
import com.example.csdj.member.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> findAll() {
        return null;
    }

    @Override
    public void addNotice(Notice notice) {

    }

    @Override
    public Notice findById(int id) {
        return null;
    }

    @Override
    public void delById(Notice notice) {

    }

    @Override
    public void updById(Notice notice) {

    }
}
