package com.greenfox.frontend.models;

import com.greenfox.frontend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class History {

    @Autowired
    LogRepository logRepository;

    private List<Log> entries;
    private int entry_count;

    public History(List<Log> entries) {
        this.entries = entries;
        this.entry_count = entries.size();
    }

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public int getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(int entry_count) {
        this.entry_count = entry_count;
    }
}
