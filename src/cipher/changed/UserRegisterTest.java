package cipher.changed;
import static org.junit.Assert.*;

import org.junit.*;

// md5HashGenerator 웹 생성기 http://www.miraclesalad.com/webtools/md5.php
// potato : 8ee2027983915ec78acc45027d874316

public class UserRegisterTest {
	@Test
	public void testSavePassword() throws Exception {
		UserRegister register = new UserRegister();
		Cipher cipher = new MockCipher();
		String userId = "sweet88";
		String password = "potato";
		register.savePassword( userId, cipher.encryption(password) );
		String decryptedPassword = cipher.decryption(register.getPassword(userId));
		assertEquals(password, decryptedPassword);
	}
	
	@Test
	public void testSavePassword_bubin() throws Exception {
		UserRegister register = new UserRegister();
		Cipher cipher = new MockCipher();
		String userId = "dauguest";
		String password = "dadada";
		register.savePassword( userId, cipher.encryption(password) );
		cipher.encryption(password);
		String decryptedPassword = cipher.decryption(register.getPassword(userId));
		assertEquals(password, decryptedPassword);
		assertEquals(1, ((MockCipher)(cipher)).getEncryptionCallCount());
	}
}
