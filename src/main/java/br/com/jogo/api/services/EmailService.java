package br.com.jogo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.jogo.api.models.Mensagem;
import br.com.jogo.api.models.Usuario;

@Service
public class EmailService implements ExecutaService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	private Usuario usuario;
	private Mensagem msg;
	
	public EmailService(Usuario usuario, Mensagem msg ) {
		this.usuario = usuario;
		this.msg = msg;
	}

	@Override
	public void executa() {
		montaMsg();
		enviaMsg();
	}

	private void enviaMsg() {
		System.out.println("Enviando Email...");
		SimpleMailMessage mensagem = new SimpleMailMessage();
		mensagem.setFrom("kabil.contabil@gmail.com");
		mensagem.setTo(msg.getDestinatario());
		mensagem.setSubject(msg.getTopico());
		mensagem.setText(msg.getCorpo());
		javaMailSender.send(mensagem);
		System.out.println("Enviado!");
	}

	private void montaMsg() {
		msg.setTopico("Bem vindo a Kabil");
		msg.setDestinatario(usuario.getEmail());
		msg.setCorpo("Só um teste nessa merda vtnc se envia essa merda");
	}
}
