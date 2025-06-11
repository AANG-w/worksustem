package com.javaee.work.service;

import com.javaee.work.po.Category;

import java.util.List;

public interface CategoryService {
    List<Category> selectAllCategories();
    void insertCategory(Category category);
    void deleteCategories(String[] idArray); // 参数名与Controller一致
    void updateCategory(Category category);
    Category selectCategoryByid(Integer id);
}