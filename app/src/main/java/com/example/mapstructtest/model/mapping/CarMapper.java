package com.example.mapstructtest.model.mapping;

import com.example.mapstructtest.model.Car;
import com.example.mapstructtest.model.CarDto;
import com.example.mapstructtest.model.Engine;
import com.example.mapstructtest.model.EngineDto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper extends EngineMapper, SeatMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mappings({
        @Mapping(source = "seatCount", target = "numberOfSeats"),
        @Mapping(source = "modelName", target = "model"),
        @Mapping(source = "size.width", target = "width"),
        @Mapping(source = "size.length", target = "length"),
        @Mapping(source = "tireName", target = "tire.name"),
        @Mapping(source = "tireSize", target = "tire.diameter")
    })
    Car carDtoToCar(CarDto car);
}