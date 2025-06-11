package com.javaee.work.service;

import com.javaee.work.po.Author;

import java.util.List;

public interface AuthorService {
    List<Author> selectAllAuthors();
    void insertAuthor(Author author);
    void deleteAuthors(String[] lidArray);
    void updateAuthor(Author author);
    List<Author> selectAuthorStuByid(String id); // id参数类型与Controller保持一致
}