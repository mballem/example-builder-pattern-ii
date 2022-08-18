package com.mballem.pattern.builder;

import com.mballem.pattern.domain.Artigo;
import com.mballem.pattern.domain.Blog;
import com.mballem.pattern.domain.Jornal;

import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by http://www.mballem.com/
 */
public class JornalBuilder implements ArtigoBuilder {

    private Artigo artigo;
    
    public JornalBuilder() {
        this.artigo = new Jornal();
    }

    public static ArtigoBuilder builder() {
        return new JornalBuilder();
    }

    @Override
    public ArtigoBuilder autor(String autor) {
        this.artigo.setAutor(autor);
        return this;
    }

    @Override
    public ArtigoBuilder titulo(String titulo) {
        this.artigo.setTitulo(titulo);
        return this;
    }

    @Override
    public ArtigoBuilder assuntos(String... assuntos) {
        this.artigo.setMarcacoes(Arrays.asList(assuntos));
        return this;
    }

    @Override
    public ArtigoBuilder totalDePaginas(int total) {
        this.artigo.setPaginas(total);
        return this;
    }

    @Override
    public ArtigoBuilder publicadoEm(int dia, int mes, int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes, dia);
        this.artigo.setDataDaPublicacao(calendar.getTime());
        return this;
    }

    @Override
    public ArtigoBuilder texto(String texto) {
        this.artigo.setTexto(texto);
        return this;
    }

    @Override
    public Artigo get() {
        return this.artigo;
    }
}
