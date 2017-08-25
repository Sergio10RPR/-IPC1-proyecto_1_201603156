import java.util.Scanner;

public class Juego_Snake {
Scanner input = new Scanner(System.in);
 public static final boolean Inicio = false;
 public static String nombre_usuario;
 public static int i,j;
      public static void Menu(){
      System.out.println();
         System.out.println("");
      }
       public static void Tablero_S(String[][] Tablero)
      {
         for(int a = 0; a < Tablero.length; a++)
         {
            for(int b = 0; b < Tablero[0].length; b++)
            {
               Tablero[a][b] = ".";
            }
         }
      }
      public static void MostrarTablero(String[][] Tablero)
      {
         Menu();
         for(int a = 0; a < Tablero.length; a++)
         {
            if(Inicio == true)
            {
               for(int b = 0; b < Tablero[0].length; b++)
               {
                  System.out.print(" "+Tablero[a][b]);
               }
               System.out.println("");
            }
            else
            {
               for(int c = 0; c < Tablero[0].length; c++)
               {
                  if(Tablero[a][c].equals("o"))
                  {
                     System.out.print(" "+".");
                  }
                  else
                  {
                     System.out.print(" "+Tablero[a][c]);
                  }
               }
               System.out.println("");
            }
         }
         Menu();
      }
       public static void Random(String[][] Tablero,int Tamaño)
      {
         if(Math.random() < 0.5)
         {
            int col = (int)(Math.random()*5);
            int row = (int)(Math.random()*7);
            for(int i = 0; i<Tamaño; i++)
            {
               Tablero[row][col+i] = "o";
            }
         }
         else
         {
            int col = (int)(Math.random()*7);
            int row = (int)(Math.random()*5);
            for(int i = 0; i<Tamaño; i++)
            {
               Tablero[row+i][col] = "o";
            }
         }
      }
        public static int Snake(String[][] Tablero, int h, int t){
      
         Scanner input = new Scanner(System.in);
         int filas,columnas;
         System.out.println("\033[36mUSUARIO " + nombre_usuario);
         System.out.println("Seleccione movimiento del SNAKE en la fila: ");
         filas = input.nextInt();
       
         System.out.println("Seleccione movimiento del SNAKE en la columna ");
         columnas = input.nextInt();
         
         
         if(Tablero[filas-1][columnas-1].equals("o"))
         {
            h ++;
            System.out.println("");
            Tablero[filas-1][columnas-1] = "!";
         }
         else
         {
            System.out.println("");
            Tablero[filas-1][columnas-1] = "\033[34m@";
         }
         return h;
}
        public static void DatosEstudiantes(){
            
System.out.println("\033[35mNOMBRES : SERGIO RIVELINO PEREZ RIVERA");
    System.out.println("_____________________________________");

System.out.println("\033[34mCARNET  : 201603156");
    System.out.println("_____________________________________");
System.out.println("\033[32mCARRERA : CIENCIAS Y SISTEMAS");
    System.out.println("_____________________________________");
}
public static void Historial_Partidas(){
System.out.println("USUARIO: Sergio " + " Punteo: 100");
}
   public static void InicioJuego()
   {
Scanner entrada_2=new Scanner(System.in);
 
int Tamaño_x=0; int Tamaño_y=0;
int Tamaño_s=0;
System.out.println("\033[35mINGRESE NOMBRE DE USUARIO");
nombre_usuario=entrada_2.next();
System.out.println("\033[34mINGRESE TAMAÑO DEL TABLERO EN X");
i=entrada_2.nextInt();
System.out.println("\033[35mINGRESE TAMAÑO DEL TABLERO EN Y");
j=entrada_2.nextInt();
System.out.println("Ingrese el tamaño incial del SNAKE");

   }     
public static void main(String []args){
Scanner entrada=new Scanner(System.in);
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@    SNAKE     @@@@@@@@@@@@@@@@@@@@@@");
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
Scanner lector=new Scanner(System.in);
int opcion;
                               System.out.println("\033[31mMENU");
System.out.println("\033[34mIngrese la opcion que desea");
System.out.println("\033[34m1.INICIO DEL JUEGO");
System.out.println("\033[34m2.DATOS DEL ESTUDIANTE");
System.out.println("\033[34m3.HISTORIAL DE PARTIDAS JUGADAS");
System.out.println("\033[34m4.Salir");
opcion=lector.nextInt();
switch(opcion){
    case 1:
InicioJuego();
String[][] Tablero = new String[i][j];
Tablero_S(Tablero); 
         MostrarTablero(Tablero);
         Random(Tablero, 1);
          int t = i;
         int h = 0;
         int mover;
         
         while(t > 0 && h < 5)
         {
            MostrarTablero(Tablero);
            h = Snake(Tablero, h, t);
            t --;
         }
         break;
    case 2:
        DatosEstudiantes();
        break;
    case 3:
        Historial_Partidas();
        break;
    case 4:
         System.exit(0);
         break;
         default:
        
         
}       
         
}   
}
