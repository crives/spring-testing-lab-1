package com.flatiron.spring.FlatironSpring.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JokeServiceIntegrationTest {

    @Test
    void shouldReturnRandomDadJoke() {
        JokeService jokeService = new JokeService();
        String firstRandomDadJoke = jokeService.getDadJoke();
        assertThat(firstRandomDadJoke).isNotNull();
        String secondRandomDadJoke = jokeService.getDadJoke();
        assertThat(secondRandomDadJoke).isNotNull();
        assertThat(firstRandomDadJoke).isNotEqualTo(secondRandomDadJoke);
    }

    /*
    Note: this is not a "unit" test because it actually lets the real service (not mocked) make a request to the real API and tests the actual response (albeit not the actual precise value, for the reasons we discussed)

    You should now be able to rerun your integration test and have it pass successfully.
     */
}