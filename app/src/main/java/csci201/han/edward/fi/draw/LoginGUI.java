package csci201.han.edward.fi.draw;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginGUI extends AppCompatActivity {

    private TextView appName;
    private Typeface custom_font;
    private EditText usernameField;
    private EditText passwordField;
    private Button loginButton;
    private Button sandBoxButton;

    //any other instance or member variables here:
        //TODO

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_gui);


        //Create custom font and set for all widgets for cohesiveness
        appName = (TextView) findViewById(R.id.appNameId);
        custom_font = Typeface.createFromAsset(getAssets(), "fonts/VarelaRound-Regular.ttf");
        appName.setTypeface(custom_font);

        usernameField = (EditText) findViewById(R.id.username);
        usernameField.setTypeface(custom_font);
        passwordField = (EditText) findViewById(R.id.password);
        passwordField.setTypeface(custom_font);

        loginButton = (Button) findViewById(R.id.loginBtn);
        loginButton.setTypeface(custom_font);
        sandBoxButton = (Button) findViewById(R.id.sandboxBtn);
        sandBoxButton.setTypeface(custom_font);



        //implement listeners here:

        //text field listeners
        usernameField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return false;
            }
        });
        passwordField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return false;
            }
        });


        //button listeners
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        sandBoxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
