import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        instanciamento
//        Curso curso1 = new Curso();
//
//        curso1.setTitulo("Curso Java");
//        curso1.setDescricao("Descrição curso Java");
//        curso1.setCargaHoraria(8);
//
//        Curso curso2 = new Curso();
//
//        curso2.setTitulo("Curso Java Script");
//        curso2.setDescricao("Descrição curso Java Script");
//        curso2.setCargaHoraria(8);
//
//        Mentoria mentoria = new Mentoria();
//        mentoria.setTitulo("Mentoria de Java");
//        mentoria.setDescricao("Descrição mentoria Java");
//        //Chamando a classe LocalDate e dizendo para quando criarmos este objeto atribuir a data atual de criação
//        mentoria.setData(LocalDate.now());
//
//
//        //Não é possivel instanciar a classe Conteudo pois é uma classe abstrata
//        //Conteudo conteudo = new Conteudo();
//
//        //Mas é possivel instanciar a classe Curso atraves de Conteudo
//        //Isto é o polimorfismo
//        Conteudo conteudo = new Curso();
//
////        System.out.println(curso1);
////        System.out.println(curso2);
////        System.out.println(mentoria);
//
//
//        Bootcamp bootcamp = new Bootcamp();
//        bootcamp.setNome("Bootcamp Java Developer");
//        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
//        bootcamp.getConteudos().add(curso1);
//        bootcamp.getConteudos().add(curso2);
//        bootcamp.getConteudos().add(mentoria);
//
//        System.out.println("--------------------------------------------------------------------");
//
//        //KET E FRAJOLA SÃO MEUS GATOS :3
//
//        Dev devKet = new Dev();
//        devKet.setNome("Ket");
//        devKet.inscreverBootcamp(bootcamp);
//
//        System.out.println("KET - Conteudos Inscritos: " + devKet.getConteudosInscritos());
//        System.out.println("KET (antes do metodo progredir) - Conteudos Concluidos: " + devKet.getConteudosConcluidos());
//        devKet.progredir(); // este metodo tem a função de inserir o dev no conteudo concluido e excluir do conteudo inscrito
//        System.out.println("KET - Conteudos Concluidos: " + devKet.getConteudosConcluidos());
//        devKet.progredir();
//        devKet.progredir();
//        System.out.println("KET - Calcular XP: " + devKet.calcularTotalXp());// ao utilizar o metodo progredir o XP do participante aumenta, exemplo: KET tem dois metodos progredir e Frajola apena um veja o resultado no "Run", 190 XP é o maximo
//
//        System.out.println("--------------------------------------------------------------------");
//
//        Dev devFraj = new Dev();
//        devFraj.setNome("Frajola");
//        devFraj.inscreverBootcamp(bootcamp);
//
//        System.out.println("FRAJOLA - Conteudos Inscritos: " + devFraj.getConteudosInscritos());
//        System.out.println("FRAJOLA (antes do metodo progredir) - Conteudos Concluidos: " + devFraj.getConteudosConcluidos());
//        devFraj.progredir(); // este metodo tem a função de inserir o dev no conteudo concluido e excluir do conteudo inscrito
//        System.out.println("FRAJOLA - Conteudos Concluidos: " + devFraj.getConteudosConcluidos());
//        System.out.println("FRAJOLA - Calcular XP: " + devFraj.calcularTotalXp());
//
//        System.out.println("--------------------------------------------------------------------");


        //Criando os cursos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição curso Java");
        cursoJava.setCargaHoraria(16);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Descrição curso Python");
        cursoPython.setCargaHoraria(12);

        Curso cursoWeb = new Curso();
        cursoWeb.setTitulo("Curso Web");
        cursoWeb.setDescricao("Descrição curso Web");
        cursoWeb.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        //Chamando a classe LocalDate e dizendo para quando criarmos este objeto atribuir a data atual de criação
        mentoria.setData(LocalDate.now());


        //Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);
        bootcamp.getConteudos().add(cursoWeb);
        bootcamp.getConteudos().add(mentoria);



        //Criando sistema para o usuario

        Scanner scanner = new Scanner(System.in);
        Dev devNome = new Dev();

        System.out.println("Seja bem-vindo ao bootcamp");

        System.out.println("Qual o seu nome? ");
        String nomeParticipante = scanner.next();



            System.out.println("Deseja participar do bootcamp? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int opcao = scanner.nextInt();

            if(opcao == 1)
            {
                devNome.setNome(nomeParticipante);
                devNome.inscreverBootcamp(bootcamp);
            }
            else
            {
                System.out.println("Que pena, quem sabe outra hora...");
            }

        while(true)
        {
            System.out.println("MENU");
            System.out.println("1 - Conteudos Inscritos");
            System.out.println("2 - Conteudos Concluidos");
            System.out.println("3 - Progredir no curso");
            System.out.println("4 - Calcular XP");
            System.out.println("0 - Sair");
            int opcaoMenu = scanner.nextInt();


            if (opcaoMenu == 1)
            {
                System.out.println("----------- Conteudos Inscritos -----------");
                System.out.println("Desenvolvedor: " + nomeParticipante);
                System.out.println("Conteudo " + devNome.getConteudosInscritos());
                System.out.println("--------------------------------------------");
            }
            else if(opcaoMenu == 2)
            {

                if(devNome.getConteudosConcluidos().isEmpty())
                {
                    System.out.println("----------- Conteudos Concluidos -----------");
                    System.out.println("Você precisa progredir no curso para mostrar os conteudos");
                    System.out.println("--------------------------------------------");
                }
                else
                {
                    System.out.println("----------- Conteudos Concluidos -----------");
                    System.out.println("Desenvolvedor: " + nomeParticipante);
                    System.out.println("Conteudo " + devNome.getConteudosConcluidos());
                    System.out.println("--------------------------------------------");
                }

            }
            else if(opcaoMenu == 3)
            {
                System.out.println("----------- Conteudos Concluidos -----------");
                System.out.println("Desenvolvedor: " + nomeParticipante);
                devNome.progredir();
                System.out.println("Você progrediu +" + devNome.calcularTotalXp());
                System.out.println("--------------------------------------------");
            }
            else if (opcaoMenu == 4)
            {
                System.out.println("----------- Calcular XP -----------");
                System.out.println("Desenvolvedor: " + nomeParticipante);
                System.out.println("XP: " + devNome.calcularTotalXp());
                System.out.println("--------------------------------------------");
            }
            else
            {
                System.out.println("--------------------------------------------");
                System.out.println("Até mais...");
                break;
            }

        }

        scanner.close();


    }
}
