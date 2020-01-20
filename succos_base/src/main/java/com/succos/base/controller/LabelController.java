package com.succos.base.controller;

import com.succos.base.pojo.Label;
import com.succos.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@CrossOrigin
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true, StatusCode.OK,"查询成功",labelService.findAll());
    }
    @RequestMapping(value = "/{labelId}",method = RequestMethod.GET)
    public  Result findById(@PathVariable("labelId") String labelId){
        return new Result(true, StatusCode.OK,"查询成功",labelService.findById(labelId));
    }
    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody  Label label){
        labelService.save(label);
        return new Result(true, StatusCode.OK,"查询成功");
    }
}
