package com.naia.microservices.order.client;

// import org.springframework.cloud.openfeign.FeignClient; Untuk komunikasi antar layanan
// feign client adalah interface yang digunakan untuk mengakses service lain, dalam hal ini service inventory
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

// import groovy.util.logging.Slf4j;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

// @FeignClient(value = "inventory", url = "${inventory.url}")
// @Slf4j
public interface InventoryClient {

    Logger log = LoggerFactory.getLogger(InventoryClient.class);

    // @RequestMapping(method = RequestMethod.GET, value =  "/api/inventory")
    @GetExchange("/api/inventory")
    @CircuitBreaker(name = "inventory", fallbackMethod = "fallbackMethod")
    @Retry(name = "inventory")
    boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity);

    default boolean fallbackMethod(String skuCode, Integer quantity, Throwable throwable) {
        log.info("Cannot get inventory for skuCode: {}, failure reason: {}", skuCode, throwable.getMessage());
        return false;
    }
} 
// mock adalah objek yang menggantikan objek nyata dalam kode yang digunakan untuk pengujian. 
// Mocking adalah teknik yang digunakan dalam pengujian perangkat lunak untuk membuat objek yang menggantikan objek nyata.