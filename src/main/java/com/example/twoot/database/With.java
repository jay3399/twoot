package com.example.twoot.database;

import java.sql.SQLException;

interface With<P> {
    void run(P stmt) throws SQLException;
}
