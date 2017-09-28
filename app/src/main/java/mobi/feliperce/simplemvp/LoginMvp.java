package mobi.feliperce.simplemvp;

import android.content.Context;

/**
 * Created by felipe on 26/09/17.
 */

public interface LoginMvp {

    interface Model {
        String getUser();
        String getPassword();
    }

    interface View {
        void showToast();
        void showFailToast();
        void emptyUsuarioEditText();
        void emptyPasswordEditText();
    }

    interface Presenter {
        void login(String user, String password);
        void setView(LoginMvp.View view);
    }
}
