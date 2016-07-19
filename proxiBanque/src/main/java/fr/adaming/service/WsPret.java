package fr.adaming.service;

import net.webservicex.FinanceService;
import net.webservicex.FinanceServiceSoap;

public class WsPret {

	FinanceService financeService = new FinanceService();
	FinanceServiceSoap financeServiceSoap = financeService.getFinanceServiceSoap();
	
	public double simulationImmo(double montant, double interet, int mois) {
		return financeServiceSoap.loanMonthlyPayment(montant, interet, mois);
	}
		
}
