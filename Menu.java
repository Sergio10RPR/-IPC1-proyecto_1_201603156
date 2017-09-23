
package proyecto_ipc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;
import javax.swing.*;
import static proyecto_ipc.Eventos_Aplicacion.*;
import static proyecto_ipc.Usuarios.i;
import proyecto_ipc.Ventana_emergente.miLamina_2;

public class Menu extends JFrame implements ActionListener{
//public JLabel JLabel_n,JLabel_nu,JLabel_con,JLabel_si,JLabel_ea,JLabel_sm;

public static String nombre_un;
public static String password_un;
public String cambio;
public JTextField User,Password;
public JLabel usuario,contrasena;
public JButton entrar;
public Menu (){
//setLayout(null);
setTitle("LOGIN");

//getContentPane().setBackground(); // Cambiar el color a la ventana
User =new JTextField();
Password=new JPasswordField();
usuario=new JLabel("USUARIO");
contrasena=new JLabel("CONTRASENA");
entrar=new JButton("LOGIN");
User.setBounds(200,20,140,20);
Password.setBounds(200,90,140,20);
usuario.setBounds(30,20,90,20);	
//usuario.setForeground();// cambiar el color a las letra Jlabel
contrasena.setBounds(30,90,90,25);
entrar.setBounds(30,200,100,50);
add(User);
add(Password);
add(usuario);
add(contrasena);
add(entrar);
ImagenLogin w=new ImagenLogin();
add(w);
w.setVisible(true);
entrar.addActionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	





}


        
    
 class ventana_emergente extends JFrame implements ActionListener{
     JButton Cash_Money;
     JButton Pro_Pisto;
     private String transaccion;
     private String a;
    public ventana_emergente(){
    Cash_Money=new JButton("CASH MONEY");
    Pro_Pisto= new JButton("PRO PISTO");
    setVisible(true);
    setExtendedState(6);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //setSize(1000,1000);
    //setLocationRelativeTo(null);
    Cash_Money.setBounds(150,600,120,50);
    Cash_Money.setForeground(Color.GREEN);// cambiar el color a las letra Jlabel
    Pro_Pisto.setBounds(950,600,120,50);
    Pro_Pisto.setForeground(Color.GRAY);
    
    add(Cash_Money);
    add(Pro_Pisto);
    miLamina figura=new miLamina();
    add(figura);  
    figura.setVisible(true);
    Cash_Money.addActionListener(this);
    Pro_Pisto.addActionListener(this);
    }
    
@Override
public void actionPerformed(ActionEvent e){
 Usuarios Nu=new Usuarios();  //Inicializando la clase Usuarios
 Nu.setUser_Login(a);
 if(e.getSource()==Cash_Money){
     
 if(User.getText().equals("Sergio") && Password.getText().equals("1234")){
     dispose();
     Ventana_emergente F=new Ventana_emergente();
     F.setVisible(true);
     F.setExtendedState(6);
     //Usuarios usua=new Usuarios();
      
      F.JLabel_n.setText("SERGIO");
      F.JLabel_nu.setText("SERGIO_RPR");
      F.JLabel_con.setText("1234");
      F.JLabel_ea.setText("CASH_MONEY");
      F.JLabel_si.setText("12000");
      F.JLabel_sm.setText("20000");
      
     
 }
 else if(User.getText().equals("Monica10")&& Password.getText().equals("Estudiante2")){
     dispose();
     Ventana_emergente F=new Ventana_emergente();
     F.setVisible(true);
     F.setExtendedState(6);
     F.JLabel_n.setText("Monica");
     F.JLabel_nu.setText("Monica10");
     F.JLabel_con.setText("Estudiante2");
     F.JLabel_ea.setText("CASH_MONEY");
     F.JLabel_si.setText("12500");
     F.JLabel_sm.setText("20000");
      
 }
 else if(User.getText().equals("Pedro10")&& Password.getText().equals("Estudiante3")){
     dispose();
     Ventana_emergente F=new Ventana_emergente();
     F.setVisible(true);
     F.setExtendedState(6);
     F.JLabel_n.setText("Pedro Rodriguez");
     F.JLabel_nu.setText("Pedro10");
     F.JLabel_con.setText("Estudiante");
     F.JLabel_ea.setText("CASH_MONEY");
     F.JLabel_si.setText("20000");
     F.JLabel_sm.setText("25000");
     
     //nombre_un=Usuarios.Nombre_U;
     //password_un=Usuarios.Contrase_U;
 }else if(User.getText().equals(Usuarios.Nombre_U)&& Password.getText().equals(Usuarios.Contrase_U)){
      dispose();
     
      Ventana_emergente UAccede=new Ventana_emergente();
      UAccede.setVisible(true);
      UAccede.setExtendedState(6);
      UAccede.JLabel_n.setText(Usuarios.getNombre_U());
      UAccede.JLabel_nu.setText(Usuarios.getUser_Login());
      UAccede.JLabel_con.setText(Usuarios.getContrase_U());
      UAccede.JLabel_ea.setText(Usuarios.getSaldo_I());
      UAccede.JLabel_si.setText(Usuarios.getSaldo_M());
      UAccede.JLabel_sm.setText(Usuarios.getEmpresa_A());
     
            
     
      
 }
 else{
 }
 }
     if(e.getSource()==Pro_Pisto){
     if(User.getText().equals("Sergio") && Password.getText().equals("1234")){
     /*dispose();
     Ventana_emergente_2 ve2=new Ventana_emergente_2();
     ve2.setVisible(true);
     ve2. setExtendedState(6);*/
     dispose();
     Ventana_emergente F=new Ventana_emergente();
     F.setVisible(true);
     F.setExtendedState(6);
     //Usuarios usua=new Usuarios();
      
      F.JLabel_n.setText("SERGIO");
      F.JLabel_nu.setText("SERGIO_RPR");
      F.JLabel_con.setText("1234");
      F.JLabel_ea.setText("PRO_PISTO");
      F.JLabel_si.setText("12000");
      F.JLabel_sm.setText("20000");
      
     
      
     }
     else if(User.getText().equals("Monica10") && Password.getText().equals("Estudiante2")){
     dispose();
     Ventana_emergente F=new Ventana_emergente();
     F.setVisible(true);
     F.setExtendedState(6);
     F.JLabel_n.setText("Monica");
     F.JLabel_nu.setText("Monica10");
     F.JLabel_con.setText("Estudiante2");
     F.JLabel_ea.setText("CASH_MONEY");
     F.JLabel_si.setText("12500");
     F.JLabel_sm.setText("20000");
      
     
     }
     else if(User.getText().equals("Pedro")&& Password.getText().equals("Estudiante3")){
     dispose();
     Ventana_emergente F=new Ventana_emergente();
     F.setVisible(true);
     F.setExtendedState(6);
     F.JLabel_n.setText("Pedro Rodriguez");
     F.JLabel_nu.setText("Pedro10");
     F.JLabel_con.setText("Estudiante");
     F.JLabel_ea.setText("CASH_MONEY");
     F.JLabel_si.setText("20000");
     F.JLabel_sm.setText("25000");
     }
     else if (User.getText().equals(Usuarios.Nombre_U)&& Password.getText().equals(Usuarios.Contrase_U)){
     dispose();
     
      Ventana_emergente UAccede=new Ventana_emergente();
      UAccede.setVisible(true);
      UAccede.setExtendedState(6);
      UAccede.JLabel_n.setText(Usuarios.getNombre_U());
      UAccede.JLabel_nu.setText(Usuarios.getUser_Login());
      UAccede.JLabel_con.setText(Usuarios.getContrase_U());
      UAccede.JLabel_ea.setText(Usuarios.getSaldo_I());
      UAccede.JLabel_si.setText(Usuarios.getSaldo_M());
      UAccede.JLabel_sm.setText(Usuarios.getEmpresa_A());
      UAccede.Transferencias.setForeground(Color.RED);
     
     }
     
}
}
}
 public class miLamina extends JPanel{
 @Override
 public void paintComponent(Graphics g){
 super.paintComponent(g);
 File miImagen=new File("src/proyecto_ipc/Logo_final.jpg");
 File miImagen_2=new File("src/proyecto_ipc/Logo_pro_final.jpg");
 File imagenLogin=new File("src/proyecto_ipc/");
 //File imagenLogin=new File("src/639813.jpg");
 try{
 imagen_2=ImageIO.read(miImagen_2);
 }
 catch(IOException e){
  System.out.println("Imagne no encontrada");
 }
 try{
     imagen=ImageIO.read(miImagen);
     
 }
 catch(IOException e){
     System.out.println("Imagen no encontrada");
 }
 g.drawImage(imagen, 70, 60, null);
 g.drawImage(imagen_2, 900, 60, null);
}
 private Image imagen;   
 private Image imagen_2; 
 }
 @Override
public void actionPerformed(ActionEvent ev){
     Agregar_Usuarios u=new Agregar_Usuarios();
	if(ev.getSource()==entrar){
		
	if(User.getText().equals("Sergio") && Password.getText().equals("1234")){
         
        //JOptionPane.showMessageDialog(null,"Password y usuario correctos");
        //String ser=User.getText();
               
	       dispose();
               ventana_emergente p=new ventana_emergente();
               p.setVisible(true);
               
               
               }
        else if(User.getText().equals("Superusuario")&& Password.getText().equals("8")){
            dispose();
            Agregar_Usuarios A=new Agregar_Usuarios();
            A.setVisible(true);
            //A.setBounds(200,100,600,500);
           
        }
        else if(User.getText().equals("Pedro")&& Password.getText().equals("10")){
           dispose();
           ventana_emergente p=new ventana_emergente();
           p.setVisible(true);
           
            
     
      
		 
        }
        else if(User.getText().equals("Juan")&& Password.getText().equals("11")){
        dispose();
        ventana_emergente p=new ventana_emergente();
        p.setVisible(true);
        
               
      }
      
      else if(User.getText().equals(Usuarios.Nombre_U)&& Password.getText().equals(Usuarios.Contrase_U)){
      System.out.println("Usuario Nuevo Ingreso al sistema");
      ventana_emergente ven=new ventana_emergente();
      ven.setVisible(true);
      ven.setExtendedState(6);
      
      
      
        }
     
else{
	JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrectos");
}
        }
}

  class ImagenLogin extends JPanel{
 @Override
 public void paintComponent(Graphics l){
 super.paintComponent(l);
 
 File imagenLogin=new File("src/proyecto_ipc/Login_1.jpg");
 //File imagenLogin=new File("src/639813.jpg");
 try{
 imagen_L=ImageIO.read(imagenLogin);
 }
 catch(IOException e){
  System.out.println("Imagen no encontrada");
 }
 
 l.drawImage(imagen_L, 250, 120, null);
 
}
 private Image imagen_L;   
 
 }
  



public static void main(String[] args) {
Menu p=new Menu();
p.setVisible(true);
p.setBounds(400,200,500,400);


        
}
    
}
