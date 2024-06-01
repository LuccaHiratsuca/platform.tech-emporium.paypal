package com.insper.store.paypal;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record PaypalOut (
    String userId,      
    String paymentId,
    String status,
    String message
) { }
