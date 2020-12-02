package br.com.jogo.api.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import br.com.jogo.api.models.Mensagem;
import br.com.jogo.api.models.Usuario;
import br.com.jogo.api.services.interfaces.ExecutaService;

public class EmailService implements ExecutaService {

	private Usuario usuario;
	private Mensagem msg;
	private JavaMailSender javaMailSender;
	
	public EmailService(Usuario usuario, Mensagem msg, JavaMailSender javaMailSender) {
		this.usuario = usuario;
		this.msg = msg;
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void executa() {
		montaMsg();
		enviaMsg();
	}

	private void enviaMsg() {
		try {
			System.out.println("Enviando Email...");
			SimpleMailMessage mensagem = new SimpleMailMessage();
			mensagem.setFrom("kabil.contabil@gmail.com");
			mensagem.setTo(msg.getDestinatario());
			mensagem.setSubject(msg.getTopico());
			mensagem.setText(msg.getCorpo());
			javaMailSender.send(mensagem);
			System.out.println("Enviado!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void montaMsg() {
		msg.setTopico("Bem vindo a Kabil");
		msg.setDestinatario(usuario.getEmail());
		msg.setCorpo("O melhor jogo contabil que voce ja viu!");
	}
}
