package abhishek.com.task4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


            public void sendMessage(View view) {
                Intent intent = new Intent(this,Display.class);
                EditText editText = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                String message1 = editText.getText().toString();
                String message2 = editText2.getText().toString();
                intent.putExtra("name", message1);
                intent.putExtra("yor", message2);
                MainActivity.this.startActivity(intent);

            }



}
