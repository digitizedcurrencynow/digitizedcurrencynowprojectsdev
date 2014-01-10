package com.digitizedcurrencynow.server.twilio;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;

/**
 * <p>
 * TwilioServices validates that the name the user enters is valid.
 * 
 * </p>
 */
public class TwilioServices {

	private static final String ACCOUNT_SID = "ACad143cf2b9e5ae393357d61b092a5fdb";
	private static final String AUTH_TOKEN = "85f3ee88526d22daab3a46c41436b2bd";
	private TwilioRestClient client;
	private List<NameValuePair> params = new ArrayList<NameValuePair>();

	public TwilioServices() {

		System.out.println("Construstor callTwilioServices Api");
		client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
	}

	public void callTwilioServices(String toNumber, String body) throws TwilioRestException {

		System.out.println("Calling callTwilioServices Api");

		params.add(new BasicNameValuePair("To", "+1" + toNumber));
		params.add(new BasicNameValuePair("From", "+17787620416"));
		params.add(new BasicNameValuePair("Body", body));
		MessageFactory messageFactory = client.getAccount().getMessageFactory();
		Message message;
		try {
			message = messageFactory.create(params);
			System.out.println("TwilioServices >> message >> "+message);
		} catch (TwilioRestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
