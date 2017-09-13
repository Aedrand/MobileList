package example.chaegley.studentlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText inputTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student standard= new Student();

        inputTxt = (EditText) findViewById(R.id.editTextName);
        standard.setName(inputTxt.getText().toString());

        inputTxt = (EditText) findViewById(R.id.editTextYear);
        standard.setGradYear(inputTxt.getText());

        inputTxt = (EditText) findViewById(R.id.editTextName);
        standard.setName(inputTxt.getText().toString());


    }
}
