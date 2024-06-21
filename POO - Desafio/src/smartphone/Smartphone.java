package smartphone;

import smartphone.iphone.Iphone;

public class Smartphone {
    public static void main(String[] args) {
        Iphone ip = new Iphone();

        ip.tocar();
        ip.pausar();
        ip.selecionarMusica("The Night Santa Went Crazy");
        ip.ligar("(00)98989-8989");
        ip.atender();
        ip.iniciarCorreioVoz();
        ip.exibirPagina("https://web.dio.me/users/igormoura04?tab=achievements");
        ip.adicionarNovaAba();
        ip.atualizarPagina();
    }
}
