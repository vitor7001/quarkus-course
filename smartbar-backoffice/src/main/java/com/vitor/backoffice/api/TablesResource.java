package com.vitor.backoffice.api;

import com.example.smartbar.backoffice.api.TablesApi;
import com.example.smartbar.backoffice.api.model.Table;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

public class TablesResource implements TablesApi {
    private final Table table = new Table().name("chile");
    @Override
    public Response tablesGet() {
        return Response.ok(List.of(table)).build();
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
        return Response.ok(table).build();
    }
    @Override
    public Response tablesTableIdPut(String tableId, Table table) {
        return Response.ok().build();
    }
}