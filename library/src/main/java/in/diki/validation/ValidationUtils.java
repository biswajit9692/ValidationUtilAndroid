package in.diki.validation;

import android.text.TextUtils;
import android.widget.EditText;

/**
 * Created by biswajit on 19/03/18.
 */

public class ValidationUtils {

    public void isEmpty(EditText editText) {
        if (TextUtils.isEmpty(editText.getText()))
            editText.setError("Please enter some value");

    }
}
