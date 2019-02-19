package ssu.softwarednd.spring19.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String NAME_Key = "USER_NAME";

    TextView welcomeNameText;
    Button backNavButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);



        Intent newIntent = getIntent();

        backNavButton = findViewById(R.id.back_navigate_button);

        String name = newIntent.getStringExtra(NAME_Key);

        if(name == null || name.isEmpty()) {
          name = "Anonymous";
        }

        welcomeNameText = findViewById(R.id.welcome_name_text);

        welcomeNameText.setText("Welcome, " + name );

        backNavButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
