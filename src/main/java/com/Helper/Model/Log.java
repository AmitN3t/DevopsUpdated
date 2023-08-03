package com.Helper.Model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "Log")
public class Log {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String typeRequest;

    @Column
    private String routingStr;

    @Column
    private final String create_at;

    public Log() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.create_at =dateTime.format(formatDateTime);
        this.typeRequest = "GET";
        this.routingStr = "None";
    }

    public Log(String route) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.create_at =dateTime.format(formatDateTime);
        this.typeRequest = "GET";
        this.routingStr = route;
    }

    public Log(String route, String request) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.create_at =dateTime.format(formatDateTime);
        this.typeRequest = request;
        this.routingStr = route;
    }

    public Integer getId() {
        return this.id;
    }

    public String getType() {
        return this.typeRequest;
    }
    public String getRoute() {
        return this.routingStr;
    }
    public String getDateTime() {
        return this.create_at;
    }
}
