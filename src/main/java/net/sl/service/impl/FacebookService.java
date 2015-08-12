package net.sl.service.impl;

import net.sl.service.MessageService;

import javax.enterprise.inject.Alternative;
import javax.inject.Singleton;

/**
 * Created by a601054 on 2015-08-10.
 */
@Singleton
@Alternative
public class FacebookService implements MessageService {

    public boolean sendMessage(String msg, String receipient) {
        //some complex code to send Facebook message
        System.out.println("Message sent to Facebook user " + receipient + " with message=" + msg);
        return true;
    }

}
