package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface MyService {
    @WebMethod
    public String get();
}
