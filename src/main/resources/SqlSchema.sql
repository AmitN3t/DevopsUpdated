DROP TABLE IF EXISTS LOG;

CREATE TABLE
    LOG (
        id INT AUTO_INCREMENT PRIMARY KEY,
        request_type TEXT NOT NULL,
        route TEXT NOT NULL,
        date_time TEXT NOT NULL
    );