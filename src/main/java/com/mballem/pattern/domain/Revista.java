package com.mballem.pattern.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by http://www.mballem.com/
 */
public class Revista implements Artigo {

    private String autor;
    private String titulo;
    private List<String> marcacoes;
    private int paginas;
    private Date publicado;
    private String texto;

    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getMarcacoes() {
        return marcacoes;
    }

    @Override
    public void setMarcacoes(List<String> marcacoes) {
        this.marcacoes = marcacoes;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Date isPublicado() {
        return publicado;
    }

    @Override
    public void setDataDaPublicacao(Date data) {
        this.publicado = data;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", marcacoes=" + marcacoes +
                ", paginas=" + paginas +
                ", publicado=" + publicado +
                ", texto='" + texto + '\'' +
                '}';
    }
}
