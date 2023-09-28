package br.com.projetosocial;

public class TrabalhoVoluntario extends Projeto{
        private String tipoTrabalho;
        private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String datainicio, String datafim, String endereco, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, datainicio, datafim, endereco);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public  boolean validaProjeto(){
        if(getDuracaoTrabalho()> 2)
            return true;
            else
                return false;
    }

    @Override
    public String imprimeProjeto(){
        return "nome" + getNomeProjeto() + "\n Descrição" + getDescricao() + "\n Data Inicio" + getDatainicio() +
                "\n Data Fim" +    getDatafim() +  "\n Endereço" + getEndereco()  + "\n Tipo de trabalho" + getTipoTrabalho() + "\nDuração do trabalho" + getDuracaoTrabalho() ;

    }
}
