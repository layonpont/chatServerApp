package mobile.tiy.chatserverapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Sulton on 5/11/2016.
 */
public class ChatClient {
    public String response;

    public String sendMessage(String messageToSend){
        try {
            Socket clientSocket = new Socket("172.168.4.11", 8005);

            // once we connect to the server, we also have an input and output stream
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.println(messageToSend);
            response = in.readLine();
        }catch (IOException exception){

        }



        return response ;
    }
}
