package com.javaee.work.controller;

import com.javaee.work.po.Category;
import com.javaee.work.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/to_categorylist")
    public String CategoryList(Model model) {
        List<Category> list = categoryService.selectAllCategories();
        model.addAttribute("categorylist", list);
        return "category/categorylist";
    }

    @PostMapping("/categorydelete")
    public String CategoryDelete(@RequestParam("idArray") String[] idArray) {
        if (idArray != null && idArray.length > 0)
            categoryService.deleteCategories(idArray);
        return "redirect:/to_categorylist";
    }

    @GetMapping("/categorypreinsert")
    public String categoryPreinsert(Model model) {
        List<Category> list = categoryService.selectAllCategories();
        model.addAttribute("categorylist", list);
        return "category/categoryadd";
    }

    @PostMapping("/categoryinsert")
    public String categoryInsert(Category category) {
        categoryService.insertCategory(category);
        return "redirect:/to_categorylist";
    }

    @GetMapping("/categorypreupdate")
    public String categoryPreupdate(@RequestParam("id") Integer id, Model model) {
        Category category = categoryService.selectCategoryByid(id);
        model.addAttribute("category", category);
        return "category/categoryupdate";
    }

    @PostMapping("/categoryupdate")
    public String categoryUpdate(Category category) {
        categoryService.updateCategory(category);
        return "redirect:/to_categorylist";
    }
}