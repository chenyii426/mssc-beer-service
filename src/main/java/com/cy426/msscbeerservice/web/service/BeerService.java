package com.cy426.msscbeerservice.web.service;

import com.cy426.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    BeerDto updateById(UUID beerId, BeerDto beerDto);
}
