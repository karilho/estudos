package SOLID.service.reajuste;

import SOLID.model.Funcionario;


import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

	/*
	A validação está instanciando todas validacoes, independentemente de qual esteja sendo utilizado, pois está instanciada aqui
	Ai você pode notar também q é possível chamar seus métodos independente deles, pois são totalmente desacoplados, gerando 0 de dependencia
	no codigo abaixo
	 */
	private List<ValidacaoReajuste> validacoes;

	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));

		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);

		funcionario.atualizarSalario(salarioReajustado);
	}
	
}
