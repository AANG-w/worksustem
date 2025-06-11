package com.javaee.work.controller;

import com.javaee.work.po.Author;
import com.javaee.work.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/to_authorlist")
    public String authorList(Model model) {
        List<Author> list = authorService.selectAllAuthors();
        model.addAttribute("authorlist", list);
        return "author/authorlist";
    }

    @PostMapping("/authordelete")
    public String authorDelete(@RequestParam("lidArray") String[] lidArray) {
        if (lidArray != null && lidArray.length > 0)
            authorService.deleteAuthors(lidArray);
        return "redirect:/to_authorlist";
    }

    @GetMapping("/authorpreinsert")
    public String authorPreinsert(Model model) {
        List<Author> list = authorService.selectAllAuthors();
        model.addAttribute("authorlist", list);
        return "author/authoradd";
    }

    @PostMapping("/authorinsert")
    public String authorInsert(Author author) {
        authorService.insertAuthor(author);
        return "redirect:/to_authorlist";
    }

    @GetMapping("/authorpreupdate")
    public String authorPreupdate(@RequestParam("id") String id, Model model) {
        // 一般从数据库取对象
        List<Author> list = authorService.selectAuthorStuByid(id);
        if (!list.isEmpty()) {
            model.addAttribute("author", list.get(0));
        }
        return "author/authorupdate";
    }

    @PostMapping("/authorupdate")
    public String authorUpdate(Author author) {
        authorService.updateAuthor(author);
        return "redirect:/to_authorlist";
    }

    @PostMapping("/add_author")
    @ResponseBody
    public String addauthor() {
        return "OK";
    }
    @GetMapping("/categoryselect")
    public String authorselect(String id, Model model) {
        List<Author> list = authorService.selectAuthorStuByid(id);
        model.addAttribute("author", list);
        return "category/categoryselect";
    }
}
