package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    int cargaHoraria;

    public Curso() {
    }

    @Override
    public double caucularXp() {
        return XPPadrao*cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso:"+"\n" +
                "titulo= '" + getTitulo() + '\'' +
                ", descricao ='" + getDescricao() + '\'' +
                ", cargaHoraria = " + cargaHoraria;
    }
}
