package mobi.feliperce.simplemvp.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import mobi.feliperce.simplemvp.LoginMvp;
import mobi.feliperce.simplemvp.R;
import mobi.feliperce.simplemvp.model.SharedPrefManager;
import mobi.feliperce.simplemvp.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginMvp.View {

    private EditText userEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEditText = (EditText) findViewById(R.id.userEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        loginButton = (Button) findViewById(R.id.loginButton);

        loginPresenter = new LoginPresenter(this, new SharedPrefManager(getApplicationContext()));

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.login(userEditText.getText().toString(), passwordEditText.getText().toString());
            }
        });
    }

    @Override
    public void showToast() {
        Toast.makeText(this, R.string.login_success, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailToast() {
        Toast.makeText(this, R.string.login_fail, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void emptyUsuarioEditText() {
        userEditText.setError(getString(R.string.user_empty));
    }

    @Override
    public void emptyPasswordEditText() {
        passwordEditText.setError(getString(R.string.password_empty));
    }
}
