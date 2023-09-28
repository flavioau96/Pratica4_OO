package br.com.projetosocial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            DistribuicaoAlimento dt = new DistribuicaoAlimento("Nada","Esse é bom",
                    "22/04/1980","28/09/2023","Rua jacui", "è o brabo dos brabo",1921);
            TrabalhoVoluntario tv = new TrabalhoVoluntario("Joazim do Grau", "O mais brabo do grua", "25/09/2023",
                    "28/09/2023", "Rua da ameixas N°23", "Valountariado",93);

        System.out.println(dt.imprimeProjeto());
        System.out.println(tv.imprimeProjeto());

    }
}
