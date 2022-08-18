package com.mballem.pattern.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by http://www.mballem.com/
 */
public interface Artigo {

    void setAutor(String nome);
    void setTitulo(String nome);
    void setMarcacoes(List<String> marcacoes);
    void setPaginas(int paginas);
    void setDataDaPublicacao(Date data);
    void setTexto(String texto);
    String toString();
}
