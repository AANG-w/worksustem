package com.javaee.work.mapper;

import com.javaee.work.po.Author;

import java.util.List;

public interface AuthorMapper {
    List<Author> selectAllAuthors();
    void insertAuthor(Author author);
    void deleteAuthor(String id);
    void updateAuthor(Author author);
    List<Author> selectAuthorStuByid(String id); // 参数类型应为String，与Service一致
}