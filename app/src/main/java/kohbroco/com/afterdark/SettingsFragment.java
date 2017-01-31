package kohbroco.com.afterdark;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by elliotmoose on 31/1/17.
 */
public class SettingsFragment extends Fragment {
    private static SettingsFragment ourInstance = new SettingsFragment();

    public static SettingsFragment getInstance() {
        return ourInstance;
    }

    public SettingsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.settings_fragment, container, false);
    }
}
