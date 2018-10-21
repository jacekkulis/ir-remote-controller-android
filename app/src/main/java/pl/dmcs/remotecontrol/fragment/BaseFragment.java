package pl.dmcs.remotecontrol.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import pl.dmcs.remotecontrol.R;


public abstract class BaseFragment extends Fragment {
    private String mClassTag;
    private boolean mIsFragmentCreated;

    public BaseFragment() {
        setClassTag(this.getClass().getSimpleName());
        setFragmentCreated(false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFragmentCreated(true);
        Log.d(this.getClassTag(), "onCreate: ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getFragmentLayout(), container, false);
        Log.d(this.getClassTag(), "onCreateView: ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RelativeLayout rootLayout = view.findViewById(R.id.root_layout);
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    /**
     * Every fragment has to inflate a layout in the onCreateView method. We have added this method to
     * avoid duplicate all the inflate code in every fragment. You only have to return the layout to
     * inflate in this method when extends BaseFragment.
     */
    protected abstract int getFragmentLayout();

    public String getClassTag() {
        return mClassTag;
    }

    public void setClassTag(String classTag) {
        this.mClassTag = classTag;
    }

    public boolean isFragmentCreated() {
        return mIsFragmentCreated;
    }

    public void setFragmentCreated(boolean fragmentCreated) {
        this.mIsFragmentCreated = fragmentCreated;
    }
}
