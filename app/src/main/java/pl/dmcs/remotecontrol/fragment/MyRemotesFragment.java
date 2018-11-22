package pl.dmcs.remotecontrol.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pl.dmcs.remotecontrol.R;

/**
 * Created by Jacek on 14.11.2017.
 */

public class MyRemotesFragment extends BaseFragment {

    private Button powerButton;

    public MyRemotesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        powerButton = getView().findViewById(R.id.powerButton);


    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_my_remotes;
    }
}