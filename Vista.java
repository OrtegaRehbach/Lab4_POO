import java.util.Scanner;
import java.util.ArrayList;

public class Vista {
    Scanner scan;
    Controlador crl;

    public Vista(){
        scan=new Scanner(System.in);
    }
public void menu(){
        int eleccion=0;
        crl= new Controlador();
        while (eleccion!=8){
            System.out.println("MENU - Simulador de radio 3000");
            System.out.println("1) Encender el radio");
            System.out.println("2) Cambiar el volumen");
            System.out.println("3) Modo Radio");
            System.out.println("4) Modo reproduccion");
            System.out.println("5) Modo telefono");
            System.out.println("6) Modo productividad");
            System.out.println("7) Apagar el radio");
            System.out.println("8) Salir");
            eleccion= scan.nextInt();

            if (eleccion==1){
                crl.Encender();    
            }
            
            if (eleccion==2){
                if (crl.getEstadoRadio()==true){
                    System.out.println("1) Subir Volumen");
                    System.out.println("2) Bajar Volumen");
                    int volumen=scan.nextInt();
                    crl.CambiarVolumen(volumen);
                }else{
                    invalido();
                }
            }
            if (eleccion==3){
                if (crl.getEstadoRadio()==true){
                    System.out.println("Modo radio 3000");
                    System.out.println("1) Cambiar de FM a AM");
                    System.out.println("2) Cambiar Emisoras");
                    System.out.println("3) Guardar Emisoras");
                    System.out.println("4) Carga Emisoras");
                    int eleccion2= scan.nextInt();
                    if (eleccion2==1){
                        crl.IntercambiarBanda();
                    }else if (eleccion2==2){
                        System.out.println("1) Una emisora más");
                        System.out.println("2) Una emisora menos");
                        int OPemisora=scan.nextInt();
                        crl.CambiarEmisora(OPemisora);
                    }
                    else if (eleccion2==3){
                        crl.GuardarEmisora();

                    }else if (eleccion2==4){
                        System.out.println("Ingrese el numero de emisora que quiere cargar (ej: 0.5)");
                        Double CargaEmisora= scan.nextDouble();
                        crl.CargarEmisora(CargaEmisora);
                    }else{
                        invalido();
                    }
                   

                }else{
                    invalido();
                }
                
            }
            if (eleccion==4){
                if (crl.getEstadoRadio()==true){
                    System.out.println("Modo Reproduccion 3000");
                    System.out.println("1) Seleccionar Lista de Reproduccion");
                    System.out.println("2) Cambiar cancion");
                    System.out.println("3) Escuchar Cancion");
                    int eleccion2= scan.nextInt();
                    if (eleccion2==1){
                        System.out.println("1) Lista de reproduccion 1");
                        System.out.println("2) Lista de reproduccion 2");
                        int nlista=scan.nextInt();
                        crl.SSeleccionarListaReproduccion(nlista);

                    }else if (eleccion2==2){
                        System.out.println("1) Cancion Anterior");
                        System.out.println("2) Siguiente cancion");
                        int puntero=scan.nextInt();
                        crl.CambiarCancion(puntero);
                    }
                    else if (eleccion2==3){
                        crl.VerCanciones();
                        int Ncancion=scan.nextInt();
                        crl.EscucharCancion(Ncancion);

                    }else{
                        invalido();
                    }


                }else{
                    invalido();
                }
        

            }
            if (eleccion==5){
                if (crl.getEstadoRadio()==true){
                    System.out.println("entro");
                }else{
                    invalido();
                }
                

            }
            if (eleccion==6){
                if (crl.getEstadoRadio()==true){
                    System.out.println("entro");
                }else{
                    invalido();
                }
                

            }
            if (eleccion==7){
                if (crl.getEstadoRadio()==true){
                    crl.Apagar();
                }else{
                    invalido();
                }
                
            }

            if (eleccion==8){
                break;
            }
            
  
    }
}
    private void invalido(){
        System.out.println("Opcion invalida, primero debe de encender el radio");
    }



}
