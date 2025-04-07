package com.myproductservice.paymentservice.PaymentGateway;

import com.myproductservice.paymentservice.models.PaymentGateway;
import com.razorpay.RazorpayClient;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class PaymentGatewayFactory {
    private RazorpayPaymentGateway razorpayPaymentGateway;

    public PaymentGatewayFactory(RazorpayPaymentGateway razorpayPaymentGateway) {
        this.razorpayPaymentGateway = razorpayPaymentGateway;
    }

    public PaymentGatewayInterface getBestPaymentGateway() {

        return razorpayPaymentGateway;


    }
}
