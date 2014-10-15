package view;

import java.awt.BorderLayout;
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

public class Interface extends JFrame {
	//Criando atributos da Interface Gráfica
	
	private JPanel contentPane;
	private JButton btnBuscar;
    private JButton btnCadastrar;
    private JButton btnRemover;
    private JButton btnConsultas;
    private JTextField campoRegistro;
    private JTextField campoEmail;
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
	
    
    public void setLabels(){
    	jLabel1.setText("Nome:");
    	
        jLabel2.setText("E-mail:");
        
        jLabel3.setText("Telefone:"); 
        
        jLabel4.setText("Selecione o tipo de Usuário:");
        
        jLabel5.setText("ID:");

        jLabel6.setText("Estado*:");

        jLabel7.setText("*(Alto Risco, Médio Risco ou Leve)");

        jLabel8.setText("Paciente:");

        jLabel9.setText("Médico:");

        jLabel10.setText("CRM:");

        jLabel11.setText("Especificação:");

        jLabel12.setText("Consulta Médica:");

        jLabel13.setText("Descrição:");

        jLabel14.setText("Remédios/Medicações:");

        
        
        btnCadastrar.setText("CADASTRAR");
        btnBuscar.setText("BUSCAR");
        btnRemover.setText("REMOVER");
        btnConsultas.setText("IR PARA CONSULTAS");
        
    }
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Interface(){
/******************************************************************************/
/************************CRIANDO CONTAINER PRINCIPAL***************************/
/******************************************************************************/
		 JPanel contentPane = new JPanel();
   	 	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(112, 90, 1142, 600);
		 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 contentPane.setLayout(new BorderLayout(0, 0));
		 setContentPane(contentPane);
		 
 /******************************************************************************/
 /*****************************Criando OBJETOS************************************/
 /******************************************************************************/
		    JButton btnBuscar = new JButton();
	        JButton btnCadastrar = new JButton();
	        JButton btnRemover = new JButton();
	        JButton btnConsultas = new JButton();
	        
	        JTextField campoRegistro = new JTextField();
	        JTextField campoEmail = new JTextField();
	        JTextField campoEspecialidade = new JTextField();
	        JTextField campoNome = new JTextField();
	        JTextField campoPlanoSaude = new JTextField();
	        JTextField campoRg = new JTextField();
	        JTextField campoIdade = new JTextField();
	        
	        JTextArea campoSintomas = new JTextArea();
	        
	        JLabel jLabel1 = new JLabel();
	        JLabel jLabel2 = new JLabel();
	        JLabel jLabel3 = new JLabel();
	        JLabel jLabel4 = new JLabel();
	        JLabel jLabel5 = new JLabel();
	        JLabel jLabel6 = new JLabel();
	        JLabel jLabel7 = new JLabel();
	        JLabel jLabel8 = new JLabel();
	        JLabel jLabel9 = new JLabel();
	        JLabel jLabel10 = new JLabel();
	        JLabel jLabel11 = new JLabel();
	        JLabel jLabel12 = new JLabel();
	        JLabel jLabel13 = new JLabel();
	        JLabel jLabel14 = new JLabel();
	        JLabel jLabel15 = new JLabel();
	        JLabel jLabel16 = new JLabel();
	        JLabel jLabel17 = new JLabel();
	        JLabel labelQtdUsuarios = new JLabel();
	        //Scroll
	        JScrollPane jScrollPane1 = new JScrollPane();
	       
	        //checkbox
	        JRadioButton radioMedico = new JRadioButton();
	        JRadioButton radioPaciente = new JRadioButton();
	        
/******************************************************************************/
/*********************************BOAS VINDAS AO PROGRAMA*********************/
/******************************************************************************/
	        
		 JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao Programa Mais Médicos.\n Este Programa foi desenvolvido para\n " +
		 		"facilitar o Cadastramento de Consultas, Pacientes e Novos Médicos");
		 
		 
   }

}
