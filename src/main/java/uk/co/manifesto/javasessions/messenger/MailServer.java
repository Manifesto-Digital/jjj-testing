package uk.co.manifesto.javasessions.messenger;

public interface MailServer {

	public void send(String email, String msgContent);

}
