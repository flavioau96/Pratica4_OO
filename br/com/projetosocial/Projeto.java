package br.com.projetosocial;

public abstract class  Projeto {
    private String nomeProjeto;
    private String descricao;
    private String datainicio;
    private String datafim;
    private String endereco;

    public Projeto(String nomeProjeto, String descricao, String datainicio, String datafim, String endereco) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.endereco = endereco;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public abstract boolean validaProjeto();
    public abstract String imprimeProjeto();
}
