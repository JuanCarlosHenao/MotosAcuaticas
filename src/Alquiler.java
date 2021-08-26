
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Alquiler {

    private int id;
    private Cliente cliente;
    private MotoAcuatica moto;
    private Date fecha;
    private int horasAlquiler;
  



    //NOTAS : Revisar en los constructories qué tipo de cosa se da

    //Constructor 1 
    public Alquiler(int id, MotoAcuatica moto, Cliente cliente, int horasAlquiler){
        this.id=id;
        this.cliente=cliente;
        this.moto=moto;
        // this.Fecha=Date.from(ho) mirar como se coloca la fecha de hoy 
        this.horasAlquiler=horasAlquiler;


    }

    //Constructor 2
    public Alquiler(int id, MotoAcuatica moto, Cliente cliente, int horasAlquiler, Date fecha){
        this.id=id;
        this.cliente=cliente;
        this.moto=moto;
        this.horasAlquiler=horasAlquiler;
        // SimpleDateFormat dateFormat = new SimpleDateFormat ("dd-MM-yyyy");  

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
            Date date1 = dateFormat.parse("2019-09-16");
            // Date date2 = dateFormat.parse("2020-01-25");
            // System.out.println("Date-1: " + 
            //                    dateFormat.format(date1));
            // System.out.println("Date-2: " +
            //                    dateFormat.format(date2));
            // if(date1.before(date2)){
            //     System.out.println(
            //         "Date-1 is before Date-2");
            // } 
            this.fecha=date1;
        } catch (ParseException ex) {
        }

        

    }


    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public MotoAcuatica getMoto() {
        return moto;
    }

    public void setMoto(MotoAcuatica moto) {
        this.moto = moto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public  int calcularCosto (){
        int costoAlquiler=0;
        int valueHour=0;


        if (cliente.getEdad() < 18) {
             return 0;
        }else {

            // Double costoAlquiler=0;
            String firstLetter = moto.getIdentificador().substring(0,1); // Sacar la letra del primer caracater


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
            costoAlquiler = this.horasAlquiler*valueHour;
            return costoAlquiler;

        }


    }


   /*  public int VentasPorRangoDias(Alquiler[] alquileres, Date min, Date max){
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i].getFecha()min && alquileres[i].getFecha()<max){

            }
            
        }
        
        return
    }


 */





    
    
}











/* 

public double CalcularCosto()
{
    if(this.EsValido())
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

public boolean EsValido()
    {
        Calendar calendario = Calendar.getInstance();
        
        int ano = calendario.get(Calendar.YEAR);
        return Math.abs(this.AnoNacimientoCliente - ano) >= 18;
    }

 */