package com.example.mapstructtest.model.mapping;

import com.example.mapstructtest.model.Car;
import com.example.mapstructtest.model.ICar;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarInterfaceMapper extends EngineMapper, SeatMapper {

    CarInterfaceMapper INSTANCE = Mappers.getMapper(CarInterfaceMapper.class);

    @Mappings({
        @Mapping(source = "name", target = "make"),
        @Mapping(source = "engineCapacity", target = "engine.volume"),
    })
    Car carInterfaceToCar(ICar car);
}