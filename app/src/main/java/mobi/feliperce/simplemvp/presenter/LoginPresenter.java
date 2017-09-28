package mobi.feliperce.simplemvp.presenter;

import android.content.Context;

import mobi.feliperce.simplemvp.LoginMvp;
import mobi.feliperce.simplemvp.R;
import mobi.feliperce.simplemvp.model.LoginActivityModel;
import mobi.feliperce.simplemvp.model.SharedPrefManager;

/**
 * Created by felipe on 26/09/17.
 */

public class LoginPresenter implements LoginMvp.Presenter {

    private LoginMvp.View loginView;
    private LoginActivityModel loginModel;

    public LoginPresenter(SharedPrefManager sharedPrefManager) {
        this.loginModel = new LoginActivityModel(sharedPrefManager);
    }

    @Override
    public void login(String user, String password) {
        if(user.isEmpty() || password.isEmpty()) {
            if(user.isEmpty()) {
                loginView.emptyPasswordEditText();
            }

            if(user.isEmpty()) {
                loginView.emptyUsuarioEditText();
            }

            if(password.isEmpty()) {
                loginView.emptyPasswordEditText();
            }
        } else {
            if(user.equals(loginModel.getUser()) && password.equals(loginModel.getPassword())) {
                loginView.showToast();
            } else {
                loginView.showFailToast();
            }
        }
    }

    @Override
    public void setView(LoginMvp.View view) {
        this.loginView = view;
    }
}
