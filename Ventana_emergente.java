
package proyecto_ipc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.event.*;
import static proyecto_ipc.Agregar_Usuarios.*;
import static proyecto_ipc.Eventos_Aplicacion.*;



public class Ventana_emergente extends JFrame implements ActionListener {
public JButton Transferencias,Retiros,Consultas,Compra_D,Transferencia_Libre,Logout,Impresion; 
public JButton Gragicas_p;
public JLabel JLabel_1,JLabel_2,JLabel_3,JLabel_4,JLabel_5,JLabel_6;


public   JTextField JLabel_n=new JTextField ();
public   JTextField JLabel_nu=new JTextField ();
public   JTextField JLabel_con=new JTextField();
public   JTextField JLabel_si=new JTextField();
public   JTextField JLabel_ea=new JTextField();
public   JTextField JLabel_sm=new JTextField(); // sm ahora pais

JLabel Datos_User;
public Ventana_emergente(){
setLayout(null);
setTitle("LOGIN");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel_1=new JLabel("NOMBRE_USUARIO:");
JLabel_2=new JLabel("NOMBRE:");
JLabel_3=new JLabel("PASSWORD");
JLabel_4=new JLabel("SALDO INICIAL :");
JLabel_5=new JLabel("EMPRESA:");
JLabel_6=new JLabel("SALDO MAXIMO :");


JLabel_1.setBounds(50,225,180,20);
JLabel_2.setBounds(50,275,180,20);
JLabel_3.setBounds(50,325,180,20);
JLabel_4.setBounds(50,375,180,20);
JLabel_5.setBounds(50,425,180,20);
JLabel_6.setBounds(50,475,180,20);

JLabel_n.setBounds(300,225,200,20);
JLabel_nu.setBounds(300,275,200,20);
JLabel_con.setBounds(300,325,200,20);
JLabel_si.setBounds(300,375,200,20);
JLabel_ea.setBounds(300,425,200,20);
JLabel_sm.setBounds(300,475,200,20);

Transferencias =new JButton("Transferencias");
Transferencias.setBounds(50,20,180,20);
//Transferencias.setForeground(Color.GREEN);
Transferencia_Libre=new JButton("Transferencias Libre");
Transferencia_Libre.setBounds(50,100,180,20);
Transferencia_Libre.setForeground(Color.GREEN);
Datos_User=new JLabel("DATOS USUARIO");
Datos_User.setBounds(50,175,180,30);

Retiros =new JButton("Retiros");
Retiros.setBounds(275,20,180,20);
Retiros.setForeground(Color.GREEN);
Consultas=new JButton("Consultas");
Logout=new JButton("LOGOUT");
Logout.setBounds(500,500,100,25);
Logout.setForeground(Color.GREEN);
Impresion=new JButton("Reporte");
Impresion.setBounds(275,100,180,20);
Impresion.setForeground(Color.GREEN);
Gragicas_p=new JButton("Graficas");
Gragicas_p.setBounds(495,100,180,20);
Gragicas_p.setForeground(Color.GREEN);


Consultas.setBounds(495,20,180,20);
Consultas.setForeground(Color.GREEN);
Compra_D=new JButton("Compra");
Compra_D.setBounds(700,20,180,20);
Compra_D.setForeground(Color.GREEN);
Consultas.addActionListener(this);
Transferencias.addActionListener(this);
Transferencia_Libre.addActionListener(this);
Retiros.addActionListener(this);
Logout.addActionListener(this);
Gragicas_p.addActionListener(this);

add(Transferencias);
add(Retiros);
add(Consultas);
add(Compra_D);
add(Transferencia_Libre);
add(Datos_User);  
add(Logout);
add(Impresion);
add(Gragicas_p);

add(JLabel_1);        
add(JLabel_2);
add(JLabel_3);
add(JLabel_4);
add(JLabel_5);
add(JLabel_6);          

add(JLabel_n);
add(JLabel_nu);
add(JLabel_con);
add(JLabel_si);
add(JLabel_ea);
add(JLabel_sm);

miLamina_2 figura2=new miLamina_2();
add(figura2);
figura2.setVisible(true);
      

}
public void actionPerformed(ActionEvent e){
if(e.getSource()==Transferencia_Libre){
  Eventos_Aplicacion Tr=new Eventos_Aplicacion();
  Tr.setVisible(true);
}
else if (e.getSource()==Retiros){
 Retiros_u ru=new Retiros_u();
 ru.show();
 ru.setVisible(true);
}
else if(e.getSource()==Consultas){
Consulta_cuenta C_c=new Consulta_cuenta();

C_c.show();

}
else if(e.getSource()==Compra_D){
    
}
else if(e.getSource()==Logout){
    dispose();
    Menu Log=new Menu();
    Log.setVisible(true);
    Log.setSize(500,400);
}
else if(e.getSource()==Gragicas_p){
    Graficas_2 gp=new Graficas_2();
    gp.Grafica_pie();
}
}

public class miLamina_2 extends JPanel{
 @Override
 public void paintComponent(Graphics p){
 super.paintComponent(p);
 File miImagen=new File("src/proyecto_ipc/Logo_final.jpg");
 //File miImagen_2=new File("src/proyecto_ipc/Logo_pro_final.jpg");
 //File imagenLogin=new File("src/proyecto_ipc/");
 //File imagenLogin=new File("src/639813.jpg");
 
 try{
     imagen=ImageIO.read(miImagen);
     
 }
 catch(IOException e){
     System.out.println("Imagen no encontrada");
 }
 p.drawImage(imagen, 200, 3000, null);
 //p.drawImage(imagen_2, 900, 60, null);
}
 private Image imagen;   
 //private Image imagen_2; 
 }

public static void main(String[] args){
    
Ventana_emergente ve=new Ventana_emergente();
ve.setVisible(true);
}

    
    
}
