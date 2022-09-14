package conversorMoeda;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FunctionMoedas {
	
	ConversorReaisParaMoedas moedas = new ConversorReaisParaMoedas();
	ConversorMoedasParaReais reais = new ConversorMoedasParaReais();
	
	public void converteMoeda(double valorRecebido) {
		
			
		String toConvert = JOptionPane.showInputDialog(null, "Escolha a moeda que deseja converter: ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Reais para Dólares", "De Reais para Euro", "De Reais para Peso Argentino", "De Dólares para Reais", "De Euro Para Reais", "Peso Argentino para Reais"}, "Moedas").toString();
		
		
		switch(toConvert) {
			case "De Reais para Dólares":
				moedas.converterRealParaDolar(valorRecebido);
				break;
			
			case "De Reais para Euro":
				moedas.converterRealParaEuro(valorRecebido);
				break;
			
			case "De Reais para Peso Argentino":
				moedas.converterRealParaPesosArgentinos(valorRecebido);
				break;
				
			case "De Dólares para Reais":
				reais.converterDolarParaReal(valorRecebido);
				break;
				
			case "De Euro Para Reais":
				reais.converterEuroParaReal(valorRecebido);
				break;
				
			case "Peso Argentino para Reais":
				reais.converterPesoArgentinoParaReal(valorRecebido);
				break;
		}
	}
}
