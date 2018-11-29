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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @BindView(R.id.current_devices)
    Spinner current_devices;

    @BindView(R.id.custom_name)
    EditText customName;

    @BindView(R.id.addButton)
    Button addButton;

    @BindView(R.id.deleteButton)
    Button deleteButton;

    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<String> deleteAdapter;

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
        SharedPreferences prefs = getContext().getSharedPreferences("SHARED_PREFERENCES", Context.MODE_PRIVATE);
        setSpinnerItems(prefs);
    }

    private void setSpinnerItems(SharedPreferences prefs) {
        Map<String, ?> all = prefs.getAll();
        List<String> spinnerItems = new ArrayList<>();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            spinnerItems.add(entry.getKey() + ": " + entry.getValue().toString());
        }
        deleteAdapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_item, spinnerItems);
        current_devices.setAdapter(deleteAdapter);
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
            setSpinnerItems(prefs);
        } else {
            Toast.makeText(getContext(), "TV with this name already exists", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.deleteButton)
    public void deleteButtonClicked() {
        Object obj = current_devices.getSelectedItem();
        if (obj == null) {
            return;
        }
        SharedPreferences prefs = getContext().getSharedPreferences("SHARED_PREFERENCES", Context.MODE_PRIVATE);
        String s = current_devices.getSelectedItem().toString();
        String[] arrays = s.split(":");
        prefs.edit().remove(arrays[0]).commit();
        setSpinnerItems(prefs);
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_add_remote;
    }
}