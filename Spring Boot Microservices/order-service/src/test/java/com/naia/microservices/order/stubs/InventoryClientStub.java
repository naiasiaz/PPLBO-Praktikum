package com.naia.microservices.order.stubs;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;;

public class InventoryClientStub {

    public static void stubInventoryCall(String skuCode, Integer quantity) {
        stubFor(get(urlEqualTo("/api/inventory?skuCode=" + skuCode + "&quantity=" + quantity))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("true")));
    }
}

// kenapa yang di mock urlnya? knp ga langsung manggil inventory service?
// karena kita hanya menguji service itu saja, bukan service lainnya
// kita hanya ingin tahu apakah service ini berjalan dengan baik atau tidak