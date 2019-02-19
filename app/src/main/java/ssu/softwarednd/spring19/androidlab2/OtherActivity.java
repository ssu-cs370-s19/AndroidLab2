package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class OtherActivity extends AppCompatActivity {
    public static final String NAME_KEY = "USER_NAME";
    private EditText welcomeNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        welcomeNameText = findViewById(R.id.welcome_name_text);
        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        welcomeNameText.setText("Welcome, " + name);
    }
}
