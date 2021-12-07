/**
 * @author los profesores de IP
 * WindowSumaDosNumeros: lee dos números enteros de usando la interfaz gráfica y muestra su suma
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowSumaDosNúmeros implements ActionListener {
    private JFrame ventana = new JFrame ("Suma dos números");
    private JLabel lblNúmero1= new JLabel("Número1:");
    private JLabel lblNúmero2= new JLabel("Número2:");
    private JTextField txtNúmero1= new JTextField(10);
    private JTextField txtNúmero2= new JTextField(10);
    private JButton btnSumar = new JButton("Sumar");
    private JTextField txtSuma= new JTextField(10);

    
    public WindowSumaDosNúmeros () {
    	   ventana.setSize(250, 170);
    	   ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	   txtSuma.setEditable(false);
    	   txtSuma.setBackground(Color.LIGHT_GRAY);
    	   btnSumar.addActionListener(this);
    	   ventana.setLayout(new FlowLayout());
    	   ventana.add(lblNúmero1);
    	   ventana.add(txtNúmero1);
    	   ventana.add(lblNúmero2);
    	   ventana.add(txtNúmero2);
    	   ventana.add(btnSumar);
    	   ventana.add(txtSuma);
    	   
    	   ventana.setVisible(true);
    	   
    }
    public void actionPerformed(ActionEvent e) {
    	    int número1=Integer.parseInt(txtNúmero1.getText());
    	    int número2=Integer.parseInt(txtNúmero2.getText());
    	    txtSuma.setText(String.valueOf(número1+número2));
    }
    
    public static void main(String[ ] args) {
        WindowSumaDosNúmeros gui = new WindowSumaDosNúmeros();
	}

}
