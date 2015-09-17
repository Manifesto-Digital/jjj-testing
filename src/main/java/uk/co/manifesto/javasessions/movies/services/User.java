package uk.co.manifesto.javasessions.movies.services;

public interface User {

	String getPassword();

	void setPassword(String passwordMd5);

}
