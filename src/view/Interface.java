package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controller.*;
import model.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class Interface extends JFrame {
	//Criando atributos da Interface Gráfica
	
	private JPanel contentPane;
	private JButton btnBuscar;
    private JButton btnCadastrar;
    private JButton btnRemover;
    private JButton btnConsultas;
    private JTextField campoRegistro;
    private JTextField campoEmail;
    private JTextField campoTelefone;
    private JTextField campoEspecialidade;
    private JTextField campoNome;
    private JTextField campoPlanoSaude;
    private JTextField campoRg;
    private JTextField campoIdade;
    private JTextArea campoSintomas;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    
    private JScrollPane jScrollPane1;
    private JLabel labelQtdUsuarios;
    private JRadioButton checkMedico;
    private JRadioButton checkPaciente;
    private JTextField txtTexto;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface("Programa Mais Médicos - Cadastro de Usuários - Versão 1.2");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Interface(String umaString){
/******************************************************************************/
/************************CRIANDO CONTAINER PRINCIPAL***************************/
/******************************************************************************/
		 super(umaString);
		 JPanel contentPane = new JPanel();
   	 	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(112, 90, 1142, 600);
		 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 setContentPane(contentPane);
		 contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		 JPanel panel = new JPanel();
		 contentPane.add(panel);
		 
		 panel_1 = new JPanel();
		 contentPane.add(panel_1);
		 
		 panel_2 = new JPanel();
		 contentPane.add(panel_2);
		 
		 panel_3 = new JPanel();
		 contentPane.add(panel_3);
		 
		 
 /******************************************************************************/
 /*****************************Criando OBJETOS************************************/
 /******************************************************************************/
		    btnBuscar = new JButton();
		    btnCadastrar = new JButton();
	        btnRemover = new JButton();
	        btnConsultas = new JButton();
	        
	         campoRegistro = new JTextField();
	         campoEmail = new JTextField();
	         campoTelefone = new JTextField();
	         campoEspecialidade = new JTextField();
	         campoNome = new JTextField();
	         campoPlanoSaude = new JTextField();
	         campoRg = new JTextField();
	         campoIdade = new JTextField();
	        
	         campoSintomas = new JTextArea();
	        
	         jLabel1 = new JLabel();
	         jLabel2 = new JLabel();
	         jLabel3 = new JLabel();
	         jLabel4 = new JLabel();
	         jLabel5 = new JLabel();
	         jLabel6 = new JLabel();
	         jLabel7 = new JLabel();
	         jLabel8 = new JLabel();
	         jLabel9 = new JLabel();
	         jLabel10 = new JLabel();
	         jLabel11 = new JLabel();
	         jLabel12 = new JLabel();
	         jLabel13 = new JLabel();
	         jLabel14 = new JLabel();
	         jLabel15 = new JLabel();
	         jLabel16 = new JLabel();
	         jLabel17 = new JLabel();

	        jScrollPane1 = new JScrollPane();
	       
	        checkMedico = new JRadioButton();
	        checkPaciente = new JRadioButton();
	        
/******************************************************************************/
/*********************************BOAS VINDAS AO USUARIO DO PROGRAMA*********************/
/******************************************************************************/
	        
		 JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao Programa Mais Médicos.\n Este Programa foi desenvolvido para\n " +
		 		"facilitar o Cadastramento de Consultas, Pacientes e Novos Médicos");
		 
 /****************************************************************************************/
 /*********************************ORGANIZANDO PAINEL SUPERIOR****************************/
 /****************************************************************************************/
		campoNome.setColumns(20);
		campoEmail.setColumns(20);
		campoTelefone.setColumns(9);
		campoRegistro.setColumns(12);
		campoEspecialidade.setColumns(20);
		campoIdade.setColumns(2);
		campoPlanoSaude.setColumns(10);
		campoRg.setColumns(8);
		campoSintomas.setColumns(30);
		 
		jLabel1.setText("Nome:");
    	
        jLabel2.setText("E-mail:");
        
        jLabel3.setText("Telefone:"); 
        
        jLabel4.setText("Cadastrando Médico *******************\n");
        
        jLabel5.setText("Cadastrando Paciente *****************\n");

        jLabel6.setText("Plano de Saúde");

        jLabel7.setText("RG");

        jLabel8.setText("Idade");

        jLabel9.setText("Sintomas");

        jLabel10.setText("Registro");

        jLabel11.setText("Especialidade");

        jLabel12.setText("");

        jLabel13.setText("");

        jLabel14.setText("");

        checkMedico.setText("Médico");
        checkPaciente.setText("Paciente");
        
        btnCadastrar.setText("CADASTRAR");
        btnBuscar.setText("BUSCAR");
        btnRemover.setText("REMOVER");
        btnConsultas.setText("IR PARA CONSULTAS");
        FlowLayout fl_panel = new FlowLayout(FlowLayout.CENTER, 5, 5);
        fl_panel.setAlignOnBaseline(true);
        panel.setLayout(fl_panel);

        panel.add(jLabel1);
        panel.add(campoNome);
		panel.add(jLabel2);
		panel.add(campoEmail);
		panel.add(jLabel3);
		panel.add(campoTelefone);
		panel.add(checkMedico);
		panel.add(checkPaciente);
		
		panel.add(btnCadastrar);
		
		panel_2.add(jLabel4);
		panel_1.add(jLabel5);
		panel_1.add(jLabel6);
		panel_1.add(campoPlanoSaude);
		panel_1.add(jLabel7);
		panel_1.add(campoRg);
		panel_1.add(jLabel8);
		panel_1.add(campoIdade);
		panel_1.add(jLabel9);
		panel_1.add(campoSintomas);
		panel_2.add(jLabel10);
		panel_2.add(campoRegistro);
		panel_2.add(jLabel11);
		panel_2.add(campoEspecialidade);
		
		panel_3.add(btnBuscar);
		panel_3.add(btnRemover);
		panel_3.add(btnConsultas);
		
/****************************************************************************************/
/*********************************ORGANIZANDO EVENTOS PARA BOTOES E CHECKBOX*************/
/****************************************************************************************/       

		checkMedico.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent evt) {
            	campoRegistro.enable();
                campoEspecialidade.enable();
                campoRg.disable();
                campoIdade.disable();
                campoSintomas.disable();
                campoPlanoSaude.disable();
                checkPaciente.setSelected(false);
                jLabel5.disable();
                jLabel4.enable();
                jLabel6.disable();
                jLabel7.disable();
                jLabel8.disable();
                jLabel9.disable();
                jLabel10.enable();
                jLabel11.enable();
            }
        });
		checkPaciente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	campoRegistro.disable();
                campoEspecialidade.disable();
                campoRg.enable();
                campoIdade.enable();
                campoSintomas.enable();
                checkMedico.setSelected(false);
                jLabel4.disable();
                jLabel5.enable();
                jLabel6.enable();
                jLabel7.enable();
                jLabel8.enable();
                jLabel9.enable();
                jLabel10.disable();
                jLabel11.disable();
            }
        });
		btnRemover.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String nome = campoNome.getText();
	    		Usuario umUsuario = new Usuario(nome);
	    		ControleUsuario.remover(umUsuario);
	    	}
	    });
		btnBuscar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String umNome = campoNome.getText();
	    		
	    		ControleUsuario.buscar(umNome);
	    		JTextArea encontrado = new JTextArea();
	    		panel_3.add(encontrado);
	    		encontrado.setText(umNome);
	    	}
	    });
		btnCadastrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String nome = campoNome.getText();
                String email = campoEmail.getText();
                String telefone = campoTelefone.getText();
                System.out.println("Cadastrando usuario");
                if(checkMedico.isSelected() == false){
                	 jLabel10.setVisible(false);
                	 jLabel11.setVisible(false);
                	 jLabel4.setVisible(false);
                }else if(checkPaciente.isSelected() == false){
                	jLabel5.setVisible(false);
	               	 jLabel6.setVisible(false);
	               	 jLabel7.setVisible(false);
	               	jLabel8.setVisible(false);
	               	 jLabel9.setVisible(false);
                	
                	
                }
                if(checkMedico.isSelected() == true){
              
                    String registro = campoRegistro.getText();
                    String especialidade = campoEspecialidade.getText();
                    
                    Medico umMedico = new Medico();
                    
                    umMedico.setNome(nome);
                    umMedico.setRegistro(registro);
                    umMedico.setEspecialidade(especialidade);
                    umMedico.setEmail(email);
                    
                    ControleUsuario.adicionarMedico(umMedico);
                    
                    JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso");
                    
                    // Limpando os campos.
                    campoNome.setText("");
                    campoEmail.setText("");
                    campoTelefone.setText("");
                    campoRegistro.setText("");
                    campoEspecialidade.setText("");
                    checkPaciente.setSelected(false);
                    checkMedico.setSelected(false);
                    
                }
                else if(checkPaciente.isSelected() == true){
                	
                    String planoSaude = campoPlanoSaude.getText();
                    String rg = campoRg.getText();
                    String idade = campoIdade.getText();
                    String sintomas = campoSintomas.getText();
                    
                    
                    Paciente umPaciente = new Paciente(nome, rg);
                    umPaciente.setRg(rg);
                    umPaciente.setEmail(email);
                    umPaciente.setSintomas(sintomas);
                    
                    ControleUsuario.adicionarPaciente(umPaciente);
                    
                    JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso");
                    
                    // Limpando os campos.
                    campoNome.setText("");
                    campoEmail.setText("");
                    campoRg.setText("");
                    campoIdade.setText("");
                    campoRegistro.setText("");
                    campoEspecialidade.setText("");
                    campoPlanoSaude.setText("");
                    campoSintomas.setText("");
                    checkPaciente.setSelected(false);
                    checkMedico.setSelected(false);
                }
            }
        });
		
 
   }

}
