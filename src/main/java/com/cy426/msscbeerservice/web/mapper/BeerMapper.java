package com.cy426.msscbeerservice.web.mapper;

import com.cy426.msscbeerservice.domain.Beer;
import com.cy426.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDToToBeer(BeerDto beerDto);

}
