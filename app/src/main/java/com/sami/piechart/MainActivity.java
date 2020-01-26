package com.sami.piechart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChartView pieChartView = findViewById(R.id.chart);


        List<SliceValue> pieData = new ArrayList<SliceValue>();

        pieData.add(new SliceValue(40,R.color.colorPrimary).setLabel("false : 40"));
        pieData.add(new SliceValue(60, R.color.colorPrimaryDark).setLabel("true : 60"));

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(25);
        pieChartData.setHasCenterCircle(true).setCenterText1("SAMI EL GEN B YWEN");

        pieChartView.setPieChartData(pieChartData);



    }
}
