package com.Helper.WebController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Helper.Model.Log;
import com.Helper.Service.LogServiceLogic;

@RestController
public class LogsController {
    //auto wired the LogService class
    @Autowired
    LogServiceLogic logService;

    @GetMapping("")
    public String index() {
        logService.SaveLog("/");
        return "Mper Devops Home Page";
    }

    //creating a get mapping that retrieves all the Logs detail from the database
    @GetMapping("/logs")
    private List<Log> getAllLog() {
        logService.SaveLog("/logs");
        return logService.getAllLog();
    }

    @GetMapping("/create-transaction")
    private String transaction() {
        logService.SaveLog("/create-transaction");
        return "You Just Created a Transactions";
    }
}
