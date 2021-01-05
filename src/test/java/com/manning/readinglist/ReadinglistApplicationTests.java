package com.manning.readinglist;

import com.manning.readinglist.dao.ReadingListRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReadinglistApplicationTests {
    @Autowired
    private ReadingListRepository readingListRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void test(){
        String t="1,2,3,";
        t=t.substring(0,t.lastIndexOf(","));
        System.out.println(t);
    }

}
