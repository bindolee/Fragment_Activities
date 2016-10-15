package sbin.com.fragementactivity_learning;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String FRAGMENT_TAG ="fragment_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClickHandler(View view) {
        SimpleFragment fragment = new SimpleFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.fragment_container,fragment,FRAGMENT_TAG)
                .commit();
    }

    public void removeClickHandler(View view) {
        //This is way to retrieve the saved fragment reference..
        // when orientation is tiltied.. this fragment reference isn't saved
        // just not by declare it outside of the oncreatefucntion.. this is not enough.
        Fragment fragment =
                getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_TAG);

        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }
}
