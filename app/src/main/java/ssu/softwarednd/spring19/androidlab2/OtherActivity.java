package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String NAME_KEY = "USER_NAME";

    TextView welcomeNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Button return_main;

        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        return_main = findViewById(R.id.return_main);

        welcomeNameText = findViewById(R.id.welcome_name_text);

        welcomeNameText.setText("Welcome, " + name);

        return_main.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }
}
