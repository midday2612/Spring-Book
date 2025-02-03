package com.example.bookmanagement.repository;

import com.example.bookmanagement.model.BookImage;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookImageRepository extends JpaRepository<BookImage, Long> {
    List<BookImage> findByBookBookId(Long bookId);
}
