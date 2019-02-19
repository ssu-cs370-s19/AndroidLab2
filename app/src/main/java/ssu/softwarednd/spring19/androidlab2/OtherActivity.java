package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String NAME_KEY = "USER_NAME";

    private TextView welcomeNameText;
    private Button returnButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        welcomeNameText = findViewById(R.id.welcome_name_text);
        returnButton = findViewById(R.id.return_button);

        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);

        if (name == null || name.isEmpty()){
            name = "Anonymous";
        }
        welcomeNameText.setText("Welcome, " + name);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtherActivity.this, MainActivity.class);

                startActivity(intent);


            }
        });
    }
}
