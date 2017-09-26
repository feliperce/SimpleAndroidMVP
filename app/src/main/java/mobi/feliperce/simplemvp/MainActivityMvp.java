package mobi.feliperce.simplemvp;

/**
 * Created by felipe on 26/09/17.
 */

public interface MainActivityMvp {

    interface Model {
        void setLogin();

    }

    interface View {
        void showToast(String message);
    }

    interface Presenter {
        void showToast(String message);
    }
}
