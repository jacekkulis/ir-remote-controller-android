package pl.dmcs.remotecontrol.fragment;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import pl.dmcs.remotecontrol.R;

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

    public RemoteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sensorService = (SensorManager) getContext().getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorService.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if (sensor != null) {
            sensorService.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
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
                long diffTime = (curTime - lastUpdate);
                lastUpdate = curTime;

                float[] values = event.values;
                x = values[0];
                y = values[1];
                z = values[2];

                if (Round(x, 4) > 10.0000) {
                    Log.d("sensor", "X Right axis: " + x);
                    Toast.makeText(getContext(), "Right shake detected", Toast.LENGTH_SHORT).show();
                } else if (Round(x, 4) < -10.0000) {
                    Log.d("sensor", "X Left axis: " + x);
                    Toast.makeText(getContext(), "Left shake detected", Toast.LENGTH_SHORT).show();
                }

                float speed = Math.abs(x + y + z - last_x - last_y - last_z) / diffTime * 10000;

                // Log.d("sensor", "diff: " + diffTime + " - speed: " + speed);
                if (speed > SHAKE_THRESHOLD) {
                    //Log.d("sensor", "shake detected w/ speed: " + speed);
                    //Toast.makeText(this, "shake detected w/ speed: " + speed, Toast.LENGTH_SHORT).show();
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
