package SOLID.service.promocao;

import SOLID.model.Cargo;
import SOLID.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual) {
            throw new RuntimeException("Gerentes não podem ser promovidos!");
        }
        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new RuntimeException("Funcionário não bateu a meta!");
        }
    }
}
