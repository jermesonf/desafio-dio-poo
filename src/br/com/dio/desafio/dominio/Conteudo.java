package br.com.dio.desafio.dominio;

//Classes abstratas nçao podem ser instanciadas
//Criamos classes abstratas para que as classes filhas usem seus atributos, assim evita repetição de codigo, exemplo
//nass classes filhas mentoria e curso existe atributo titulo e descrição, para que não haja repetição de codigo criamos uma unica classe abstrata
//que recebe esses atributos e passa como heranca esses atributos para seus filhos.

public abstract class Conteudo {

    //constante
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
