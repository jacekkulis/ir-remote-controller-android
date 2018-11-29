package pl.dmcs.remotecontrol.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pl.dmcs.remotecontrol.R;
import pl.dmcs.remotecontrol.irtransmitter.GenericIRCodes;
import pl.dmcs.remotecontrol.irtransmitter.IRTransmitter;
import pl.dmcs.remotecontrol.irtransmitter.irlibrary.LGIRCodes;

/**
 * Created by Jacek on 14.11.2017.
 */

public class RemoteFragment extends BaseFragment implements SensorEventListener {

    private long lastUpdate = -1;
    private float x, y, z;
    private float last_x, last_y, last_z;
    private static final int SHAKE_THRESHOLD = 800;
    private SensorManager sensorService;
    private Sensor sensor;

    @BindView(R.id.powerTV)
    ImageButton powerButtonTV;
    @BindView(R.id.menuTV)
    ImageButton menuTV;
    @BindView(R.id.backTV)
    ImageButton backTV;
    @BindView(R.id.channelUpTV)
    ImageButton channelUpTV;
    @BindView(R.id.channelDownTV)
    ImageButton channelDownTV;
    @BindView(R.id.volumeUpTV)
    ImageButton volumeUpTV;
    @BindView(R.id.volumeDownTV)
    ImageButton volumeDownTV;
    @BindView(R.id.muteTV)
    ImageButton muteTV;
    @BindView(R.id.spinnerTVs)
    Spinner spinnerTVs;


    IRTransmitter irTransmitter;
    GenericIRCodes genericIRCodes;


    public RemoteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onResume() {
        super.onResume();
        if (sensor != null) {
            sensorService.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sensorService = (SensorManager) getContext().getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorService.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if (sensor != null) {
            sensorService.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        }


        //Create IRTransmitter
        irTransmitter = new IRTransmitter(this.getActivity(), new LGIRCodes());
        genericIRCodes = irTransmitter.getGenericIRCodes();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_remote, container, false);
        ButterKnife.bind(this, view);
        SharedPreferences prefs = getContext().getSharedPreferences("SHARED_PREFERENCES", Context.MODE_PRIVATE);
        Map<String, ?> all = prefs.getAll();
        List<String> spinnerItems = new ArrayList<>();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            spinnerItems.add(entry.getKey() + ": " + entry.getValue().toString());
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_item, spinnerItems);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTVs.setAdapter(dataAdapter);
        return view;
    }

    @OnClick(R.id.powerTV)
    public void powerButtonClicked() {
        try {
            irTransmitter.sendIR(genericIRCodes.getIRC_POWER());
        } catch (IRTransmitter.NoIREmitterException e) {
            e.printStackTrace();
        }


    }

    @OnClick(R.id.menuTV)
    public void menuButtonClicked() {
        try {
            irTransmitter.sendIR(genericIRCodes.getIRC_MENU());
        } catch (IRTransmitter.NoIREmitterException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.backTV)
    public void backButtonClicked() {
        try {
            irTransmitter.sendIR(genericIRCodes.getIRC_RETURN());
        } catch (IRTransmitter.NoIREmitterException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.channelUpTV)
    public void channelUpButtonClicked() {
        try {
            irTransmitter.sendIR(genericIRCodes.getIRC_CHANNEL_UP());
        } catch (IRTransmitter.NoIREmitterException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.channelDownTV)
    public void channelDownButtonClicked() {
        try {
            irTransmitter.sendIR(genericIRCodes.getIRC_CHANNEL_DOWN());
        } catch (IRTransmitter.NoIREmitterException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.volumeUpTV)
    public void volumeUpButtonClicked() {
        try {
            irTransmitter.sendIR(genericIRCodes.getIRC_VOLUME_UP());
        } catch (IRTransmitter.NoIREmitterException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.volumeDownTV)
    public void volumeDownButtonClicked() {
        try {
            irTransmitter.sendIR(genericIRCodes.getIRC_VOLUME_DOWN());
        } catch (IRTransmitter.NoIREmitterException e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.muteTV)
    public void muteButtonClicked() {
        try {
            irTransmitter.sendIR(genericIRCodes.getIRC_MUTE());
        } catch (IRTransmitter.NoIREmitterException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        sensorService.unregisterListener(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (sensor != null) {
            sensorService.unregisterListener(this);
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // do sth
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_remote;
    }

    public static float Round(float Rval, int Rpl) {
        float p = (float) Math.pow(10, Rpl);
        Rval = Rval * p;
        float tmp = Math.round(Rval);
        return (float) tmp / p;
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            long curTime = System.currentTimeMillis();
            if ((curTime - lastUpdate) > 100) {
                lastUpdate = curTime;

                float[] values = event.values;
                x = values[0];
                y = values[1];
                z = values[2];

                if (Round(x, 4) > 10.0000 || Round(x, 4) < -10.0000) {
                    Toast.makeText(getContext(), "Shake detected - sending POWER command", Toast.LENGTH_SHORT).show();
                    powerButtonTV.performClick();
                }
                last_x = x;
                last_y = y;
                last_z = z;
            }
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
