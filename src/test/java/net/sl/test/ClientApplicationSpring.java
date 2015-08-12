package net.sl.test;

import net.sl.di.MyApplication;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by a601054 on 2015-08-10.
 */
public class ClientApplicationSpring {

    public static void main(String[] args) {
        WeldContainer weld = new Weld().initialize();
        MyApplication myApplication = weld.instance().select(MyApplication.class).get();

        myApplication.sendMessage("Hi Pankaj", "pankaj@abc.com");
    }

}
