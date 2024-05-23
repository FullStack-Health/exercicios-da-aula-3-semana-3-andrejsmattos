import java.time.LocalDate;

public class Jogador {

    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoes;
    Boolean suspenso;

    Boolean verificarCondicaoDeJogo() {
        if(int cartoes <3){
            return false;
        }
    }

}
