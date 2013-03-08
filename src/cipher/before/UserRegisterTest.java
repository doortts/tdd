package cipher.before;
import static org.junit.Assert.*;

import org.junit.*;

// md5HashGenerator 웹 생성기 http://www.miraclesalad.com/webtools/md5.php
// potato : 8ee2027983915ec78acc45027d874316

public class UserRegisterTest {
	@Test
	public void testSavePassword() throws Exception {
		UserRegister register = new UserRegister();
		String userId = "sweet88";
		String password = "potato";
		register.savePassword( userId, password );
		String passwordFromServer = register.getPassword(userId);
		assertEquals(password, passwordFromServer);

	}
}
