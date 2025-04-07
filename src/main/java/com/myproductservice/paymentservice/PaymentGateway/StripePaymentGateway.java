package com.myproductservice.paymentservice.PaymentGateway;

import com.myproductservice.paymentservice.models.PaymentStatus;

public class StripePaymentGateway implements PaymentGatewayInterface {
    @Override
    public String createPaymentLink(Long Amount, String UserName, String UserEmail, String PhoneNumber, Long orderId) {
        return "";
    }

    @Override
    public PaymentStatus getPaymentStatus(Long paymentId) {
        return null;
    }
}
