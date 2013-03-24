package emissores;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EnviarNovoPedido {
	public static void main(String[] args) throws NamingException, JMSException {
		// serviços de nomes = JNDI
		InitialContext context = new InitialContext();
	
		// fabrica de conexões JMS
		ConnectionFactory factory = (ConnectionFactory) context.lookup("jms/factory");
		
		// fila
		Queue queue = (Queue) context.lookup("jms/orders");

		// conexão JMS
		Connection connection = factory.createConnection();
		
		// sessão JMS
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		// emissor de mensagens
		MessageProducer sender = session.createProducer(queue);
		
		// mensagem
		TextMessage message = session.createTextMessage();
		message.setText("Uma pizza de cinco queijos e uma coca-cola 21 - " + System.currentTimeMillis());
		
		// enviando
		sender.send(message);
		
		// fechando
		sender.close();
		session.close();
		connection.close();
		
		System.out.println("Message send!");
		System.exit(0);
	}
}
