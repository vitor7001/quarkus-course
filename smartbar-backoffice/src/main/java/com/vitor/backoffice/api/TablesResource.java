package com.vitor.backoffice.api;

import com.example.smartbar.backoffice.api.TablesApi;
import com.example.smartbar.backoffice.api.model.Table;
import com.vitor.backoffice.TableService;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

public class TablesResource implements TablesApi {

    private TableService tableService;

    @Inject
    public TablesResource(final TableService tableService){
        this.tableService = tableService;
    }

    @Override
    public Response tablesGet() {
        return Response.ok(List.of(tableService.get())).build();
    }
    @Override
    public Response tablesPost(Table table) {
        return Response.created(URI.create("todo")).build();
    }
    @Override
    public Response tablesTableIdDelete(String tableId) {
        return Response.ok().build();
    }
    @Override
    public Response tablesTableIdGet(String tableId) {
        return Response.ok(tableService.get()).build();
    }
    @Override
    public Response tablesTableIdPut(String tableId, Table table) {
        return Response.ok().build();
    }
}