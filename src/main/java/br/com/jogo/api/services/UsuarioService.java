package br.com.jogo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.jogo.api.models.Mensagem;
import br.com.jogo.api.models.Usuario;
import br.com.jogo.api.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Usuario cadastro(Usuario usuario){
		configuraSenha(usuario);
		new EmailService(usuario, new Mensagem(), javaMailSender).executa();
		return usuarioRepository.save(usuario);
	}

	private void configuraSenha(Usuario usuario) {
		String pass = passwordEncoder.encode(usuario.getSenha());
		usuario.setSenha(pass);
	}
}
