package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String NAME_KEY = "USER_NAME";
    private TextView welcomeNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);

        welcomeNameText=findViewById(R.id.welcome_name_text);

        if(name == null || name.isEmpty()) {
            name = "Anonymous"; }

        welcomeNameText.setText("Welcome, " + name);
    }
}
