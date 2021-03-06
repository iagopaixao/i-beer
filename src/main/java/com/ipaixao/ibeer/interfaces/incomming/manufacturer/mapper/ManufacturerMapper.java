package com.ipaixao.ibeer.interfaces.incomming.manufacturer.mapper;

import com.ipaixao.ibeer.infrastructure.mapstruct.BaseEntityMapper;
import com.ipaixao.ibeer.infrastructure.mapstruct.BaseMapperConfig;
import com.ipaixao.ibeer.infrastructure.mapstruct.BaseResponseMapper;
import com.ipaixao.ibeer.interfaces.incomming.manufacturer.dto.ManufacturerDTO;
import com.ipaixao.ibeer.domain.manufacturer.Manufacturer;
import com.ipaixao.ibeer.interfaces.incomming.manufacturer.response.ManufacturerResponse;
import org.mapstruct.Mapper;

@Mapper(config = BaseMapperConfig.class)
public interface ManufacturerMapper extends BaseEntityMapper<ManufacturerDTO, Manufacturer>,
        BaseResponseMapper<ManufacturerResponse, Manufacturer> {}
