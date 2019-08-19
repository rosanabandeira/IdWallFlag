package android.studio.idwallflag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText userEmail;
    private EditText userPassword;
    private Button userBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);
        userBtnLogin = findViewById(R.id.userBtnLogin);

        userEmail.setFocusable(true);

        userBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!validateEmail(userEmail.getText().toString().trim())) {
                    userEmail.setError("digite um email válido");
                    userEmail.requestFocus();

                } else {
                    if (!validatePassword(userPassword.getText().toString().trim())) {
                        userPassword.setError("senha inválida");
                        userPassword.requestFocus();

                    } else {
                        userBtnLogin.setEnabled(true);
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                    }
                }

            }
        });
    }

    private boolean validateEmail(String trim) {
        if (userEmail != null && Patterns.EMAIL_ADDRESS.matcher(userEmail.getText().toString().trim()).matches()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validatePassword(String trim) {
        if (userPassword != null && userPassword.length() >= 6) {
            return true;
        } else {
            return false;
        }
    }


}
