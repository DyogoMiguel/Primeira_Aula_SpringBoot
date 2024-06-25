package dio.springboot.mensagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagens {
    
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;

    public void enviarComfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        techTeam.setEmail("Tech@Dio.com");
        techTeam.setNome("Marcos");
        System.out.println(techTeam);
        System.out.println("Bem vindo á Tech Elite");
    }
}
