package com.Helper.WebController;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Helper.Service.LogServiceLogic;

@Configuration
public class H2 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private LogServiceLogic logService;
    private static final Logger LOG = Logger.getLogger(H2.class.getName());


    @EventListener
    public void seed(ContextRefreshedEvent event) {

        seedLogsTable();
    }

    private void seedLogsTable() {
        logService.SaveLog("No Route", "Database Init");
        LOG.info("Logs Seeded");
    }
    //
}