package com.armendtahiraga;

import com.armendtahiraga.server.http.Request;
import com.armendtahiraga.server.http.Response;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.setMethod("GET");
        request.setPath("http://server.com");

        Response response = new Response();
        response.setStatusCode(200);
        response.setResponseData("Data");

        System.out.println("Request Method: " + request.getMethod() + "||" + " Request Path: " + request.getPath());
        System.out.println("Response Status Code: " + response.getStatusCode() + "||" + " Response Data: " + response.setResponseData());
    }
}