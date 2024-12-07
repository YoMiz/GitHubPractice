package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.JournalClass;

@Mapper
public interface JournalMapper {
    List<JournalClass> journalList()throws Exception; 
    JournalClass getAJournal(Integer userId)throws Exception;
}
