package com.flatiron.spring.FlatironSpring.controller;

import com.flatiron.spring.FlatironSpring.service.BitcoinService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BitcoinControllerUnitTest {

    @Test
    void shouldReturnBitcoinPrice() {

        BitcoinService bitcoinService = Mockito.mock(BitcoinService.class);
        String priceUsd = "23659.2377744323057067";

        BitcoinController bitcoinController = new BitcoinController(bitcoinService);
        when(bitcoinService.getBitcoinCost()).thenReturn(priceUsd);

        String expected = priceUsd;
        String actual = bitcoinController.getBitcoinCost();
        assertEquals(expected, actual);
    }
}