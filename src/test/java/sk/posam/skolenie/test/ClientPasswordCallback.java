package sk.posam.skolenie.test;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

public class ClientPasswordCallback implements CallbackHandler {

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {

		for (int i = 0; i < callbacks.length; i++) {

			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

			if (pc.getUsage() == WSPasswordCallback.SIGNATURE
					|| pc.getUsage() == WSPasswordCallback.DECRYPT)

				if (pc.getIdentifier().equals("client"))
					pc.setPassword("key-pass");
		}

	}
}