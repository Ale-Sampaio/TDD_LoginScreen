import com.mycompany.loginscreen.LoginScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for LoginScreen.
 *
 * Author: Alexandre Sampaio
 */
public class LoginScreenTest {

    private LoginScreen loginScreen;

    @BeforeAll
    public static void setUpClass() {
        // Executed once, before all tests
    }

    @AfterAll
    public static void tearDownClass() {
        // Executed once, after all tests
    }

    @BeforeEach
    public void setUp() {
        // Executed before each test
        loginScreen = new LoginScreen();
    }

    @AfterEach
    public void tearDown() {
        // Executed after each test
        loginScreen = null;
    }

    @Test
    public void testSuccessfulLogin() {
        loginScreen.addUser("john", "password123");
        assertTrue(loginScreen.login("john", "password123"), "Login should be successful with correct credentials");
    }

    @Test
    public void testFailedLogin() {
        loginScreen.addUser("john", "password123");
        assertFalse(loginScreen.login("john", "wrongpassword"), "Login should fail with incorrect credentials");
    }

    @Test
    public void testAddUser() {
        loginScreen.addUser("testuser", "testpassword");
        assertTrue(loginScreen.login("testuser", "testpassword"), "Login should be successful after adding a new user");
    }
}
