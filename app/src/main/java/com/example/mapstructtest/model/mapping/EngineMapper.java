package com.example.mapstructtest.model.mapping;

import com.example.mapstructtest.model.Engine;
import com.example.mapstructtest.model.EngineDto;

import org.mapstruct.Mapper;

@Mapper
public interface EngineMapper {

    Engine engineDtoToEngine(EngineDto engineDto);
}