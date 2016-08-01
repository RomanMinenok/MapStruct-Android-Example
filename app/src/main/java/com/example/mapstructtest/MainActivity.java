package com.example.mapstructtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mapstructtest.model.CarDto;
import com.example.mapstructtest.model.CarType;
import com.example.mapstructtest.model.Engine;
import com.example.mapstructtest.model.EngineDto;
import com.example.mapstructtest.model.ICar;
import com.example.mapstructtest.model.Seat;
import com.example.mapstructtest.model.SeatDto;
import com.example.mapstructtest.model.Size;
import com.example.mapstructtest.model.Tire;
import com.example.mapstructtest.model.mapping.CarInterfaceMapper;
import com.example.mapstructtest.model.mapping.CarMapper;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().hide();

        findViewById(R.id.test_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });

        resultTextView = (TextView) findViewById(R.id.test_text_view);
    }

    private void convert() {
        StringBuilder sb = new StringBuilder();

        sb.append("Testing converting class to class:\n\n");
        sb.append(CarMapper.INSTANCE.carDtoToCar(constructCarDto()).toString());
        sb.append("\n\n");

        sb.append("Testing converting interface to class\n\n");
        ICar iCar = new ICar() {
            @Override
            public String getName() {
                return "Mazda";
            }

            @Override
            public int getEngineCapacity() {
                return 1400;
            }
        };
        sb.append(CarInterfaceMapper.INSTANCE.carInterfaceToCar(iCar));

        resultTextView.setText(sb.toString());
    }

    private CarDto constructCarDto() {
        CarDto carDto = new CarDto();

        carDto.setMake("Toyota");
        carDto.setModelName("Intenza");
        carDto.setSeatCount(5);
        carDto.setType(CarType.MID_SIZE.toString());

        Size size = new Size(3.4f, 2);
        carDto.setSize(size);

        EngineDto engine = new EngineDto();
        engine.setVolume(1600);
        engine.setStrokes(4);
        carDto.setEngine(engine);

        carDto.setTireName("Michelin");
        carDto.setTireSize(21);

        List<SeatDto> seats = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            seats.add(new SeatDto("Spark"));
        }
        carDto.setSeats(seats);

        return carDto;
    }
}
