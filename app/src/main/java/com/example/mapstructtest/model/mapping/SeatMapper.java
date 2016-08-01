package com.example.mapstructtest.model.mapping;

import com.example.mapstructtest.model.Seat;
import com.example.mapstructtest.model.SeatDto;

import org.mapstruct.Mapper;

@Mapper
public interface SeatMapper {

    Seat seatDtoToSeat(SeatDto engineDto);
}