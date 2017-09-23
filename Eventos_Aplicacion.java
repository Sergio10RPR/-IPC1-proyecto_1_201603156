
package proyecto_ipc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import java.util.GregorianCalendar;
import static proyecto_ipc.Agregar_Usuarios.combo1;
public class Eventos_Aplicacion extends JFrame implements ActionListener{
//public static int cuenta
JButton sumar=new JButton("TRANSFERIR");
JTextField introducir=new JTextField(); //JLabel monto
JTextField usuario=new JTextField();
JLabel imprimir =new JLabel();
JLabel usuario_tr=new JLabel("USUARIO :");
JLabel monto_tr=new JLabel("MONTO :");
JLabel saldo=new JLabel();
JLabel JLabel_saldo=new JLabel("SALDO:");
JLabel JLabel_saldo_f=new JLabel();
JLabel JLabel_S_T=new JLabel("SALDO_TOTAL");
JButton Graficas=new JButton("GRAFICAS");
public static String contenedor;   
public static String cadena;
public static int a;
JLabel Usuario_t;   JTextField Usuario_txt;
JLabel Monto_t  ;   JTextField Monto_txt;
JButton Transferir;
public static JComboBox combo1;
public Eventos_Aplicacion(){

 
    setLayout(null);
    setTitle("LOGIN");
    setSize(500, 400);
    setLocationRelativeTo(null);
    setTitle("TRANFERENCIAS");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    
    
    
         combo1=new JComboBox();
         combo1.setBounds(10,10,80,20);
         add(combo1);
         combo1.addItem("Sergio");
         combo1.addItem("Monica");
         combo1.addItem("Pedro");
         combo1.addItem("");
         combo1.addItem("");
    
    usuario_tr.setBounds(40,40,175,20);
    usuario.setBounds(150,40,175,20);
    monto_tr.setBounds(40,100,175,20);
    introducir.setBounds(150,100,175,20);
    sumar.setBounds(350,150,120,20);
    Graficas.setBounds(350,180,120,20);
    imprimir.setBounds(200, 275, 100, 20);
    JLabel_S_T.setBounds(40,275,100,20);
    JLabel_saldo_f.setBounds(200,250,100,20);
    JLabel_saldo.setBounds(40,250,100,20);
    sumar.addActionListener(this);
    JLabel_saldo_f.setText("10000");
    add(usuario);
    add(usuario_tr);
    add(JLabel_saldo);
    add(introducir);
    add(sumar);   
    add(imprimir);
    add(JLabel_saldo_f);
    add(monto_tr);
    add(JLabel_S_T);
    add(Graficas);
    
}
@Override
public void actionPerformed(ActionEvent p){
if(p.getSource()==sumar){
if(usuario.getText().equals("Sergio")||usuario.getText().equals("Pedro")||usuario.getText().equals("Monica")){
   int suma=100;
String resultado=introducir.getText();
suma=Integer.parseInt(resultado);

int saldo_con;
String saldo_fijo="10000";
saldo_con=Integer.parseInt(saldo_fijo);

contenedor=String.valueOf(saldo_con);
contenedor=Integer.toString(saldo_con);
suma=saldo_con-suma;

String t;
t = String.valueOf(suma);
t= Integer.toString(suma);
add(imprimir);
imprimir.setText(t);
//JLabel_saldo_f.setText(contenedor);


}
else{
    
    JOptionPane.showMessageDialog(null, "¡Usuario Incorrecto!");
}
}

}


}

class Consulta_cuenta extends JFrame{
public static int cuenta;
JLabel SaldoCuenta,JLabel1,Fecha;
Consulta_cuenta(){

String Sc="10000";
Sc = String.valueOf(cuenta);
Sc= Integer.toString(cuenta);
Calendar cal = Calendar.getInstance(); 
Date fecha = cal.getTime(); 
DateFormat formatter = DateFormat.getTimeInstance(); 

SaldoCuenta=new JLabel("10000");
JLabel1=new JLabel("Saldo");
Fecha=new JLabel(formatter.format(fecha));

setLayout(null);
setTitle("CONSULTA CUENTA");
setSize(400,400);
setLocationRelativeTo(this);
setVisible(true);
SaldoCuenta.setBounds(150,50,100,20);
JLabel1.setBounds(10,50,100,20);
Fecha.setBounds(10,300,400,30);

add(SaldoCuenta);
add(Fecha);
add(JLabel1);
}
}

class Retiros_u extends JFrame implements ActionListener{
JButton retirar=new JButton("RETITAR");   
JLabel monto=new JLabel("MONTO:");
JLabel saldo_i=new JLabel("SALDO :");
JLabel saldo_f=new JLabel("SALDO_FINAL :");
JTextField monto_r=new JTextField();
JLabel saldo_i_2=new JLabel("10000");
JLabel saldo_f_2=new JLabel();
public String contenedor_2;
public Retiros_u(){
    setLayout(null);
    setSize(500, 400);
    setLocationRelativeTo(null);
    setTitle("RETIROS");
    setResizable(false);
    
    monto.setBounds(40,40,175,20);
    monto_r.setBounds(225,40,175,20);
    retirar.setBounds(225,90,175,20);
    
    saldo_i.setBounds(40,140,150,20);
    saldo_f.setBounds(40,180,150,20);
    saldo_i_2.setBounds(225,140,150,20);
    saldo_f_2.setBounds(225,180,150,20);
    
    add(monto);
    add(monto_r);
    add(retirar);
    add(saldo_i);
    add(saldo_f);
    add(saldo_i_2);
    add(saldo_f_2);
    
    retirar.addActionListener(this);
    
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==retirar){
 int suma=100;
String resultado=monto_r.getText();
suma=Integer.parseInt(resultado);

int saldo_con;
String saldo_fijo="10000";
saldo_con=Integer.parseInt(saldo_fijo);

contenedor_2=String.valueOf(saldo_con);
contenedor_2=Integer.toString(saldo_con);
suma=saldo_con-suma;

String t;
t = String.valueOf(suma);
t= Integer.toString(suma);
add(saldo_f_2);
saldo_f_2.setText(t);   
    
}
}
}

