package com.flatiron.spring.FlatironSpring.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

public class BitcoinServiceIntegrationTest {
    @WithMockUser(username = "fakeuser", authorities = "admin")
    @Test
    void shouldReturnBitcoinPrice() {
        BitcoinService bitcoinService = new BitcoinService();
        String bitcoinPrice = bitcoinService.getBitcoinCost("bitcoin");

        assertThat(bitcoinPrice).isNotNull();
    }
}
