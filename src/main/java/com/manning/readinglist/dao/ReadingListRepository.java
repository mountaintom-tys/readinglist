package com.manning.readinglist.dao;

import com.manning.readinglist.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRepository extends JpaRepository<Book,Long> {
    Book findByReader(String reader);
}
