package com.mballem.pattern.builder;

import com.mballem.pattern.domain.Artigo;

/**
 * Created by http://www.mballem.com/
 */
public interface ArtigoBuilder {

    ArtigoBuilder autor(String autor);
    ArtigoBuilder titulo(String titulo);
    ArtigoBuilder assuntos(String... assuntos);
    ArtigoBuilder totalDePaginas(int total);
    ArtigoBuilder publicadoEm(int dia, int mes, int ano);
    ArtigoBuilder texto(String texto);

    Artigo get();
}
