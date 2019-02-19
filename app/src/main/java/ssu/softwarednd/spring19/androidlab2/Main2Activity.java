package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String NAME_KEY = "USER_NAME";

    private TextView welcomeNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        welcomeNameText.setText("Welcome, " + name);

    }
}
