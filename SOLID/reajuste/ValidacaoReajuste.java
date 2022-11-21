package SOLID.reajuste;

import SOLID.model.Funcionario;


import java.math.BigDecimal;

public interface ValidacaoReajuste {
	void validar(Funcionario funcionario, BigDecimal aumento);

}
