package com.Helper.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Helper.Model.Log;
import com.Helper.Repository.LogRepository;

@Service
public class LogServiceLogic {
    @Autowired
    LogRepository logRepository;

    //getting all Log records
    public List <Log> getAllLog() {
        List <Log> logs = new ArrayList <Log>();
        logRepository.findAll().forEach(Log -> logs.add(Log));
        return logs;
    }

    //getting a specific log
    public Log GetLogById(int id) {
        return logRepository.findById(id).get();
    }

    public void SaveLog(String string) {
        Log log = new Log(string);
        logRepository.save(log);
    }

    public void SaveLog(String string, String string2) {
        Log log = new Log(string, string2);
        logRepository.save(log);
    }


}