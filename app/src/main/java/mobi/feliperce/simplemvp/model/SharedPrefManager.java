package mobi.feliperce.simplemvp.model;

import android.content.Context;
import android.content.SharedPreferences;

import mobi.feliperce.simplemvp.LoginMvp;

/**
 * Created by felipe on 27/09/17.
 */

public class SharedPrefManager {

    /* WARNING: DON'T USE SHAREDPREF TO STORE USER DATA, I USED JUST FOR MAKE IT SIMPLE FOR SAMPLE */

    public static final String USER_KEY = "user_key";
    public static final String PASSWORD_KEY = "password_key";
    public static final String PREF_NAME = "user";

    private SharedPreferences sharedPreferences;

    public SharedPrefManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public String getUser() {
        return sharedPreferences.getString(USER_KEY, "myuser");
    }

    public String getPassword() {
        return sharedPreferences.getString(PASSWORD_KEY, "mypassword");
    }
}
