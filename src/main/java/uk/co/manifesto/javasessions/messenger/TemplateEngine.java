package uk.co.manifesto.javasessions.messenger;

public interface TemplateEngine {

	public String prepareMessage(Template template, Client client);
}
