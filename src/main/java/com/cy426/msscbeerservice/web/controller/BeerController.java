package com.cy426.msscbeerservice.web.controller;

import com.cy426.msscbeerservice.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody @Validated BeerDto beerDto) {

        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);

    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateById(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto) {
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
