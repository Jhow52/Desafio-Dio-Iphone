public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("-----------Music------------");
        music(iphone);
        System.out.println("----------Chamada-----------");
        chamada(iphone);
        System.out.println("----------Internet-------------");
        internet(iphone);
    }

    public static void music(ReprodutorMusical reprodutorMusical){
        reprodutorMusical.selecionarMusica(": Post Malone");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    }

    public static void chamada(AparelhoTelefonico aparelhoTelefonico){
        aparelhoTelefonico.ligar(": Para amiga");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public static void internet(NavegadorInternet navegadorInternet){
        navegadorInternet.adicionarAba();
        navegadorInternet.exibirPagina(": https://app.diagrams.net/");
        navegadorInternet.atualizarPagina();
    }
}