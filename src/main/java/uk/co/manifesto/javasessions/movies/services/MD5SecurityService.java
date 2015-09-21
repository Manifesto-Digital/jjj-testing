package uk.co.manifesto.javasessions.movies.services;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5SecurityService implements SecurityService {

	@Override
	public String md5(String password) throws Exception {
		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();
			messageDigest.update(password.getBytes(Charset.forName("UTF8")));
			final byte[] resultByte = messageDigest.digest();
			return toHex(resultByte);
		} catch (NoSuchAlgorithmException e) {
			throw new Exception("The conversion of the supplied password failed");
		}

	}
	
	public String toHex( byte[] byteArray) {
		return String.format("%x", new BigInteger(1, byteArray));
	}

}
