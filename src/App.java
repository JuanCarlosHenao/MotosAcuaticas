import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.synth.SynthStyle;

public class App {
    public static void main(String[] args) throws Exception {


        // prueba 1
        
                // public MotoAcuatica(String identificador, String modelo, String marca) {
            MotoAcuatica moto1 = new MotoAcuatica("LDA431", "RXT ", "Sea-Doo");
            System.out.println(moto1.getIdentificador());
            // public Cliente(String cedula, int edad, String nombre) {
            Cliente cliente1= new Cliente ("100513551", 18, "Carlos");
            System.out.println("La cédula del cliente es " +cliente1.getCedula());
            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,int horasAlquiler){       
            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,Date fecha ,int horasAlquiler){
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Le doy el formato a la fecha 
            Date fecha1 = formatter.parse("16-07-2021"); // Creo la fecha nueva 
            Alquiler alquiler1=new Alquiler(1, cliente1, moto1,fecha1, 1);
            System.out.println("La fecha del alquiler 1 es: "+formatter.format(alquiler1.getFecha())); // PAsa la fecha a String con formato 
            System.out.println("El costo del alquiler para "+cliente1.getNombre()+" es "+alquiler1.calcularCosto()); 
            System.out.println("");






            // prueba 2
            
            MotoAcuatica moto2 = new MotoAcuatica("LDA432", "RXT ", "Sea-Doo");
            System.out.println(moto2.getIdentificador());
            Cliente cliente2= new Cliente ("10009931", 20, "Charlie");
            System.out.println("La cédula del cliente es " +cliente2.getCedula());

            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,int horasAlquiler){       
            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,Date fecha ,int horasAlquiler){

            // SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Le doy el formato a la fecha 
            Date fecha2 = formatter.parse("18-07-2021"); // Creo la fecha nueva 
            
            Alquiler alquiler2=new Alquiler(2, cliente2, moto2, fecha2, 2);
            System.out.println("La fecha del alquiler 1 es: "+formatter.format(alquiler2.getFecha())); // PAsa la fecha a String con formato 
            System.out.println("El costo del alquiler para "+cliente2.getNombre()+" es "+alquiler2.calcularCosto()); 

            System.out.println();


            // prueba 3
            
            MotoAcuatica moto3 = new MotoAcuatica("PDA433", "RXT ", "Sea-Doo");
            System.out.println(moto3.getIdentificador());
            Cliente cliente3= new Cliente ("10009931", 20, "Charlie");
            System.out.println("La cédula del cliente es " +cliente3.getCedula());

            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,int horasAlquiler){       
            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,Date fecha ,int horasAlquiler){

            // SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Le doy el formato a la fecha 
            Date fecha3 = formatter.parse("19-07-2021"); // Creo la fecha nueva 
            
            Alquiler alquiler3=new Alquiler(6, cliente3, moto3, fecha3, 4);
            System.out.println("La fecha del alquiler 1 es: "+formatter.format(alquiler3.getFecha())); // PAsa la fecha a String con formato 
            System.out.println("El costo del alquiler para "+cliente3.getNombre()+" es "+alquiler3.calcularCosto()); 

            System.out.println();


            // prueba 4
            
            MotoAcuatica moto4 = new MotoAcuatica("FDA434", "RXT ", "Sea-Doo");
            System.out.println(moto4.getIdentificador());
            Cliente cliente4= new Cliente ("10009931", 20, "Charlie");
            System.out.println("La cédula del cliente es " +cliente4.getCedula());

            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,int horasAlquiler){       
            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,Date fecha ,int horasAlquiler){

            // SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Le doy el formato a la fecha 
            Date fecha4 = formatter.parse("14-07-2021"); // Creo la fecha nueva 
            
            Alquiler alquiler4=new Alquiler(0, cliente4, moto4, fecha4, 3);
            System.out.println("La fecha del alquiler 1 es: "+formatter.format(alquiler4.getFecha())); // PAsa la fecha a String con formato 
            System.out.println("El costo del alquiler para "+cliente4.getNombre()+" es "+alquiler4.calcularCosto()); 

            System.out.println();

            // prueba 5

            MotoAcuatica moto5 = new MotoAcuatica("DDA435", "RXT ", "Sea-Doo");
            System.out.println(moto5.getIdentificador());
            Cliente cliente5= new Cliente ("10009931", 20, "Charlie");
            System.out.println("La cédula del cliente es " +cliente5.getCedula());

            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,int horasAlquiler){       
            // public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,Date fecha ,int horasAlquiler){

            // SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Le doy el formato a la fecha 
            Date fecha5 = formatter.parse("26-07-2021"); // Creo la fecha nueva 
            
            Alquiler alquiler5=new Alquiler(8, cliente5, moto5, fecha5, 4);
            System.out.println("La fecha del alquiler 1 es: "+formatter.format(alquiler5.getFecha())); // PAsa la fecha a String con formato 
            System.out.println("El costo del alquiler para "+cliente5.getNombre()+" es "+alquiler5.calcularCosto()); 

            System.out.println();
                    
        








        Alquiler [] alquileres1 = new Alquiler[5];
        Date min = formatter.parse("19-07-2021"); // Creo la fecha nueva 
        Date max = formatter.parse("26-07-2021"); // Creo la fecha nueva 
        alquileres1[0]=alquiler1;
        alquileres1[1]=alquiler2;
        alquileres1[2]=alquiler3;
        alquileres1[3]=alquiler4;
        alquileres1[4]=alquiler5;

        int Ventas=Alquiler.VentasPorDias(alquileres1,min,max);
        System.out.println("El costo acumulado de los alquileres es: " + Ventas);

        System.out.println(alquileres1[1].getFecha());













        // System.out.println("Hello, World!");
        // DECLARACIÓN DE VARIABLES PRIMITIVAS 

        // ENTERO 
/*         byte b=10; //8 bits 
        short x=10565; //16 bits 
        int w=213312514; // 32bits 
        long z=1234234324124423L; //64bits 

        x=b;
        w=x;
        z=w;
        x=(Short)w;
    
 */
        // Aqui hago un comentario para la rama 2  y el push 2 
        // Aqui hago un comentario nuevo para la rama 2 y el push 3 
        // System.out.println("Hola a todos, c+omo están ?");

        // Nuevecito !!

        // Uno más
        
        // Otro comentario
        // Un comentario más !!
        
    }

    // Comentario de linea
    /* Comentario de bloque */

    /*
     * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>PASOS<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
     * <<<<<<<<<<<<<<<<<<<<<<<
     */

    /**
     * 1) Descargar el jdk de java que es el kit de desarrollo de java 
     * 2) Creo proyecto nuevo de java
     * 
     */

}
