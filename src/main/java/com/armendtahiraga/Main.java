package com.armendtahiraga;

import com.armendtahiraga.server.http.Request;
import com.armendtahiraga.server.http.Response;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Request request = new Request();
        request.setMethod("GET");

        Response response = new Response();
        response.setStatusCode(200);
        response.setBody("Data");
    }
}