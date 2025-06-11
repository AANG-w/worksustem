package com.javaee.work.mapper;

import com.javaee.work.po.Work;

import java.util.List;

public interface WorkMapper {
    List<Work> selectWorks();
    void insertWork(Work work);
    void deleteWork(String id);
    void updateWork(Work work);
}
