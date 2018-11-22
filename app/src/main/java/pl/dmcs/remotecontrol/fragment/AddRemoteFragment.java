package pl.dmcs.remotecontrol.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pl.dmcs.remotecontrol.R;

/**
 * Created by Jacek on 14.11.2017.
 */

public class AddRemoteFragment extends BaseFragment {

    @BindView(R.id.manufacturers_spinner)
    Spinner manufacturers_spinner;

    @BindView(R.id.custom_name)
    EditText customName;

    @BindView(R.id.addButton)
    Button addButton;

    ArrayAdapter<CharSequence> adapter;

    public AddRemoteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_remote, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.manufacturers_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        manufacturers_spinner.setAdapter(adapter);
    }

    @OnClick(R.id.addButton)
    public void addButtonClicked() {
        if (customName.getText() == null || customName.getText().toString().length() == 0 || customName.getText().toString().equals("") || manufacturers_spinner.getSelectedItem() == null) {
            Toast.makeText(getContext(), "Please fill in all the fields", Toast.LENGTH_SHORT).show();
            return;
        }
        SharedPreferences prefs = getContext().getSharedPreferences("SHARED_PREFERENCES", Context.MODE_PRIVATE);
        if (prefs.getString(customName.getText().toString(), "DEFAULT").equals("DEFAULT")) {
            prefs.edit().putString(customName.getText().toString(), manufacturers_spinner.getSelectedItem().toString()).apply();
            Toast.makeText(getContext(), "TV added", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getContext(), "TV with this name already exists", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_add_remote;
    }
}