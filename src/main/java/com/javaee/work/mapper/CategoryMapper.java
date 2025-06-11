package com.javaee.work.mapper;

import com.javaee.work.po.Category;


import java.util.List;

public interface CategoryMapper {
    Category selectCategoryByid(Integer id); // id应为Integer，与Service一致
    void insertCategory(Category category);
    void deleteCategory(String id);
    void updateCategory(Category category);
    List<Category> selectAllCategories();
}