package edu.phoenix.mbl402.week1appcl5837;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView new_message;
    int msg_num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new_message = findViewById(R.id.newMessage);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.add_message) {
           // Create new message below welcome message
            new_message.append("This is a new message #" + msg_num + "\n");
            msg_num++;
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
