package com.javaee.work.controller;

import com.javaee.work.po.Work;
import com.javaee.work.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class WorkController {
    @Autowired
    private WorkService workService;

    @GetMapping("/to_worklist")
    public String workList(Model model) {
        List<Work> list = workService.selectAllWorks();
        model.addAttribute("worklist", list);
        return "work/worklist";
    }

    @PostMapping("/workdelete")
    public String workDelete(@RequestParam("idArray") String[] idArray) {
        if (idArray != null && idArray.length > 0)
            workService.deleteWorks(idArray);
        return "redirect:/to_worklist";
    }

    @GetMapping("/workpreinsert")
    public String workPreinsert(Model model) {
        List<Work> list = workService.selectAllWorks();
        model.addAttribute("worklist", list);
        return "work/workadd";
    }

    @PostMapping("/workinsert")
    public String workInsert(Work work) {
        workService.insertWork(work);
        return "redirect:/to_worklist";
    }

    @GetMapping("/workpreupdate")
    public String workPreupdate(@RequestParam("id") Integer id, Model model) {
        // 假设有getWorkById方法
        // Work work = workService.getWorkById(id);
        // model.addAttribute("work", work);
        // return "work/workupdate";
        // 这里先仅做示例
        return "work/workupdate";
    }

    @PostMapping("/workupdate")
    public String workUpdate(Work work) {
        workService.updateWork(work);
        return "redirect:/to_worklist";
    }

    @PostMapping("/add_work")
    @ResponseBody
    public String addWork() {
        return "OK";
    }
}