package uk.co.manifesto.javasessions.messenger;

public class MessageManager {
    
	/**
	 * Write a test that verifies that the MessageManager succesfully sends an email
	 */
	
	private TemplateEngine templateEngine;
    private MailServer mailServer;
    
    public MessageManager(MailServer mailServer, TemplateEngine templateEngine) {
        this.mailServer = mailServer;
        this.templateEngine = templateEngine;
    }
    public void sendMessage(Client client, Template template) {
        String msgContent = templateEngine.prepareMessage(template, client);
        mailServer.send(client.getEmail(), msgContent);
    }
}