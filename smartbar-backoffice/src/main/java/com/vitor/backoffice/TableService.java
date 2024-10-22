package com.vitor.backoffice;

import com.example.smartbar.backoffice.api.model.Table;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TableService {

    public Table get(){
        return new Table().name("table1");
    }

}
