package com.digitizedcurrencynow.server;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



import com.google.gwt.user.server.rpc.RemoteServiceServlet;



public class MailServiceImpl  extends RemoteServiceServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void callMailServiceImpl( )  {
		
		
		Properties props = new Properties();
		Session session = Session.getDefaultInstance(props, null);

		String msgBody = "Hello World";
	
	
		try {
			
		    Message msg = new MimeMessage(session);
		    try {
				msg.setFrom(new InternetAddress("digitizedcurrencynow@gmail.com", "digitizedcurrencynow@gmail.com Admin"));
			} catch (UnsupportedEncodingException e1) {
				System.out.println("Excepion AddressException >> ");
				e1.printStackTrace();
			}
		    try {
				msg.addRecipient(Message.RecipientType.TO,new InternetAddress("bilal.dar@gmail.com", "This is a message from Digitized Currency now"));
			} catch (UnsupportedEncodingException e) {
				System.out.println("Excepion AddressException >> ");
				e.printStackTrace();
			}
		    msg.setSubject("Your Example.com account has been activated");
		    msg.setText(msgBody);
		    Transport.send(msg);

		} catch (AddressException e) {
			System.out.println("Excepion AddressException >> ");
		} catch (MessagingException e) {
			System.out.println("Excepion MessagingException >> ");
		} finally {
			System.out.println("Excepion MailServiceImpl >> ");
			
		}
	}

}
