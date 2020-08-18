package br.com.jogo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.jogo.api.models.Mensagem;
import br.com.jogo.api.models.Usuario;
import br.com.jogo.api.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public Usuario cadastro(Usuario usuario){
		String pass = passwordEncoder.encode(usuario.getSenha());
		usuario.setSenha(pass);
		enviarEmail(usuario);
		return usuarioRepository.save(usuario);
	}

	private void enviarEmail(Usuario usuario) {
		Mensagem msg = new Mensagem();
		msg.setTopico("Bem vindo a Kabil");
		msg.setDestinatario(usuario.getEmail());
		msg.setCorpo("Só um teste nessa merda vtnc se envia essa merda");
		emailService.enviar(msg);
	}
}
