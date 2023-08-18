package ExercicioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Cargo {
	
	String nome;
	
	List<Funcionario> funcionario = new ArrayList<>();
	
	void adicionaFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);
		funcionario.cargo.add(this);
	}
	

}
