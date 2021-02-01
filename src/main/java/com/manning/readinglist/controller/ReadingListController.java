package com.manning.readinglist.controller;

import com.manning.readinglist.dao.ReadingListRepository;
import com.manning.readinglist.entity.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(tags="书本管理")
@Controller
@RequestMapping("/books")
public class ReadingListController {

    @Autowired
    private ReadingListRepository readingListRepository;


    @ApiOperation("通过读者查询books")
    @GetMapping("/{reader}")
    public String get(@PathVariable(name = "reader") String reader, Model model){
        List<Book> bookList = readingListRepository.findByReader(reader);
        if(bookList!=null){
            model.addAttribute("books",bookList);
        }
        return "readingList";
    }

    @ApiOperation("添加book")
    @PostMapping("/{reader}")
    public String addToReadingList(@PathVariable(name = "reader") String reader,Book book){
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/books/{reader}";
    }

    public static void main(String[] args) {
        String solrQuery = String.format("partNo:\"%s\"", 123l);
        System.out.println(solrQuery);
    }
}
