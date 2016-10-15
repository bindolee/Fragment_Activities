package sbin.com.fragementactivity_learning;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClickHandler(View view) {
        SimpleFragment fragment = new SimpleFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container,fragment)
                .commit();
    }

    public void removeClickHandler(View view) {
        //This is way to retrieve the saved fragment reference..
        // when orientation is tiltied.. this fragment reference isn't saved
        // just not by declare it outside of the oncreatefucntion.. this is not enough.
        Fragment fragment =
                getSupportFragmentManager()
                .findFragmentById(R.id.fragment_container);

        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }
}
