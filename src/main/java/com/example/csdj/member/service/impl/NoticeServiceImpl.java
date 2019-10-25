package com.example.csdj.member.service.impl;

import com.example.csdj.common.service.impl.BaseServiceImpl;
import com.example.csdj.member.entity.Notice;
import com.example.csdj.member.mapper.NoticeMapper;
import com.example.csdj.member.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> findAll() {
        return noticeMapper.findAll();
    }

    @Override
    public void addNotice(Notice notice) {
        noticeMapper.addNotice(notice);
    }

    @Override
    public Notice findById(int id) {
        return noticeMapper.findById(id);
    }

    @Override
    public void delById(Notice notice) {
        noticeMapper.delById(notice);
    }

    @Override
    public void updById(Notice notice) {
        noticeMapper.updById(notice);
    }
}
