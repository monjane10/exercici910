import java.util.Scanner;
/**
 * Autor: Lourenço Monjane**/

public class Pessoa {
    private String nome;
    private char sexo;
    private char estadoCivil;
    private int idade;

    public Pessoa (String nome, char sexo, char estadoCivil, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public char getSexo() {
        return  this.sexo;
    }
    public char getEstadoCivil(){
        return this.estadoCivil;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstadoCivil(char estadoCivil) {
      if (estadoCivil == 'C' || estadoCivil == 'S' || estadoCivil == 'D' || estadoCivil == 'V'){
          this.estadoCivil = estadoCivil;
      } else {
          throw new IllegalArgumentException("O estado civil deve ser 'C', 'S', 'D' ou 'V'");
      }
    }

    public void setSexo(char sexo) {
        if (sexo == 'M'|| sexo == 'F'){
            this.sexo = sexo;
        } else {
            throw  new IllegalArgumentException("Sexo deve ser 'M' ou; 'F'");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
          throw   new IllegalArgumentException("A idade não pode pode ser negativa!");
        }
    }

    /**
     * Metodo para obter a descrção do estado civil por extenso
     * Autor: Lourenço Monjane**/

    public String EstadoCivilPorExtenso() {
        switch (this.estadoCivil) {
            case 'C':
                return "Casado";
            case 'S':
                return "Solteiro";
            case 'D':
                return "Divorciado";
            case 'V':
                return "Viúvo";
            default: return "Estado civil não existe";
        }
    }

    /**
     * Metodo para obter o sexo por extenso
     * Autor: Lourenço Monjane**/

    public String SexoPorExtenso(){
        return (this.sexo == 'M')? "Masculino" : "Feminino";

    }


    /**
     * Metodo para imprimir os dados da pessoa
     * Autor: Lourenço Monjane**/

    public void  ImprimirDados(){
        System.out.println("DADOS DO INDIVIDUO");
        System.out.println("+------------------+----------------------+");
        System.out.printf("| %-16s | %-20s |\n", "Nome", this.nome);
        System.out.println("+------------------+----------------------+");
        System.out.printf("| %-16s | %-20s |\n", "Sexo", this.SexoPorExtenso());
        System.out.println("+------------------+----------------------+");
        System.out.printf("| %-16s | %-20s |\n", "Estado Civil", this.EstadoCivilPorExtenso());
        System.out.println("+------------------+----------------------+");
        System.out.printf("| %-16s | %-20d |\n", "Idade", this.idade);
        System.out.println("+------------------+----------------------+");

    }

    /**
     * Metodo para ler os dados da pessoa via teclado
     * Autor: Lourenço Monjane**/

    public void lerDados() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Introduza o nome do individuo:");
        this.nome = ler.nextLine();

        System.out.println("Introduza o gênero do individuo (M/F):");
        this.sexo = ler.next().charAt(0);

        System.out.println("Introduza o estado civil do individuo (C-casado, S-solteiro, D-divorciado, V-viuvo:");
        this.estadoCivil = ler.next().charAt(0);

        System.out.println("Introduza a idade do individuo:");
        this.idade = ler.nextInt();

        ler.close();
    }

}
