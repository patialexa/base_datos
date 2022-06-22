
package paciente;

// variables de instancia 

public class Paciente {
    String dni;
    String nombre;
    String paterno;
    String materno;
    String telefono ;
    String correo;
    String direccion;
    int edad;
    double estatura;
    boolean esCasado;
    char sexo;
    
//Constructores con todos los atributos

    public Paciente(String dni, String nombre, String paterno, String materno, String telefono, String correo, String direccion, int edad, double estatura, boolean esCasado, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.edad = edad;
        this.estatura = estatura;
        this.esCasado = esCasado;
        this.sexo = sexo;
    }
    
//Constructores vacio  

    public Paciente() {
    }
    
//Constructores dni , nombre , paterno y materno  

    public Paciente(String dni, String nombre, String paterno, String materno) {
        this.dni = dni;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }
       
/// Metodos (get y set)

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean getEsCasado() {
        return esCasado;
    }

    public void setEsCasado(boolean esCasado) {
        this.esCasado = esCasado;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


// metodo tostring 
 @Override
    public String toString() {
        return "Paciente{" + "dni=" + dni + ", nombre=" + nombre + ", paterno=" + paterno + "\n,  materno=" + materno + ", telefono=" + telefono + ", correo=" + correo + "\n, direccion=" + direccion + ", edad=" + edad + ", estatura=" + estatura + ", esCasado=" + esCasado + ", sexo=" + sexo + '}';
   
}

    public void mostrar() {
        /*System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-20s%-10s%-10s%-10s%-10s\n", "DNI" ,"NOMBRE", "PATERNO", "MATERNO", "TELEFONO", "CORREO", "DIRECCION", "EDAD", "ESTATURA", "ESCASADO", "SEXO");*/
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-20s%-10d%-10f%-10s%-10s\n",this.dni,this.nombre,this.paterno,this.materno,this.telefono,this.correo,this.direccion,this.edad,this.estatura,this.esCasado,this.sexo);

    }        
  ////implementar un metodo para mostrar solo los pacientes mayores de edad///
    /*public void mostrarMayoresEdad() {
    if(this.edad >= 18){
    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-20s%-10d%-10f%-10s%-10s\n",this.dni,this.nombre,this.paterno,this.materno,this.telefono,this.correo,this.direccion,this.edad,this.estatura,this.esCasado,this.sexo);   
    
   
    
}
    }
    */
/// implementar un metodo para mostrar pacientes que tengan estatura mayor a 1.73
    public void mostrarEstatura() {
    if(this.estatura > 1.73){
    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-20s%-10d%-10f%-10s%-10s\n",this.dni,this.nombre,this.paterno,this.materno,this.telefono,this.correo,this.direccion,this.edad,this.estatura,this.esCasado,this.sexo);   
    
    }
}



    
    






