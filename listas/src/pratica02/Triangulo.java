package pratica02;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * @author LuísEduardo
 * @data 17/10/2022
 */
public class Triangulo extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t3;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(10, 11, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(338, 11, 86, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(170, 11, 86, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JButton botao = new JButton("Triangulo:");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String n1 = t1.getText(), n2 = t2.getText(), n3 = t3.getText(), trian=null;
				if(n1.isEmpty() || n2.isEmpty() || n3.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Valor em branco");
				}else {
					Double num1 = Double.valueOf(n1);
					Double num2 = Double.valueOf(n2);
					Double num3 = Double.valueOf(n3);
					if((num1-num2==0) && (num1-num3==0)) {
						trian="Equilátero";
					} else {
						if((num1-num2!=0) && (num1-num3!=0)) {
							trian = "Escaleno";
						} else {
							trian = "Isósceles";
						}
					}
				}
				JOptionPane.showMessageDialog(botao, trian);
			}
		});
		botao.setBounds(165, 106, 104, 47);
		contentPane.add(botao);
	}

}
