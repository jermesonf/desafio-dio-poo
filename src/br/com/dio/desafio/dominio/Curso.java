package br.com.dio.desafio.dominio;

//Classe Curso é filha da classe Conteudo
public class Curso extends Conteudo {

// TUDO QUE ESTÁ COMENTADO, SERIA O QUE PRECISSARIA SE NÃO TIVESSE A CLASSE CONTEUDO REPARE QUE ISSO SE REPETE NA CLASSE CURSO
//    private String titulo;
//    private String descricao;
    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
//                "titulo='" + titulo + '\'' +
//                ", descricao='" + descricao + '\'' +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    //Construtor vazio
    public Curso() {
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }




}
