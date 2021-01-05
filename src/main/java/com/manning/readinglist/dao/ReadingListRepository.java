package com.manning.readinglist.dao;

import com.manning.readinglist.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Integer> {
    List<Book> findByReader(String reader);
}
