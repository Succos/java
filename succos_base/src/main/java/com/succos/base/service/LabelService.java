package com.succos.base.service;

import com.succos.base.dao.LabelDao;
import com.succos.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LabelService {
    @Autowired
    private LabelDao labelDao;

    public List<Label> findAll(){
        return  labelDao.findAll();
    }
    public Label findById(String id){
        return labelDao.findById(id).get();
    }
    public void save(Label label){
        label.setId("1215555sdsds");
        labelDao.save(label);
    }
}
