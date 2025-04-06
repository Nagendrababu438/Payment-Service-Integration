# 💳 PaymentService - Razorpay Integration (Spring Boot)

This is a Spring Boot-based microservice that integrates with **Razorpay** to handle secure payment processing for e-commerce or online services. It includes features such as order creation, payment status tracking via **Webhook callbacks**, and testing with Razorpay test cards.

---

## 🚀 Features

- ✅ Integration with Razorpay API for order creation and payment handling
- 📡 Webhook support to receive and process real-time payment status updates
- 🔐 Secure transaction workflow with HMAC signature verification
- 🧪 Tested end-to-end using Razorpay test cards
- 🛠 Built using **Spring Boot**, **REST APIs**, and follows a modular service-based architecture

---

## 📌 Technologies Used

- Java 17
- Spring Boot 3.x
- Razorpay Java SDK
- RESTful APIs
- Maven
- Postman (for testing)
- Git & GitHub

---

## 🧩 API Endpoints

| Method | Endpoint                 | Description                       |
|--------|--------------------------|-----------------------------------|
| POST   | `/api/payment/create`    | Creates a Razorpay order          |
| POST   | `/api/payment/webhook`   | Handles Webhook callback from Razorpay |

---

## 🔐 Webhook Verification

Webhook data is verified using Razorpay's **HMAC SHA256** signature to ensure data integrity and security.

---

## 🧪 Testing

You can test this service using:
- Razorpay’s [Test Card Numbers](https://razorpay.com/docs/payments/test-card-upi-details/)
- Tools like **Postman** to simulate order creation and **ngrok** to expose local webhook endpoint (optional)

---

## 📁 Project Structure

