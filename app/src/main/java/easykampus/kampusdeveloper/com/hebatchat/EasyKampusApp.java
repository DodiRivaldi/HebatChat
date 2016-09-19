package easykampus.kampusdeveloper.com.hebatchat;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Dodi Rivaldi on 18/09/2016.
 */
public class EasyKampusApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        FirebaseDatabase.getInstance().getReference().keepSynced(true);
    }
}
