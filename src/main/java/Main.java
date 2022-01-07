import Desafio.*;

import java.time.LocalDate;

public class Main {
    //teste das classes.
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascrip");
        curso2.setDescricao("Descrição curso de javascript");
        curso2.setCargaHoraria(15);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de "+devGustavo.getNome()+": "+devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("Conteudos concluidos de "+devGustavo.getNome()+": "+devGustavo.getConteudosConcluidos());

        Dev devThais = new Dev();
        devThais.setNome("Thais");
        devThais.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de "+devThais.getNome()+": "+devThais.getConteudosInscritos());
        devThais.progredir();
        devThais.progredir();
        devThais.progredir();
        System.out.println("Conteudos concluidos de "+devThais.getNome()+": "+devThais.getConteudosConcluidos());
    }
}
