package com.flatiron.spring.FlatironSpring.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitcoinService {

    public String getBitcoinCost() {
        RestTemplate restTemplate = new RestTemplate();
        String apiURL = "https://api.coincap.io/v2/assets/bitcoin";
        String result = restTemplate.getForObject(apiURL, Data.class).getData().getPriceUsd();

        return result;
    }
}

@lombok.Data
class Bitcoin {
    public String id;
    public String priceUsd;
}

@lombok.Data
class Data {
    private Bitcoin data;
}
/*
{"data":
{"id":"bitcoin",
"rank":"1",
"symbol":"BTC",
"name":"Bitcoin",
"supply":"19117950.0000000000000000",
"maxSupply":"21000000.0000000000000000",
"marketCapUsd":"452316124809.7080988854052650",
"volumeUsd24Hr":"13563392303.4398436236969536",
"priceUsd":"23659.2377744323057067",
"changePercent24Hr":"2.3786238601448047",
"vwap24Hr":"23459.8097874689960558",
"explorer":"https://blockchain.info/"}
,"timestamp":1660162761242}
 */
