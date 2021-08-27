
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Alquiler {

    private int Id;
    private Cliente Cliente;
    private MotoAcuatica Moto;
    private Date Fecha;
    private int HorasAlquiler;
  



    //NOTAS : Revisar en los constructories qué tipo de cosa se da

    //Constructor 1 
    public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,int horasAlquiler) throws ParseException{
        this.Id=Id;
        this.Cliente=Cliente;
        this.Moto=moto;
        
        
        // Date date = new Date(); // This object contains the current date value
        // System.out.println(formatter.format(date));
        // Date date= new Date ();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        // Date date=new Date();
        this.Fecha=new Date();
        // System.out.println( formatter.format(this.Fecha)); // Recibe una fecha y la pasa String 
        // this.Fecha=formatter.parse(new Date ().toString());
        // this.Fecha=formatter.format(this.Fecha);
        this.HorasAlquiler=horasAlquiler;


    }

    //Constructor 2
    public Alquiler(int id, Cliente Cliente, MotoAcuatica moto,Date fecha ,int horasAlquiler){
        this.Id=Id;
        this.Cliente=Cliente;
        this.Moto=moto;
        this.HorasAlquiler=horasAlquiler;
        // SimpleDateFormat dateFormat = new SimpleDateFormat ("dd-MM-yyyy");  
        this.Fecha=fecha;
            
    
        

    }






    public Cliente getCliente() {
        return Cliente;
    }


    public MotoAcuatica getMoto() {
        return Moto;
    }



    public Date getFecha() {
        return Fecha;
    }


    public  int calcularCosto (){
        int costoAlquiler=0;
        int valueHour=0;


        if (Cliente.getEdad() < 18) {
             return 0;
        }else {

            // Double costoAlquiler=0;
            String firstLetter = Moto.getIdentificador().substring(0,1); // Sacar la letra del primer caracater


            if(firstLetter.equals("L")  || firstLetter.equals("l"))
                { 
                    valueHour = 30000;
                }
            else if(firstLetter.equals("D")  || firstLetter.equals("d"))
                {
                    valueHour = 45000;
                }
            else if(firstLetter.equals("P")  || firstLetter.equals("p"))
                {
                    valueHour = 90000;
                }
            else 
                {
                    valueHour = 50000;
                }
            costoAlquiler = this.HorasAlquiler*valueHour;
            return costoAlquiler;

        }
    }

    public static int VentasPorDias(Alquiler[] alquileres, Date min, Date max){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Le doy el formato a la fecha 
        // String minima= formatter.format(min);
        // String maxima=formatter.format(max);
        int acumulateCost= 0;
        for (int i = 0; i < alquileres.length; i++) {
            if ((alquileres[i].getFecha().after(min)) &&  (alquileres[i].getFecha().before(max)))
            {
                acumulateCost=acumulateCost+alquileres[i].calcularCosto();




            }
            
        }

        return acumulateCost;

    }






    
    
}











/* 

public double CalcularCosto()
{
    if(this.EsValIdo())
    {
        String letra;
        int vlrhora = 0;
        letra = this.IdentificadorMoto.substring(0,1);//sacar caracter de la posicion 1
        if(letra.equals("L")  || letra.equals("l"))
            { 
                vlrhora = 30000;
            }
        else if(letra.equals("D")  || letra.equals("d"))
            {
                vlrhora = 45000;
            }
        else if(letra.equals("P")  || letra.equals("p"))
            {
                vlrhora = 90000;
            }
        else 
            {
                vlrhora = 50000;
            }
    return (double) this.HorasAlquiler * vlrhora;
    }
    else{
        return 0;
    }
}

public boolean EsValIdo()
    {
        Calendar calendario = Calendar.getInstance();
        
        int ano = calendario.get(Calendar.YEAR);
        return Math.abs(this.AnoNacimientoCliente - ano) >= 18;
    }

 */