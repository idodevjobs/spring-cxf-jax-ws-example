package com.idodevjobs.sample;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String message) {
        return "Hello "+message;
    }
}
