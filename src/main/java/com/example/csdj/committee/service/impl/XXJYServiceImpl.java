package com.example.csdj.committee.service.impl;

import com.example.csdj.committee.entity.DocumentLearn;
import com.example.csdj.committee.mapper.XXJYMapper;
import com.example.csdj.committee.service.XXJYService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class XXJYServiceImpl implements XXJYService {

   @Autowired(required = false)
    private XXJYMapper xxjyMapper;

    @Override
    public List<DocumentLearn> findAll() {
        List<DocumentLearn> lsit=xxjyMapper.findAll();
        return lsit;
    }

    @Override
    public void add(DocumentLearn documentLearn) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();

        try {

            documentLearn.setCreatedate(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        documentLearn.setDeletetag(0);
        documentLearn.setDocustate(0);

        xxjyMapper.add(documentLearn);
    }

    @Override
    public DocumentLearn findById(int docuid) {

        DocumentLearn documentLearn= xxjyMapper.findById(docuid);
        return documentLearn;
    }

    @Override
    public void update(DocumentLearn documentLearn) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();

        try {


            documentLearn.setUpdatedate(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        } catch (ParseException e) {
            e.printStackTrace();
        }

       xxjyMapper.update(documentLearn);
    }

    @Override
    public void updateFabu(int docuid) {
        xxjyMapper.updateFabu(docuid);
    }

    @Override
    public void updateDel(int docuid) {
      xxjyMapper.updateDel(docuid);
    }

    @Override
    public void updateDelRe(int docuid) {
        xxjyMapper.updateDelRe(docuid);
    }

    @Override
    public void updateFbRe(int docuid) {
       xxjyMapper.updateFbRe(docuid);
    }
}
