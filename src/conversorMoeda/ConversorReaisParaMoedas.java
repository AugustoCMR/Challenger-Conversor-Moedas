package conversorMoeda;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ConversorReaisParaMoedas {
	
	public void converterRealParaDolar(double value) {
		
		double dollarCurrency = value/5.09;
		NumberFormat formatted = NumberFormat.getCurrencyInstance(Locale.US);
		String formattedValue = formatted.format(dollarCurrency);
		JOptionPane.showMessageDialog(null, "Você tem " + formattedValue + " Dólares");
	
	}

	public void converterRealParaEuro(double value) {
		
		double euroCurrency = value/5.18;
		NumberFormat formatted = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String formattedValue = formatted.format(euroCurrency);
		JOptionPane.showMessageDialog(null, "Você tem " + formattedValue + " Euros");
		
	}

	public void converterRealParaPesosArgentinos(double value) {
		
		double argentinePeso = value / 0.036;
		Locale locale = new Locale("es", "AR");
		NumberFormat formatted = NumberFormat.getCurrencyInstance(locale);
		String formattedValue = formatted.format(argentinePeso);
		JOptionPane.showMessageDialog(null, "Você tem " + formattedValue + " Pesos Argentinos");
		
		
	}
}
