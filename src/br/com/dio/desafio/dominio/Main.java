package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso=new Curso();
        curso.setTitulo("Curso de java");
        curso.setDescricao("Descricao do curso de java");
        curso.setCargaHoraria(8);
        System.out.println(curso);
        Curso curso1=new Curso();
        curso1.setTitulo("Curso de javaScript");
        curso1.setDescricao("Descricao do curso de java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);
        System.out.println();
    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descricao mentoria de java");
    mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

    }

}
