package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    private TextView welcomeNameText;
    private Button returnButton;
    public static final String NAME_KEY = "USER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);

        welcomeNameText = findViewById(R.id.welcome_name_text);
        if (name == null || name.isEmpty()) { name = "Anonymous"; }
        welcomeNameText.setText("Welcome, " + name);

        returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view ) {
                Intent intent = new Intent(OtherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
