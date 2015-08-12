package net.sl.di;

import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;


/**
 * Created by a601054 on 2015-08-10.
 */
@RunWith(CdiRunner.class)
public class MyApplicationCdiTest {

    @Inject
    private MyApplication appTest;

    @Test
    public void shouldSendMessaage() {
        assertEquals(true, appTest.sendMessage("Hi Pankaj", "pankaj@abc.com"));
    }

}