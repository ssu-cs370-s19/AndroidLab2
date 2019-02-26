package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OtherActivity extends AppCompatActivity {

    @Override
    private String welcomeNameText;

    public static final String NAME_KEY = "USER_NAME";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);

        welcomeNameText = findViewById(R.id.welcome_name_text);
        welcomeNameText.setText("Welcome, "+ name);

    }
}
