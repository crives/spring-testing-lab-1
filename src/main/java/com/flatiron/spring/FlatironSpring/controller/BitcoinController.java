package com.flatiron.spring.FlatironSpring.controller;

import com.flatiron.spring.FlatironSpring.service.BitcoinService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class BitcoinController {
    @Autowired
    private BitcoinService bitcoinService;

    @GetMapping("/api/bitcoin")
    public String getBitcoinCost() {
        return bitcoinService.getBitcoinCost("bitcoin");
    }
}
