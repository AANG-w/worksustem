package com.javaee.work.service;

import com.javaee.work.po.Work;

import java.util.List;

public interface WorkService {
     List<Work> selectAllWorks();
    void insertWork(Work work);
    void deleteWorks(String[] idArray);
    void updateWork(Work work);
}
