# Simplificando com Builder Pattern – 2

> Continuando os estudos sobre o padrão de projetos **Buider**, desta vez será criado um novo projeto usando a
> implementação de interfaces Java para o desenvolvimento do padrão Builder.


## 🔗 **Projeto baseado no tutorial** 

* <a href="https://www.mballem.com/post/simplificando-com-builder-pattern-2/">Simplificando com Builder Pattern – 2</a>

### 🏷️ Diagrama de classes do projeto base 

<img src="https://www.mballem.com/wp-content/uploads/2014/10/diagram-domain-package.png" alt="Diagrama de classes do projeto base" style="height: 100%; width:100%;"/>

#### Código fonte da interface ArtigoBuider
~~~java
public interface ArtigoBuilder {
    ArtigoBuilder autor(String autor);
    ArtigoBuilder titulo(String titulo);
    ArtigoBuilder assuntos(String... assuntos);
    ArtigoBuilder totalDePaginas(int total);
    ArtigoBuilder publicadoEm(int dia, int mes, int ano);
    ArtigoBuilder texto(String texto);
    Artigo get();
}
~~~~

### 🛑 Pré-requistos
* Java 8 ou superior
* Maven

### 🤝 Contribuindo

Desenvolvido e publicado pelo blog **[MBallem - Programando com Java](https://www.mballem.com/)**

Este repositório foi criado para fins de estudo. 

Se te ajudei de alguma forma ⭐️ Star o projeto.



