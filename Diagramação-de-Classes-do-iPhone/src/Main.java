import com.example.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone myPhone = new iPhone();

        myPhone.tocar("Canção X");
        myPhone.pausar();
        myPhone.selecionarMusica("Canção Y");

        myPhone.ligar("123-456-7890");
        myPhone.atender();
        myPhone.iniciarCorreioDeVoz();

        myPhone.exibirPagina("www.example.com");
        myPhone.adicionarNovaAba("www.openai.com");
        myPhone.atualizarPagina();
    }
}
