package com.idodevjobs.sample;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

    public String sayHello(String message);
}
