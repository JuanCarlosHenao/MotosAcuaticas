
import java.util.Date;


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
        // this.Fecha=Date.from(ho) mirar como se coloca la fecha de hoy 
        

    }


    public  int calcularCosto (){

        if (cliente.getEdad() < 18) {
            int costoAlquiler=0;
            return costoAlquiler;
        }else {
            int costoAlquiler=-1;
            return costoAlquiler;
        }


    }
    

    
    
}
