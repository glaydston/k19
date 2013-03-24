package com.ibm.bean;

import java.util.Date;
import java.util.Properties;

import javax.faces.bean.ManagedBean;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@ManagedBean
public class EmailBean {
	private String mensagem;
	private Properties properties = new Properties();
	private Authenticator authenticator;

	public EmailBean() {
		this.properties.put("mail.smtp.auth", true);
		this.properties.put("mail.smtp.port", "465");
		this.properties.put("mail.host", "smtp.gmail.com");
		this.properties.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		this.properties.put("mail.smtp.socketFactory.fallback", "false");
		this.authenticator = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("GOOGLE", null);
			};
		};
	}

	public String envia() throws AddressException, MessagingException {
		Session session = Session.getInstance(this.properties,
				this.authenticator);
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress("EMAIL DE ORIGEM"));
		message.setRecipients(Message.RecipientType.TO, "EMAIL DE DESTINO");
		message.setSentDate(new Date());
		message.setSubject("Copa do Mundo - Erro");
		message.setContent(this.mensagem, "text/plain");
		Transport.send(message);
		return "/selecoes";
	}
}
