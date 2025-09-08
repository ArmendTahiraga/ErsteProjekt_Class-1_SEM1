package com.armendtahiraga.server.http;

public class Response {
    private int statusCode;
    private String responseData;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getBody() {
        return responseData;
    }

    public void setBody(String responseData) {
        this.responseData = responseData;
    }
}
