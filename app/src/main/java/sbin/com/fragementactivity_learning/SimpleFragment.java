package sbin.com.fragementactivity_learning;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment {

    public static final  String MESSAGE_KEY = "message_key";
    public static final String TAG = "LifecycleEvents";

    public SimpleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,"onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"OnCreate");
    }

    public static SimpleFragment newInstance(String message) {

        Bundle args = new Bundle();
        args.putString(SimpleFragment.MESSAGE_KEY, message);
        SimpleFragment fragment = new SimpleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG,"OnCreateView");
        View view = inflater.inflate(R.layout.fragment_simple, container, false);

        //Bundle set / get aruments are key-value type map.
        Bundle arguments = getArguments();
        if (arguments != null){
            String message = arguments.getString(MESSAGE_KEY);
            TextView tvMessage = (TextView) view.findViewById(R.id.message);
            tvMessage.setText(message);
        }
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach");
    }
}
