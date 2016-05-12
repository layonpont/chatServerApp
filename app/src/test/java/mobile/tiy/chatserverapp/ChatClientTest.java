package mobile.tiy.chatserverapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sulton on 5/11/2016.
 */
public class ChatClientTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSendMessage() throws Exception {
        ChatClient myClient = new ChatClient();
        String message = "Hi";
        String expectedResponse = "Mirror Message: " + message;
        String serverResonse = myClient.sendMessage(message);
        assertEquals(expectedResponse, serverResonse);



    }
}