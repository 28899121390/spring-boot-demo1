package com.baizhi.controller;

import com.baizhi.entity.Category;
import com.baizhi.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    CategoryMapper categoryMapper;

    @ResponseBody
    @RequestMapping("/test")
    public Category test() {
        Category category = categoryMapper.selectByPrimaryKey(1);
        return category;
    }

    @RequestMapping("/test1")
    public String test1() {
        return "index";
    }
}
