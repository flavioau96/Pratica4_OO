package br.com.projetosocial;

public class DistribuicaoAlimento extends Projeto{
    private String desAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String datainicio, String datafim, String endereco, String desAlimento, float qtde) {
        super(nomeProjeto, descricao, datainicio, datafim, endereco);
        this.desAlimento = desAlimento;
        this.qtde = qtde;

    }

    public String getDesAlimento() {
        return desAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    @Override
    public boolean validaProjeto(){
       if (getDatafim() == "")
           return true;
       else
           return false;
    }

    @Override
    public String imprimeProjeto(){
        return "nome" + getNomeProjeto() + "\n Descrição" + getDescricao() + "\n Data Inicio" + getDatainicio() +
                "\n Data Fim" +    getDatafim() +  "\n Endereço" + getEndereco() + "\nDescrição Alimento" +  getDesAlimento() + "\nQuantida Alimento"  + getQtde();
    }

}
