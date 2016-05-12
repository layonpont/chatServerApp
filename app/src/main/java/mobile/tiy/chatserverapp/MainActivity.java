package mobile.tiy.chatserverapp;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView list;
    EditText text;
    Button sendButton;

    ArrayAdapter<String> messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        ChatClient myClient = new ChatClient();




        list = (ListView) findViewById(R.id.listView);
        text = (EditText) findViewById(R.id.editText);
        sendButton = (Button) findViewById(R.id.button);



        sendButton.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {

        System.out.println("onClick()");
        String userMessage = text.getText().toString();
        ChatClient myclient = new ChatClient();
        myclient.sendMessage(userMessage);

//        messages.add(userMessage);
//        text.setText("");

    }
}
