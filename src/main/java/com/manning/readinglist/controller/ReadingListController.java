package com.manning.readinglist.controller;

import com.manning.readinglist.dao.ReadingListRepository;
import com.manning.readinglist.entity.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(tags="用户管理")
@RestController
public class ReadingListController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ReadingListRepository readingListRepository;

    @ApiOperation("新增书本")
    @GetMapping("/books/{id}")
    public Book add(@ApiParam(value = "书本号") @PathVariable String id){
        return  readingListRepository.findByReader("wo tou");
    }

}
