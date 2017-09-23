
package proyecto_ipc;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class Usuarios {
Usuarios [] usuarios=new Usuarios[3];

public static String Nombre_U;
public static String Contrase_U;
public static String User_Login;
public static String Saldo_I;
public static String Empresa_A;
public static String Saldo_M;
public static JTextField n;
public static JTextField u;
public static JTextField con;
public static JTextField si;
public static JTextField sm;
public static JTextField ea;

public static int i;
public Usuarios(){
Nombre_U  =usuarios[i].getNombre_U();        Saldo_I=usuarios[i].getSaldo_I();
Contrase_U=usuarios[i].getContrase_U();      Empresa_A=usuarios[i].getEmpresa_A();
User_Login=usuarios[i].getUser_Login();      Saldo_M =usuarios[i].getSaldo_M();

//usuarios[0]=new Usuarios("","1234","Sergio","500000","CASH_MONEY","10000");
//usuarios[1]=new Usuarios("Sergio Rivelino","1234","Sergio","500000","CASH_MONEY","10000");
//usuarios[2]=new Usuarios("Sergio Rivelino","1234","Sergio","500000","CASH_MONEY","10000");


}
public Usuarios(String nombre,String pass,String user,String sal_i,String empresa,String sal_max){
Nombre_U  =nombre;        Saldo_I=sal_i;
Contrase_U=pass;          Empresa_A= empresa;
User_Login=user;          Saldo_M=sal_max;
}
public void setNombre_U(String n){
    Nombre_U=n;
}
public static String getNombre_U(){
    return Nombre_U;
}
public void setContrase_U(String c){
Contrase_U=c;
}
public static  String getContrase_U(){
    return Contrase_U;
}
public void setUser_Login(String u){
    User_Login=u;
}
public static String getUser_Login(){
    return User_Login;
}
public void setSaldo_I(String si){
    Saldo_I=si;
}
public static String getSaldo_I(){
    return Saldo_I;
}
public void setEmpresa_A(String ea){
    Empresa_A=ea;
}
public static String getEmpresa_A(){
    return Empresa_A;
}
public void setSaldo_M(String sm){
    Saldo_M=sm;
}
public static String  getSaldo_M(){
    return Saldo_M;
}

public static void main(String[] args){
//Scanner leer=new Scanner(System.in);
}
public void agregar(){ //metodo 
    
Usuarios [] usuarios=new Usuarios[1];

//usuarios[0].setContrase_U(Nombre_U);
for(int j=0;j<usuarios.length;j++){
Nombre_U=JOptionPane.showInputDialog("Ingrese Nombre de Usuario");
//Nombre_U=leer.next();
Contrase_U=JOptionPane.showInputDialog("Ingrese contraseña");
//Contrase_U=leer.next();
User_Login=JOptionPane.showInputDialog("Ingrese Nombre");
//User_Login=leer.next();
Saldo_I=JOptionPane.showInputDialog("Ingrese saldo inicial");
//Saldo_I=leer.next();
//Empresa_A=JOptionPane.showInputDialog("Ingrese empresa atiende");
//Empresa_A=leer.next();
Saldo_M=JOptionPane.showInputDialog("Ingrese saldo maximo");
//Saldo_M=leer.next();
usuarios[j]=new Usuarios(Nombre_U, Contrase_U, User_Login, Saldo_I, Empresa_A, Saldo_M);


}

for(  i=0;i<usuarios.length;i++){

usuarios[i].getNombre_U();
n=new JTextField(usuarios[i].getNombre_U());
u=new JTextField(usuarios[i].getUser_Login());
con=new JTextField(usuarios[i].getContrase_U());
si=new JTextField( usuarios[i].getSaldo_I());
sm=new JTextField(usuarios[i].getSaldo_M());
ea=new JTextField(usuarios[i].getEmpresa_A());
ventana_Usuario_nuevo uh=new ventana_Usuario_nuevo();
uh.setVisible(true);

for(int j=0;j<usuarios.length;j++){
    
      Ventana_emergente UAccede=new Ventana_emergente();
      UAccede.JLabel_n.setText(usuarios[i].getNombre_U());
      UAccede.JLabel_nu.setText(usuarios[i].getUser_Login());
      UAccede.JLabel_con.setText(usuarios[i].getContrase_U());
      UAccede.JLabel_ea.setText(usuarios[i].getSaldo_I());
      UAccede.JLabel_si.setText(usuarios[i].getSaldo_M());
      UAccede.JLabel_sm.setText(usuarios[i].getEmpresa_A());
    
}

      
    
      
      //UAccede.setVisible(true);
      //UAccede.setExtendedState(6);
    System.out.println(usuarios[i].getNombre_U() + " " + usuarios[i].getContrase_U() + " " + 
    usuarios[i].getUser_Login() + " " + usuarios[i].getEmpresa_A() + " " + 
    usuarios[i].getSaldo_I() + " " + usuarios[i].getSaldo_M());
     
}
}
//Termina el metodo agregar



public static class ventana_Usuario_nuevo extends JFrame implements ActionListener{
public  JLabel  JLabel_2_n;
public  JLabel  JLabel_2_u;
public  JLabel  JLabel_2_con;
public  JLabel  JLabel_2_si;
public  JLabel  JLabel_2_sm;
public  JLabel  JLabel_2_ea;
public static JButton Acceder_Cajero; 

        
//Constructor Usuario Nuevo
public ventana_Usuario_nuevo() { //Muestra la ventana con los datos del usuario creado
Usuarios uu=new Usuarios();

//setVisible(true); 
uu.usuarios[0]=new Usuarios();

dispose();
setLayout(null);
setTitle("USUARIO_NUEVO");
setSize(600,400);
setLocationRelativeTo(this);
JLabel_2_n=new JLabel("NOMBRE:");
JLabel_2_u=new JLabel("NOMBRE_USUARIO:");
JLabel_2_con=new JLabel("PASSWORD:");
JLabel_2_si=new JLabel("SALDO_INICIAL:");
JLabel_2_sm=new JLabel("SALDO_MAXIMO:");
JLabel_2_ea=new JLabel("EMPRESA:");
Acceder_Cajero=new JButton("ACCEDER");

Acceder_Cajero.setBounds(350,320,125,20);

n.setBounds(225,30,175,25);
u.setBounds(225,80,175,25);
con.setBounds(225,130,175,25);
si.setBounds(225,180,175,25);
sm.setBounds(225,230,175,25);
ea.setBounds(225,280,175,25);

JLabel_2_n.setBounds(30,30,175,25);
JLabel_2_u.setBounds(30,80,175,25);
JLabel_2_con.setBounds(30,130,175,25);
JLabel_2_si.setBounds(30,180,175,25);
JLabel_2_sm.setBounds(30,230,175,25);
JLabel_2_ea.setBounds(30,280,175,25);

add(JLabel_2_n);
add(JLabel_2_u);
add(JLabel_2_con);
add(JLabel_2_si);
add(JLabel_2_sm);
add(JLabel_2_ea);

add(n);
add(u);
add(con);
add(si);
add(sm);
add(ea);

add(Acceder_Cajero);
Acceder_Cajero.addActionListener(this);
        }
@Override
public void actionPerformed(ActionEvent acc){
if(acc.getSource()==Acceder_Cajero){
  //Usuarios oo=new Usuarios();
  // oo.Acceder_cajero();
  Menu oo=new Menu();
  oo.setVisible(true);
  oo.setExtendedState(6);
  
      
}

}


}
//Constructor
public void Acceder_cajero(){
Ventana_emergente UAccede=new Ventana_emergente();
UAccede.setVisible(true);
      
      
}
}



