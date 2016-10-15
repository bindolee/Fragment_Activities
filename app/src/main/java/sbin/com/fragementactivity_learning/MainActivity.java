package sbin.com.fragementactivity_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SimpleFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = new SimpleFragment();
    }

    public void addClickHandler(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container,fragment)
                .commit();
    }

    public void removeClickHandler(View view) {
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }
}
