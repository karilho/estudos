package SOLID.reajuste;

import SOLID.model.Funcionario;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new NullPointerException("Reajuste nao pode ser superior a 40% do salario!");
		}
	}

}
