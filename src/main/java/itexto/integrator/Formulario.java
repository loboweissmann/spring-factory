package itexto.integrator;

import itexto.integrator.impl.DataSourceDosBruto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Formulario extends JFrame {
	
	private final FactoryReflexao factoryReflexao = new FactoryReflexao();
	private final FactoryIngenuo  factoryIngenuo  = new FactoryIngenuo();
	private final FactorySpring   factorySpring   = new FactorySpring();
	
	private JComboBox comboBox;
	private JTextField txtValor;
	private JButton btnEnviar;
	private JTextArea txtSaida;
	private JTextField txtIntegrador;
	
	private final DataSourceDosBruto dataSource = new DataSourceDosBruto();
	
	public Formulario() {
		setTitle("Evolução de factories");
		setLayout(new BorderLayout());
		JPanel pnlTopo = new JPanel();
		pnlTopo.setLayout(new FlowLayout(FlowLayout.LEFT));
		comboBox = new JComboBox();
		pnlTopo.add(comboBox);
		comboBox.addItem(factoryIngenuo);
		comboBox.addItem(factoryReflexao);
		comboBox.addItem(factorySpring);
		pnlTopo.add(new JLabel("Qual integrador?"));
		txtIntegrador = new JTextField(10);
		pnlTopo.add(txtIntegrador);
		pnlTopo.add(new JLabel("Valor pra ser enviado:"));
		txtValor = new JTextField(10);
		pnlTopo.add(txtValor);
		btnEnviar = new JButton("Enviar");
		pnlTopo.add(btnEnviar);
		txtSaida = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(txtSaida);
		add(scrollPane, BorderLayout.CENTER);
		
		setSize(700, 400);
		add(pnlTopo, BorderLayout.NORTH);
		
		btnEnviar.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent evt) {
				Object objFactory = comboBox.getSelectedItem();
				String valor = null;
				if (objFactory == factoryIngenuo) {
					Integrador integrador = ((FactoryIngenuo) objFactory).create(txtIntegrador.getText(), dataSource);
					if (integrador != null) {
						valor = integrador.enviarParaDestino(txtValor.getText());
					}
				} else if (objFactory == factoryReflexao) {
					Integrador integrador = ((FactoryReflexao) objFactory).create(txtIntegrador.getText(), dataSource);
					if (integrador != null) {
						valor = integrador.enviarParaDestino(txtValor.getText());
					}
				} else if (objFactory == factorySpring) {
					Integrador integrador = ((FactorySpring) objFactory).create(txtIntegrador.getText());
					if (integrador != null) {
						valor = integrador.enviarParaDestino(txtValor.getText());
					}
				}
				
				txtSaida.append("\n" + valor);
				
			}
			
		});
		
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new Formulario();
	}

}
