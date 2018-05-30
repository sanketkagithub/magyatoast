package testapp.testing.com.tastytoastlibrary;

import android.content.Context;
import android.widget.Toast;

public class MagyaToastManager {

    public static void getMagyaToast(Context context)
    {
        Toast.makeText(context, " magya re chodi ", Toast.LENGTH_SHORT).show();
    }
}
