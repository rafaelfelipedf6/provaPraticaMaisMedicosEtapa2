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
    private JRadioButton radioMedico;
    private JRadioButton radioPaciente;
    private JTextField txtTexto;
	
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
		 contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		 
		 JPanel panel = new JPanel();
		 contentPane.add(panel);
		 
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
	         labelQtdUsuarios = new JLabel();
	        //Scroll
	        jScrollPane1 = new JScrollPane();
	       
	        //checkbox
	        radioMedico = new JRadioButton();
	        radioPaciente = new JRadioButton();
	        
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
		campoSintomas.setColumns(100);
		 
		jLabel1.setText("Nome:");
    	
        jLabel2.setText("E-mail:");
        
        jLabel3.setText("Telefone:"); 
        
        jLabel4.setText("");
        
        jLabel5.setText("");

        jLabel6.setText("");

        jLabel7.setText("");

        jLabel8.setText("");

        jLabel9.setText("");

        jLabel10.setText("");

        jLabel11.setText("");

        jLabel12.setText("");

        jLabel13.setText("");

        jLabel14.setText("");

        radioMedico.setText("Médico");
        radioPaciente.setText("Paciente");
        
        btnCadastrar.setText("CADASTRAR");
        btnBuscar.setText("BUSCAR");
        btnRemover.setText("REMOVER");
        btnConsultas.setText("IR PARA CONSULTAS");
        panel.add(jLabel1);
        panel.add(campoNome);
		panel.add(jLabel2);
		panel.add(campoEmail);
		panel.add(jLabel3);
		panel.add(campoTelefone);
		panel.add(radioMedico);
		panel.add(radioPaciente);
		
		
		radioMedico.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
		radioPaciente.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
 
   }

}
