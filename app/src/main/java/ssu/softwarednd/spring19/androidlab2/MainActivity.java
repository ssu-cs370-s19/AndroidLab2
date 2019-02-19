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
        navigateButton=findViewById(R.id.navigate_button);
        navigateButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,OtherActivity.class);
                startActivity(intent);
            }

        });

        nameEditText=findViewById(R.id.EditText);
        @Override void onClick(View v){
            String name = nameEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, OtherActivity.class);

            intent.putExtra(OtherActivity.NAME_KEY, name);
            startActivity(intent);
        }


    }


}

