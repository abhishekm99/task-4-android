package abhishek.com.task4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        String message1 = intent.getStringExtra("name");
        String message2 = intent.getStringExtra("yor");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message1);
        TextView textView2 = (TextView) findViewById(R.id.textView3);
        textView2.setText(message2);

    }
}
