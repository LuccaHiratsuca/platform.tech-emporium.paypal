package com.insper.store.paypal;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record PaypalIn (
    String userId,        // Adicionado para vincular o pagamento ao usuário
    Double amount,
    String currency,
    String description,
    String paymentMethod
) { }
