
package paciente;


public class Principal {

    
    public static void main(String[] args) {
      ////// a traves de un constructor vacio 
      ///crear u objeto
    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-20s%-10s%-10s%-10s%-10s\n", "DNI" ,"NOMBRE", "PATERNO", "MATERNO", "TELEFONO", "CORREO", "DIRECCION", "EDAD", "ESTATURA", "ESCASADO", "SEXO");
     System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-20s%-10s%-10s%-10s%-10s\n", "---" ,"-----", "-------", "-------", "--------", "------", "---------", "----", "--------", "--------", "----");  
      Paciente luis = new Paciente();
      ////set para agregar datos
      luis.setDni("1111111");
      luis.setNombre("luis");
      luis.setPaterno("Ruiz");
      luis.setMaterno("Roncal");
      luis.setTelefono("654969909");
      luis.setCorreo("pppp@hotmail.com");
      luis.setDireccion("madrid");
      luis.setEstatura(1.62);
      luis.setEdad(22);
      luis.setEsCasado(true);
      luis.setSexo('H');
           
    /*  System.out.println(luis); esta es otra opcion de impresion */
          
    //luis.mostrar();  
    /*System.out.println();  */
   
      
        Paciente carla = new Paciente("22222222",
                                     "carla",
                                     "Lescano",
                                     "Azevedo",
                                     "647711405",
                                     "aaaaaa@hotmail.com",
                                     "madrid",
                                     24,                       
                                     1.75,
                                     true,
                                     'H');
        
        //carla.mostrar();
 
        Paciente maria = new Paciente("33333333","maria","vazquez","ledezma");
        maria.setEdad(17);
        maria.setEstatura(1.76);
        //maria.mostrar();
    
        //luis.mostrarMayoresEdad();
        //maria.mostrarMayoresEdad();
       // carla.mostrarMayoresEdad();
       
       
        luis.mostrarEstatura();
        maria.mostrarEstatura();
        carla.mostrarEstatura();
        
    }
    
}
