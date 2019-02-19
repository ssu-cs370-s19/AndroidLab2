package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button navigateButton;
    private EditText nameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateButton = findViewById(R.id.navigate_button);

        navigateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name = nameEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                intent.putExtra(Main2Activity.NAME_KEY, name);
                startActivity(intent);
            }
        });
    }

}
