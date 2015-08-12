package net.sl.service.impl;

import net.sl.service.MessageService;

import javax.enterprise.inject.Alternative;

/**
 * Created by a601054 on 2015-08-10.
 */
@Alternative
public class MockMessageService implements MessageService {

    public boolean sendMessage(String msg, String receipient) {
        return true;
    }

}
