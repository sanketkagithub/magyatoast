package testapp.testing.com.tastytoastlibrary;

import android.content.Context;
import android.widget.Toast;

public class TastyToastManager
{
    public static void  showTastToast(Context context)
    {
        Toast.makeText(context, "tasty toast", Toast.LENGTH_SHORT).show();
    }

}
