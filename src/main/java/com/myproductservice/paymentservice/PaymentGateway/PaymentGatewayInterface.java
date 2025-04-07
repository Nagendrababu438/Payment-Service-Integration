package com.myproductservice.paymentservice.PaymentGateway;

import com.myproductservice.paymentservice.models.PaymentStatus;

public interface PaymentGatewayInterface {
    String createPaymentLink(
            Long Amount,
            String UserName,
            String UserEmail,
            String PhoneNumber,
            Long orderId

    );

    //String createPaymentLink(Long Amount, String UserName, String UserEmail, String PhoneNumber, Long orderId);

    PaymentStatus getPaymentStatus(
            Long paymentId
    );
}
