package com.myproductservice.paymentservice.Services;

import com.myproductservice.paymentservice.PaymentGateway.PaymentGatewayFactory;
import com.myproductservice.paymentservice.PaymentGateway.PaymentGatewayInterface;
import com.myproductservice.paymentservice.PaymentGateway.RazorpayPaymentGateway;
import com.myproductservice.paymentservice.models.PaymentGateway;
import com.myproductservice.paymentservice.models.PaymentStatus;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGatewayFactory paymentGatewayFactory;
    public PaymentService(PaymentGatewayFactory paymentGatewayFactory) {
        this.paymentGatewayFactory = paymentGatewayFactory;
    }
    public String createPaymentLink(Long orderId){

        // need details of order:
        // Amount of order
        // order order = restTemplate.getForObject
        // userName, phone, email...
        Long amount = 1000L;
        String userName = "Nagendra";
        String userEmail = "nagendra@example.com";
        String userPhone = "123456789";

        PaymentGatewayInterface paymentGatewayInterface = paymentGatewayFactory.getBestPaymentGateway();
        return paymentGatewayInterface.createPaymentLink(orderId, userName, userEmail, userPhone, amount);
    }
    public PaymentStatus getPaymentStatus(Long orderId){
        return null;
    }
}
