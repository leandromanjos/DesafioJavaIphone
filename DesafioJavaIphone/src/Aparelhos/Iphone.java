package Aparelhos;

import AparelhoTelefonico.AparelhoTelefonico;
import Navegador.Navegador;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, Navegador, AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o Número: "+ numero);
    }

    @Override
    public void atender() {
       System.out.println("Atendeu");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Mandando para o Correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo a Url: "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Você selecionou esta musica desejada: "+ musica);
    }
    
}
