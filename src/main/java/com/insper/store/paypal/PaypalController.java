package com.insper.store.paypal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "store-paypal")
public interface PaypalController {

    @PostMapping("/payments/create-payment")
    ResponseEntity<?> createPayment(@RequestBody PaypalIn paypalIn);

    @PostMapping("/payments/execute-payment")
    public ResponseEntity<?> executePayment(@RequestParam("paymentId") String paymentId, @RequestParam("payerId") String payerId);
}
