package urna;

/**
 *
 * @author Ivan Jr
 */

import java.util.Scanner;

public class Urna {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Uiliam - 1
        //Patricio - 2
        //Ivan - 3
        int i1 = 0,i2 = 0,i3 = 0;
        
        //Nomes dos candidatos
        String[] Uiliam = new String[10];
        String[] Patricio = new String[10];
        String[] Ivan = new String[10];
        //Se o usuário quer sair ou não
        boolean sair = false;  
        String resposta;
        
        while(sair != true){
            System.out.println("");
            System.out.println("Digite o candidato");
            System.out.println("0- Uiliam 1- Patricio 2- Ivan");
            //definir um leitor
            Scanner voto = new Scanner(System.in);
            //ler o numero
            resposta = voto.next();
            switch(resposta){
                case("0"):
                    i1 += 1;
                    break;
                case("1"):
                    i2 += 1;
                    break;
                case("2"):
                    i3 += 1;
                    break;
            }
            
            System.out.println("------VOTO-----REALIZADO-----");
            System.out.println("      ------------------");
            System.out.println("-----------------------------");
       
            if("sair".equals(resposta)){
                System.out.println("saindo...");
                sair = true;
            }
        }
        String vencedor = verificar_vencedor(i1,i2,i3);
        int array_vencedor = (i1 > i2) ? i1 : i2;
        array_vencedor = (i1 > i3)? i1: i3;
        System.out.println("O candidato vencedor foi: " + vencedor + " com " + array_vencedor +" votos");
        
        if(i1 == i2 || i1 == i3){
            System.out.println("Houve um empate...");
        }
        
    }
    
    public static String verificar_vencedor(int a,int b, int c){
        //a - Uiliam
        //b - Patricio
        //c - Ivan
        
        String vencedor = "";
        if(a > b && a > c){
            vencedor = "Uiliam";
        }else if(b > c){
            vencedor = "Patricio";
        }else{
            vencedor = "Ivan";
        }
        
        return vencedor;
    }
    
    
}
              

