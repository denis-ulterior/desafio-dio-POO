package br.com.ulteriorti.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcam {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcam)) return false;

        Bootcam bootcam = (Bootcam) o;

        if (nome != null ? !nome.equals(bootcam.nome) : bootcam.nome != null) return false;
        if (descricao != null ? !descricao.equals(bootcam.descricao) : bootcam.descricao != null) return false;
        if (dataInicial != null ? !dataInicial.equals(bootcam.dataInicial) : bootcam.dataInicial != null) return false;
        if (dataFinal != null ? !dataFinal.equals(bootcam.dataFinal) : bootcam.dataFinal != null) return false;
        if (devsInscritos != null ? !devsInscritos.equals(bootcam.devsInscritos) : bootcam.devsInscritos != null)
            return false;
        return conteudos != null ? conteudos.equals(bootcam.conteudos) : bootcam.conteudos == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (dataInicial != null ? dataInicial.hashCode() : 0);
        result = 31 * result + (dataFinal != null ? dataFinal.hashCode() : 0);
        result = 31 * result + (devsInscritos != null ? devsInscritos.hashCode() : 0);
        result = 31 * result + (conteudos != null ? conteudos.hashCode() : 0);
        return result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
}
