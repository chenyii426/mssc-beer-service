package com.cy426.msscbeerservice.web.controller;

import com.cy426.msscbeerservice.web.model.BeerDto;
import com.cy426.msscbeerservice.web.service.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@AllArgsConstructor
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        //todo impl
        return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody @Validated BeerDto beerDto) {

        //todo impl
        return new ResponseEntity<>(beerService.saveBeer(beerDto),HttpStatus.CREATED);

    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateById(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto) {
        //todo impl
        return new ResponseEntity<>(beerService.updateById(beerId,beerDto),HttpStatus.NO_CONTENT);
    }
}
