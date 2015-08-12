package net.sl.service.impl;

import net.sl.service.MessageService;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.inject.Named;

/**
 * Created by a601054 on 2015-08-10.
 */

@Named
@Dependent
@Default
public class EmailService implements MessageService {

    public boolean sendMessage(String msg, String receipient) {
        //some fancy code to send email
        System.out.println("Email Message sent to " + receipient + " with message=" + msg);
        return true;
    }

}
