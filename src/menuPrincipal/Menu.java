package menuPrincipal;

import javax.swing.JOptionPane;

import conversorMoeda.Function;

public class Menu {

	public static void main(String[] args) {
		
		Function moedas = new Function();
		boolean executa = true;
		
		while (executa) {
			
			String options =  JOptionPane.showInputDialog(null, "Escolha a conversão", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor De Moeda", "Conversor de Temperatura"}, "Escolha").toString();
					
			switch(options) {
			
				case "Conversor De Moeda":
					
					String input = JOptionPane.showInputDialog("Por favor, insira um valor: ");
					CheckValue value = new CheckValue();
					if(value.check(input)) {
					
						double valorRecebido = Double.parseDouble(input);
						moedas.converteMoeda(valorRecebido);
						
						int aswer = JOptionPane.showOptionDialog(null, "Deseja continuar?", "Aviso", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Sim", "Não"}, "Escolha");
					
					if( JOptionPane.YES_OPTION == aswer) {
						System.out.println("Escolha");
					} else if(aswer == JOptionPane.NO_OPTION){
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						//Para execução
						executa = false;
															
					}
					
					} else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
				
																			
			}
			
			
		}
		
		
	}
		
}


