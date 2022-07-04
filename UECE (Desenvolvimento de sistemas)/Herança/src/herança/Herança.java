package herança;

public class Herança {

    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        g1.setNome("Pedro");
        g1.setSalario(4000);
        g1.setNumFuncionarios(50);
        System.out.println(g1.imprimir());
        System.out.println("======================");
        g1.aumento(20);
        System.out.println(g1.imprimir());
        System.out.println("======================");
        
        Funcionário f1 = new Funcionário();
        f1.setNome("João");
        f1.setSalario(2000);
        f1.aumento(10);
        System.out.println(f1.imprimir());
        
        System.out.println("\n");
        Secretária s1 = new Secretária();
        s1.setNome("Natalia");
        s1.setSalario(3000);
        s1.aumento(15);
        s1.setTelefone(985265476);
        s1.setEmail("Natalia@gmail.com");
        System.out.println(s1.imprimir());
        s1.FazerLigaçao();
        s1.Agendamento(26, "Abril");
        
        System.out.println("\n");
        Programador p1 = new Programador();
        p1.setNome("Pedro");
        p1.setSalario(5000);
        p1.setArea("Computação Gráfica");
        p1.setDiploma("Doutorado");
        p1.setCafe(5);
        p1.setExperiencia(3);
        p1.setLinguagem("Python");
        p1.aumento(30);
        p1.setProjetos(28);
        System.out.println(p1.imprimir());
        p1.Dormir();
    }
    
}
