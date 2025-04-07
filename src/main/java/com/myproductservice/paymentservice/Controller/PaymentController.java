package com.myproductservice.paymentservice.Controller;

import com.myproductservice.paymentservice.DTO.CraetePaymentlinkRequestDTO;
import com.myproductservice.paymentservice.DTO.CreatePaymentLinkResponseDTO;
import com.myproductservice.paymentservice.Services.PaymentService;
import com.myproductservice.paymentservice.models.PaymentStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")

public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    // user -> CreateOrder -> Order Service
    // user -> createPaymentLink -> Payment Service
    @PostMapping("/")
    public CreatePaymentLinkResponseDTO CreatePaymentLink(@RequestBody CraetePaymentlinkRequestDTO requestDTO) {
        String redirectUrl = this.paymentService.createPaymentLink(requestDTO.getOrderId());
        CreatePaymentLinkResponseDTO responseDTO = new CreatePaymentLinkResponseDTO();
        responseDTO.setURL(redirectUrl);

        return responseDTO;
    }

    @GetMapping("/{id}/")
    public PaymentStatus CheckPaymentStatus(@PathVariable("id")  Long paymentId) {
        return this.paymentService.getPaymentStatus(paymentId);
    }

}
