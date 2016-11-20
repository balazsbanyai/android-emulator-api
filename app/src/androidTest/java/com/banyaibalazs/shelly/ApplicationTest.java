package com.banyaibalazs.shelly;

import android.test.InstrumentationTestCase;

public class ApplicationTest extends InstrumentationTestCase {


    public void testCallMeMaybe() throws Exception {

        Shelly shelly = new ShellyImpl();
        shelly.connect();

        shelly.callMe("1234567");

        assertIncomingCall("1234567");
    }

    private static void assertIncomingCall(String s) {

    }


}