package com.example;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web");
    }
}
