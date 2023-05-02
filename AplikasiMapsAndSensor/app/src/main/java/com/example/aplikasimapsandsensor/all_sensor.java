/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.aplikasimapsandsensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class all_sensor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_sensor);
        SensorManager sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);
        ListView listView = findViewById(R.id.lv_sensors);
        listView.setAdapter(new MysensorAdapter(this, R.layout.item_sensor, sensorList));
    }

    class MysensorAdapter extends ArrayAdapter<Sensor> {
        private int txtResouceID;

        public MysensorAdapter(Context context, int resource, List<Sensor> objects) {
            super(context, resource, objects);
            this.txtResouceID = resource;
        }

        public class ViewHolder {
            private TextView itemView;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            int idSensor = position + 1;
            ViewHolder viewHolder = null;
            if (convertView == null) {
                convertView = LayoutInflater.from(this.getContext())
                        .inflate(txtResouceID, parent, false);
                viewHolder = new ViewHolder();
                viewHolder.itemView = convertView.findViewById(R.id.txt_item_sensor);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            Sensor item = getItem(position);

            if (item != null) {
                viewHolder.itemView.setText(idSensor + ", Name : " + item.getName() + "\nint Type : " + item.getType()
                        + "\nPower : " + item.getPower() + "mAh\nMax range : " + item.getMaximumRange());
            }

            return convertView;
        }
    }
}