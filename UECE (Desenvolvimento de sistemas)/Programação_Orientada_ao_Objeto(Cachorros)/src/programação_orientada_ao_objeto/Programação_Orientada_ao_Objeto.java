package programação_orientada_ao_objeto;

public class Programação_Orientada_ao_Objeto {

    public static void main(String[] args) {
       Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("REX");
        cachorro1.setCor("Amarelo");
        System.out.println("Cachorro 01 - " + cachorro1.getCor());
        System.out.println("Cachorro 01 - " + cachorro1.getNome());
        
        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("OZZY");
        cachorro2.setPeso(10);
        System.out.println("Cachorro 02 - " + cachorro2.getNome());
        System.out.println("Cachorro 02 pesa - " + cachorro2.getPeso());
        cachorro1.setNome("REX");
        cachorro1.setCor("Amarelo");
        System.out.println("Cachorro 01 - " + cachorro1.getCor());
        System.out.println("Cachorro 01 - " + cachorro1.getNome());
        
        cachorro2.setNome("OZZY");
        cachorro2.setPeso(10);
        System.out.println("Cachorro 02 - " + cachorro2.getNome());
        System.out.println("Cachorro 02 pesa - " + cachorro2.getPeso());
        
        cachorro1.setPeso(10);
        System.out.println("Estado do cachorro 1: "+ cachorro1.calcularPeso());
        
        cachorro2.setPeso(16);
        System.out.println("Estado do cachorro 2: "+ cachorro2.calcularPeso());
        
        cachorro1.setAltura(0.4);
        System.out.println("Cachorro 1 é: "+ cachorro1.calcularAltura());
        
        cachorro2.setAltura(0.6);
        System.out.println("Cachorro 2 é: "+ cachorro2.calcularAltura());
    }
    
}
