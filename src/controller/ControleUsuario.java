package controller;
import java.util.ArrayList;
import model.*;

public class ControleUsuario {
	static ArrayList<Usuario> listaUsuarios;
	
	public ControleUsuario(){
		listaUsuarios = new ArrayList<Usuario>();
	}
	public static void adicionarMedico(Medico  umMedico){
		
		listaUsuarios.add(umMedico);
		
	}
	public static void adicionarPaciente(Paciente umPaciente){
		
		listaUsuarios.add(umPaciente);
		
	}
	public static void remover(Usuario umUsuario){
		
		listaUsuarios.remove(umUsuario);
	
	}
	public static Usuario buscar(String umNome){
		
		for (Usuario umUsuario: listaUsuarios){
			if (umUsuario.getNome().equalsIgnoreCase(umNome)){
				return umUsuario;
			}
		}
		return null;
	}
}	