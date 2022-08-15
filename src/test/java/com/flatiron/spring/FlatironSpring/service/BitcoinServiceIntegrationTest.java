package com.flatiron.spring.FlatironSpring.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

public class BitcoinServiceIntegrationTest {
    @Test
    void shouldReturnBitcoinPrice() {
        BitcoinService bitcoinService = new BitcoinService();
        String bitcoinPrice = bitcoinService.getBitcoinCost();

        assertThat(bitcoinPrice).isNotNull();
    }
}
