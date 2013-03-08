/*
 * @(#)MockCipher.java $version Jun 19, 2012
 *
 * Copyright 2007 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package cipher.changed;

import javax.management.RuntimeErrorException;

/**
 * @author doortts
 */
public class MockCipher implements Cipher {

	private int counter;

	/**
	 * @param source
	 * @return
	 * @see cipher.changed.Cipher#encryption(java.lang.String)
	 */
	@Override
	public String encryption(String source) {
		this.counter++;
		if (source.equals("potato"))
			return "8ee2027983915ec78acc45027d874316";
		else if (source.equals("dadada"))
			return "fadlajdfakljfdalsjfdlsak";
		else
			throw new RuntimeException("not valid");
	}

	/**
	 * @param source
	 * @return
	 * @see cipher.changed.Cipher#decryption(java.lang.String)
	 */
	@Override
	public String decryption(String source) {
		if( source.equals("8ee2027983915ec78acc45027d874316"))
			return "potato";
		else if(source.equals("fadlajdfakljfdalsjfdlsak"))
			return "dadada";
		else
			throw new RuntimeException("not valid");
	}
	
	public int getEncryptionCallCount(){
		return this.counter;
	}

}
