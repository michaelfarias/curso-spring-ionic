package com.udemy.cursospring.services;

import org.springframework.mail.SimpleMailMessage;

import com.udemy.cursospring.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
