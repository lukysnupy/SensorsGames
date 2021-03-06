package cz.ruzickalukas.sensorsgames.main;

import android.content.Context;
import android.hardware.Sensor;

import java.util.ArrayList;
import java.util.List;

import cz.ruzickalukas.sensorsgames.R;

class GameManager {

    static List<Game> getGamesList(Context context) {
        List<Game> gamesList = new ArrayList<>();
        gamesList.add(new Game(context, R.string.ball, R.string.accelerometer));
        gamesList.add(new Game(context, R.string.treasure,
                R.string.gps, R.string.accelerometer, R.string.magnetometer));
        gamesList.add(new Game(context, R.string.marmot, R.string.step_detector));

        return gamesList;
    }

    static int getSensorConstant(int sensorRes) {
        switch (sensorRes) {
            case R.string.accelerometer:
                return Sensor.TYPE_ACCELEROMETER;
            case R.string.magnetometer:
                return Sensor.TYPE_MAGNETIC_FIELD;
            case R.string.step_detector:
                return Sensor.TYPE_STEP_DETECTOR;
            default:
                return 0;
        }
    }

}
