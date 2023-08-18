package ExercicioComposicao;

import java.util.List;
import java.util.ArrayList;

public class Funcionario {
	
	String nome;
	final List<Cargo> cargo = new ArrayList<>();
	
	Funcionario(String nome){
		this.nome = nome;
	}
	
	void adiciona(Cargo cargo) {
		this.cargo.add(cargo);
		cargo.funcionario.add(this);	
		
	}
	

}
