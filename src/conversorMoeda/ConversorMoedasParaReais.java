package conversorMoeda;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ConversorMoedasParaReais {
	
	public void converterDolarParaReal(double value) {
		
		double dollarCurrency = value/0.19;
		Locale locale = new Locale("pt", "BR");
		NumberFormat formatted = NumberFormat.getCurrencyInstance(locale);
		String formattedValue = formatted.format(dollarCurrency);
		JOptionPane.showMessageDialog(null, "Você tem " + formattedValue + " Reais");
	
	}

	public void converterEuroParaReal(double value) {
		
		double euroCurrency = value/0.19;
		Locale locale = new Locale("pt", "BR");
		NumberFormat formatted = NumberFormat.getCurrencyInstance(locale);
		String formattedValue = formatted.format(euroCurrency);
		JOptionPane.showMessageDialog(null, "Você tem " + formattedValue + " Reais");
		
	}

	public void converterPesoArgentinoParaReal(double value) {
		
		double argentinePeso = value / 27.58;
		Locale locale = new Locale("pt", "BR");
		NumberFormat formatted = NumberFormat.getCurrencyInstance(locale);
		String formattedValue = formatted.format(argentinePeso);
		JOptionPane.showMessageDialog(null, "Você tem " + formattedValue + " Reais");
		
		
	}
}
