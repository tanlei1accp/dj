package com.example.csdj.member.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.entity.PublicClean;
import com.example.csdj.member.entity.PublicHonest;
import com.example.csdj.member.entity.PublicPublicity;
import com.example.csdj.member.service.IPublicCleanService;
import com.example.csdj.member.service.IPublicHonestService;
import com.example.csdj.member.service.IPublicPublicityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 党务公开（谢春媛）
 */
@Controller
public class PublicController extends BaseController {
    @Autowired
    IPublicPublicityService publicPublicityService;
    @Autowired
    IPublicHonestService publicHonestService;
    @Autowired
    IPublicCleanService publicCleanService;

    /**
     * 党内公示
     */
    //添加党内公示
    @PostMapping("addPublicPublicity")
    public String addPublicPublicity(PublicPublicity publicPublicity) throws Exception{
        int result = publicPublicityService.addPublicPublicity(publicPublicity);
        return dealSuccessResutl("添加成功", result);
    }
    //查询所有党内公示
    @PostMapping("findAllPublicPublicity")
    public String findAllPublicPublicity(){
        List<PublicPublicity> list = publicPublicityService.findAllPublicPublicity();
        return dealQueryResult(list, list);
    }
    //根据主键id查询某个党内公示详细信息
    @PostMapping("findPublicPublicityById")
    public String findPublicPublicityById(PublicPublicity publicPublicity){
        PublicPublicity result = publicPublicityService.findPublicPublicityById(publicPublicity);
        return dealQueryResult(result, result);
    }
    //根据主键id删除某个党内公示（修改删除标记）
    @PostMapping("deletePublicPublicityById")
    public String deletePublicPublicityById(PublicPublicity publicPublicity){
        int result = publicPublicityService.deletePublicPublicityById(publicPublicity);
        return dealSuccessResutl("删除成功", result);
    }
    //根据主键id修改某个党内公示标题、内容、修改者、修改时间
    @PostMapping("updatePublicPublicityById")
    public String updatePublicPublicityById(PublicPublicity publicPublicity){
        int result = publicPublicityService.updatePublicPublicityById(publicPublicity);
        return dealSuccessResutl("修改成功", result);
    }
    //根据主键id修改某个党内公示发布状态、发布时间
    @PostMapping("updatePublicPublicityFlagById")
    public String updatePublicPublicityFlagById(PublicPublicity publicPublicity){
        int result = publicPublicityService.updatePublicPublicityFlagById(publicPublicity);
        return dealSuccessResutl("修改成功", result);
    }



    /**
     * 党风廉政
     */
    //添加党风廉政
    @PostMapping("addPublicHonest")
    public String addPublicHonest(PublicHonest publicHonest) throws Exception{
        int result = publicHonestService.addPublicHonest(publicHonest);
        return dealSuccessResutl("添加成功", result);
    }
    //查询所有党风廉政
    @PostMapping("findAllPublicHonest")
    public String findAllPublicHonest(){
        List<PublicHonest> list = publicHonestService.findAllPublicHonest();
        return dealQueryResult(list, list);
    }
    //根据主键id查询某个党风廉政详细信息
    @PostMapping("findPublicHonestById")
    public String findPublicHonestById(PublicHonest publicHonest){
        PublicHonest result = publicHonestService.findPublicHonestById(publicHonest);
        return dealQueryResult(result, result);
    }
    //根据主键id删除某个党风廉政（修改删除标记）
    @PostMapping("deletePublicHonestById")
    public String deletePublicHonestById(PublicHonest publicHonest){
        int result = publicHonestService.deletePublicHonestById(publicHonest);
        return dealSuccessResutl("删除成功", result);
    }
    //根据主键id修改某个党风廉政标题、内容、修改者、修改时间
    @PostMapping("updatePublicHonestById")
    public String updatePublicHonestById(PublicHonest publicHonest){
        int result = publicHonestService.updatePublicHonestById(publicHonest);
        return dealSuccessResutl("修改成功", result);
    }
    //根据主键id修改某个党风廉政发布状态、发布时间
    @PostMapping("updatePublicHonestFlagById")
    public String updatePublicHonestFlagById(PublicHonest publicHonest){
        int result = publicHonestService.updatePublicHonestFlagById(publicHonest);
        return dealSuccessResutl("修改成功", result);
    }



    /**
     * 反腐倡廉
     */
    //添加反腐倡廉
    @PostMapping("addPublicClean")
    public String addPublicClean(PublicClean publicClean) throws Exception{
        int result = publicCleanService.addPublicClean(publicClean);
        return dealSuccessResutl("添加成功", result);
    }
    //查询所有反腐倡廉
    @PostMapping("findAllPublicClean")
    public String findAllPublicClean(){
        List<PublicClean> list = publicCleanService.findAllPublicClean();
        return dealQueryResult(list, list);
    }
    //根据主键id查询某个反腐倡廉详细信息
    @PostMapping("findPublicCleanById")
    public String findPublicCleanById(PublicClean publicClean){
        PublicClean result = publicCleanService.findPublicCleanById(publicClean);
        return dealQueryResult(result, result);
    }
    //根据主键id删除某个反腐倡廉（修改删除标记）
    @PostMapping("deletePublicCleanById")
    public String deletePublicCleanById(PublicClean publicClean) throws Exception{
        int result = publicCleanService.deletePublicCleanById(publicClean);
        return dealSuccessResutl("删除成功", result);
    }
    //根据主键id修改某个反腐倡廉标题、内容、修改者、修改时间
    @PostMapping("updatePublicCleanById")
    public String updatePublicCleanById(PublicClean publicClean) throws Exception{
        int result = publicCleanService.updatePublicCleanById(publicClean);
        return dealSuccessResutl("修改成功", result);
    }
    //根据主键id修改某个反腐倡廉发布状态、发布时间
    @PostMapping("updatePublicCleanFlagById")
    public String updatePublicCleanFlagById(PublicClean publicClean) throws Exception{
        int result = publicCleanService.updatePublicCleanFlagById(publicClean);
        return dealSuccessResutl("修改成功", result);
    }
}
