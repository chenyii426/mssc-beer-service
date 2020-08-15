package com.cy426.msscbeerservice.web.serviceImpl;

import com.cy426.msscbeerservice.domain.Beer;
import com.cy426.msscbeerservice.repositories.BeerRepository;
import com.cy426.msscbeerservice.web.controller.NotFoundException;
import com.cy426.msscbeerservice.web.mapper.BeerMapper;
import com.cy426.msscbeerservice.web.model.BeerDto;
import com.cy426.msscbeerservice.web.service.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("beerService")
@AllArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper.beerToBeerDto(
                beerRepository.findById(beerId).orElseThrow(NotFoundException::new)
        );
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(
                beerRepository.save(beerMapper.beerDToToBeer(beerDto))
        );
    }

    @Override
    public BeerDto updateById(UUID beerId, BeerDto beerDto) {
        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);
        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());
        return beerMapper.beerToBeerDto(
                beerRepository.save(beer)
        );
    }
}
