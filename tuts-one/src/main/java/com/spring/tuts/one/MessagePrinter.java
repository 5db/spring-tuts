package com.spring.tuts.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jsingh on 10/28/2013 at 10:31 PM
 */
@Component
public class MessagePrinter {

    @Autowired
    private MessageService messageService;

    public void printMessage() {
        System.out.println(this.messageService.getMessage());
    }
}
