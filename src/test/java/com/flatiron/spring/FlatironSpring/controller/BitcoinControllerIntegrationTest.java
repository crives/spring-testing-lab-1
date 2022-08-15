package com.flatiron.spring.FlatironSpring.controller;

import com.flatiron.spring.FlatironSpring.service.BitcoinService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.when;
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

    @WithMockUser(username = "fakeuser", authorities = "admin")
    @Test
    void shouldReturnBitcoinCost() throws Exception {
        when(bitcoinService.getBitcoinCost("bitcoin")).thenReturn("1");
        // Test controller with mock bitcoinService to only test the controller
        mockMvc.perform(get("/bitcoin"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("1")));
    }
}
