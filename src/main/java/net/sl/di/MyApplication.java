package net.sl.di;

import net.sl.service.MessageService;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 * Created by a601054 on 2015-08-10.
 */

@Dependent
public class MyApplication {

    private MessageService service;

//  constructor based injector
//  @Inject
//  public MyApplication(MessageService svc){
//      this.service=svc;
//  }

    //setter method injector
    @Inject
    public void setService(MessageService svc) {
        this.service = svc;
    }

    public boolean sendMessage(String msg, String rec) {
        //some business logic here
        return service.sendMessage(msg, rec);
    }
}
