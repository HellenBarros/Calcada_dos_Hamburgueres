package CalcadadosHamburgueres;

import java.util.ArrayList;
import java.util.Scanner;


public class Funcionario {
	
	 private ArrayList<String> funcionario;
	 private ArrayList<Integer> senha;
	 
	 public Funcionario()
	 {
		 funcionario = new ArrayList<String>();
		 senha = new ArrayList<Integer>();
	 }
	 
	 
	 public ArrayList<Integer> getSenha() {
		 return senha;
	 }
	 
	 public void setSenha(ArrayList<Integer> senha) {
		 this.senha = senha;
	 }
	 
	 public ArrayList<String> getFuncionario() {
		 return funcionario;
	 }
	 
	 public void setFuncionario(ArrayList<String> funcionario) {
		 this.funcionario = funcionario;
	 }
	 
	 public void login() {
		 
	 }
	 
	 public void entradaAutorizada()
	 {
		 int entrada = 0;
		 boolean autorizacao;
		 if(autorizacao = true)
		 {
			 entrada = 1;
			 
			 if (entrada == 1)
			 {	Scanner resposta = new Scanner(System.in);
				System.out.println("Deseja adicionar algo?");
				String answer = resposta.next(); 
				
				if (answer.equals("sim") || answer.equals("Sim"))
				{
					System.out.println("1- Sanduiches/n 2-Acompanhamentos/n 3- Bebidas");
					int num = resposta.nextInt();
					
					 switch (num) 
					 {
				     case 1:
				       System.out.println("Voc� escolheu 1");
				       Funcionario funcionario = new Funcionario();
				       funcionario.adcSanduiches();
				       break;
				     case 2:
				       System.out.println("Voc� escolheu 2");
				       funcionario.adcAcompanhamentos();
				       break;
				     case 3:
				       System.out.println("Voc� escolheu 3");
				       funcionario.adcBebidas();
				       break;
				     default:
				       System.out.println("Op��o inv�lida");
				     }
				 }
			 }
				
				else 
				{
					autorizacao = false;
					System.out.println("N�o foi poss�vel realizar a opera��o.");
					
				}
			 }
		 }
	 
	 public void entradaNegada() {
		 
	 }
	 
	public void adcSanduiches()
	{
		Cardapio funcionario = new Cardapio();
		funcionario.addSanduiches(sanduiche, valor);
	}
		 
	public void adcAcompanhamentos()
	{
		Cardapio funcionario = new Cardapio();
		funcionario.addAcompanhamento(acompanhamento, valor);(sanduiche, valor);
	}
		 
	public void adcBebidas()
	{
		Cardapio funcionario = new Cardapio();
		funcionario.addBebidas(bebida, valor);(sanduiche, valor);
	}
		  
}
