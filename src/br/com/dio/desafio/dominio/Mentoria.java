package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//Usar extends diz que a classe atual se extende(filha) da classe conteudo
public class Mentoria extends Conteudo {

// TUDO QUE ESTÁ COMENTADO, SERIA O QUE PRECISSARIA SE NÃO TIVESSE A CLASSE CONTEUDO REPARE QUE ISSO SE REPETE NA CLASSE CURSO
//    private String titulo;
//    private String descricao;
    private LocalDate data;

    //Metodo que é a herança da Classe Conteudo
    @Override
    public double calcularXp() {
        //XP_PADRAO é a constante que foi criada na classe Conteudo
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                //"titulo='" + titulo + '\'' +
                //", descricao='" + descricao + '\'' +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


    //Construtor vazio
    public Mentoria() {
    }

//    public String getTitulo() {
//        return titulo;
//    }

//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }

//    public String getDescricao() {
//        return descricao;
//    }

//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


}
