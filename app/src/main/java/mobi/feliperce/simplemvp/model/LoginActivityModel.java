package mobi.feliperce.simplemvp.model;

import mobi.feliperce.simplemvp.LoginMvp;

/**
 * Created by felipe on 26/09/17.
 */

public class LoginActivityModel implements LoginMvp.Model {

    private SharedPrefManager sharedPrefManager;

    public LoginActivityModel(SharedPrefManager sharedPrefManager) {
        this.sharedPrefManager = sharedPrefManager;
    }

    @Override
    public String getUser() {
        return sharedPrefManager.getUser();
    }

    @Override
    public String getPassword() {
        return sharedPrefManager.getPassword();
    }
}
