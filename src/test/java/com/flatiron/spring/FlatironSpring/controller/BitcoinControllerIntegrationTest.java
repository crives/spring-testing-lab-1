package com.flatiron.spring.FlatironSpring.controller;

import com.flatiron.spring.FlatironSpring.service.BitcoinService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.contains;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BitcoinController.class)
public class BitcoinControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BitcoinService bitcoinService;

    @Test
    void shouldReturnBitcoinCost() throws Exception {
        mockMvc.perform(get("/bitcoin"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("23659.2377744323057067")));
    }
}
