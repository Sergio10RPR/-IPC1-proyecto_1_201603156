
package proyecto_ipc;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Agregar_Usuarios extends JFrame implements ActionListener {
public  static String Nombre_U;
public static  String Contrase_U;
public  static String User_Login;
public static int Saldo_I;
public static String Empresa_A;
public static int Saldo_M;
    
public static JButton Agregar;
public static JLabel  Nombre_1;
public static JLabel  Nombre_User_1;
public static JLabel  Password_1;
public static JLabel  Saldo_I_1;
public static JLabel  Saldo_M_1;
public static JTextField Nombre_Txt;
public static JTextField Nombre_User_txt;
public static JTextField Password_txt;
public static JTextField Saldo_I_txt;
public static JTextField Saldo_M_txt;
public static JComboBox combo1;

Agregar_Usuarios(){
    
       setLayout(null);
       setTitle("Agregar Usuario");
       //setSize(600,800);
       setBounds(200,100,600,500);

        combo1=new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        combo1.addItem("Sergio");
        combo1.addItem("Monica");
        combo1.addItem("Pedro");
        combo1.addItem("");
        combo1.addItem("");
        //combo1.addItemListener();
setLayout(null);
setTitle("Agregar Usuario");
//setSize(600,800);
setBounds(200,100,600,500);

Agregar=new JButton("Agregar_Usuario");
Agregar.setBounds(200, 400, 200, 30);
add(Agregar);
Agregar.addActionListener(this);
 

}
@Override
public void actionPerformed(ActionEvent v){
if(v.getSource()==Agregar){
Usuarios agrega=new Usuarios();
agrega.agregar();



   
   
}
}

public class Usuarios_1{
Usuarios [] usuarios=new Usuarios[1];
public Usuarios_1(){
Nombre_U  ="";        Saldo_I=10000;
Contrase_U="";        Empresa_A= "";
User_Login="";        Saldo_M=20000;

}
public Usuarios_1(String nombre,String pass,String user,int sal_i,String empresa,int sal_max){
Nombre_U  =nombre;        Saldo_I=sal_i;
Contrase_U=pass;          Empresa_A= empresa;
User_Login=user;          Saldo_M=sal_max;
}
public void setNombre_U(String n){
    Nombre_U=n;
}
public String getNombre_U(){
    return Nombre_U;
}
public void setContrase_U(String c){
Contrase_U=c;
}
public String getContrase_U(){
    return Contrase_U;
}
public void setUser_Login(String u){
    User_Login=u;
}
public String getUser_Login(){
    return User_Login;
}
public void setSaldo_I(int si){
    Saldo_I=si;
}
public int getSaldo_I(){
    return Saldo_I;
}
public void setEmpresa_A(String ea){
    Empresa_A=ea;
}
public String getEmpresa_A(){
    return Empresa_A;
}
public void setSaldo_M(int sm){
    Saldo_M=sm;
}
public int getSaldo_M(){
    return Saldo_M;
}
}

public static void main(String[] args){


}
}
