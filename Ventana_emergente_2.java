
package proyecto_ipc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import static proyecto_ipc.Eventos_Aplicacion.*;
public class Ventana_emergente_2 extends JFrame implements ActionListener{
public JButton Transferencias,Retiros,Consultas,Compra_D,Transferencia_Libre,Logout;
Ventana_emergente e=new Ventana_emergente();

JLabel Datos_User;
public Ventana_emergente_2(){
Ventana_emergente ve1=new Ventana_emergente();
setLayout(null);
setTitle("LOGIN");
//setVisible(true);
//setBounds(400,200,500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Transferencias =new JButton("Transferencias");
Transferencias.setBounds(50,20,180,20);
Transferencia_Libre=new JButton("Transferencias Libre");
Transferencia_Libre.setBounds(50,100,180,20);
Datos_User=new JLabel("DATOS USUARIO");
Datos_User.setBounds(50,175,180,30);
Retiros =new JButton("Retiros");
Retiros.setBounds(275,20,125,20);
Consultas=new JButton("Consultas");
Logout=new JButton("LOGOUT");
Logout.setBounds(500,500,100,25);
Logout.addActionListener(this);


Consultas.setBounds(475,20,125,20);
Compra_D=new JButton("Compra");
Compra_D.setBounds(675,20,125,20);
Consultas.addActionListener(this);
Transferencias.addActionListener(this);
Transferencia_Libre.addActionListener(this);

add(Transferencias);
add(Retiros);
add(Consultas);
add(Compra_D);
add(Transferencia_Libre);
add(Datos_User);  
add(Logout);

add(ve1.JLabel_n);
add(ve1.JLabel_con);
add(ve1.JLabel_nu);
add(ve1.JLabel_si);
add(ve1.JLabel_ea);
add(ve1.JLabel_sm);

add(ve1.JLabel_1);        
add(ve1.JLabel_2);
add(ve1.JLabel_3);
add(ve1.JLabel_4);
add(ve1.JLabel_5);
add(ve1.JLabel_6); 
}
@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==Transferencia_Libre){
  Eventos_Aplicacion Tr=new Eventos_Aplicacion();
  Tr.setVisible(true);
}
else if (e.getSource()==Retiros){
}
else if(e.getSource()==Consultas){
Consulta_cuenta C_c=new Consulta_cuenta();

C_c.show();

}
else if(e.getSource()==Compra_D){
}
else if(e.getSource()==Logout){
    
    Menu Log=new Menu();
    Log.setVisible(true);
    Log.setSize(500,400);
}
} 
public static void main(String[] args){
    Ventana_emergente_2 ll=new Ventana_emergente_2();
    ll.setVisible(true);
    
}
}
