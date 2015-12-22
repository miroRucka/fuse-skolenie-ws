package sk.posam.skolenie.impl;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

public class ServerPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {

        for (int i = 0; i < callbacks.length; i++) {

            WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

            if (pc.getUsage() == WSPasswordCallback.SIGNATURE
                    || pc.getUsage() == WSPasswordCallback.DECRYPT)

                if (pc.getIdentifier().equals("server"))
                    pc.setPassword("key-pass");
        }

    }
}