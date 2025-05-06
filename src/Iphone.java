import javax.xml.parsers.SAXParser;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendeu");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina" + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando aba");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Escolhendo musica" + musica);
    }
}
