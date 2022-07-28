package Pessoa;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
	public static void menu(){
    System.out.println("\t Menu");
    System.out.println("0. Sair");
    System.out.println("1. Cadastrar Bebidas");
    System.out.println("2. Valor total da compra");
    System.out.println("Opcao:");
}


//funções


public static double Bebida(int opcao){
	Scanner ler = new Scanner(System.in);
	int id, quantidadeBebida = 0;
	Bebida agua = new Bebida(1,"Agua", 3.50);
	Bebida vinho = new Bebida(2,"Vinho", 4);
	Bebida vodka = new Bebida(3,"Vodka", 4.50);
	Bebida energetico = new Bebida(4,"Energetico", 5);
	
	double valorVendido = 0;
     
	System.out.printf("Informe a Quantidade: \n");
    quantidadeBebida = ler.nextInt();
	
    System.out.printf("Informe idBebida: \n");
    id = ler.nextInt();
    
    
    
    for (int i=0; i<quantidadeBebida+1; i++) {
    	if(agua.idBebida == 1) {
    		valorVendido = 3.50 * i;
    	}
    	else if(vinho.idBebida == 2) {
    		valorVendido =  4 * i;
    	}
    	else if(vodka.idBebida == 3) {
    		valorVendido = 4.50 * i;
    	}
    	else if(energetico.idBebida == 4) {
    		valorVendido = 5 * i;
    	}
    	
    }
	

	
	return valorVendido ;

}



public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	//vetores para adicionar na lista sem perde o dado
	
	double bebi = 0;
	
	double a;
	int opcao;
	int n=0;//contador para adicionar no indice do vetor
	
	//opção de menu para cadastrar mais de uma informações
	do {
	menu();
    opcao = ler.nextInt();			
    
    switch(opcao){
     case 1:
    	//cadastrar bebida e imprimir lista
    	a=Bebida(opcao);
    	
    	System.out.printf("Valor total do produto: %.2f\n",a);
    	
    	bebi = bebi+a;
    	
    	break;
    	
     case 2:
 		System.out.printf("Valor total do produto: %.2f\n",bebi);
 		break;
 	
    	}
    	
    
    	
    }while(opcao != 0);
	
	
}
}
