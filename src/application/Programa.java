package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Itens;
import entities.Pedido;
import entities_enum.StatusPedido;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe dados do cliente:");
		System.out.print("Nome:");
		String nomeCliente = sc.nextLine();
		System.out.print("Email:");
		String emailCliente = sc.nextLine();
		System.out.println("Data de nascimento (DD/MM/YYYY):");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			Date dataNascimCliente = sdf1.parse(sc.nextLine());
			System.out.println("Dados do pedido:");
			System.out.print("Status:");
			StatusPedido status = StatusPedido.valueOf(sc.nextLine().toUpperCase());
			Pedido pedido = new Pedido(new Date(System.currentTimeMillis()),status,nomeCliente,emailCliente,dataNascimCliente);
			System.out.println("Quantidade de itens?:");
			int i = sc.nextInt();
			for (int aux =0; aux<i;aux++) {
				sc.nextLine();
				System.out.println("Dados do iten - "+(aux+1));
				System.out.print("Produto:");
				String nomeProduto = sc.nextLine();
				System.out.print("Preço:");
				Double preco = sc.nextDouble();
				System.out.print("Quantidade:");
				Integer quantidade = sc.nextInt();
				Itens iten = new Itens(quantidade, preco, nomeProduto);
				pedido.addItens(iten);
			}
			System.out.println("");
			System.out.println("Resumo do pedido:");
			System.out.println("Data do pedido: "+sdf1.format(pedido.getData()));
			System.out.println("Status do pedido: "+pedido.getStatus());
			System.out.println("Cliente: "+pedido.getCliente().getNome()+" ("+sdf2.format(pedido.getCliente().getData())+") - "+pedido.getCliente().getEmail());
			System.out.println("Itens:");
			pedido.getItens();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
