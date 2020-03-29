//CLASE SISTEMA INFORMACION 

package labHeren;
import javax.swing.JOptionPane;
/**
* Clase Java para implementar un cliente
* que emplea la jerarquía de herencia de la persona,
* el empleado y el estudiante para mostrar los cálculos
* de cada uno de los respectivos procesos implementados
* por cada clase
*/
public class SistemaInformacion{
//Constructor de la clase
    public SistemaInformacion() {
// TODO Auto-generated constructor stub
    }
/**
* @param args
*/
public static void main(String[] args){
    // TODO Auto-generated method stub
    int opcion = 0;
    Persona sistemaInformacion = new Persona();
    Estudiante est= new Estudiante();
    try{
    //Usamos la herencia de la superclase para acceder a los
    //métodos de lectura de datos
        do{
            opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos del empleado,  3 para procesar la informacion del estudiante y 5 para salir ");
            if (opcion==1){
                JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
                Empleado manejadorEmpleado = new Empleado();
                //Leemos los datos
                manejadorEmpleado =manejadorEmpleado.ingresarDatosEmpleado();
                //Mostramos el reporte de datos
                manejadorEmpleado.imprimirReporteEstadoEmpleado();
            }else if (opcion == 3){
                est.ingresarDatosEstudiante();
                est.leerNotasEstudiante();
                est.imprimirDatosEstudiante();               
            }else if(opcion==5){
                JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
                break;
            }else{
                JOptionPane.showMessageDialog(null,"Opción inválida");
            }
        }while (opcion <= 1 || opcion<=3 || opcion >= 5);//fin del do-while
    }//Fin del try
    catch (Exception errorMain){
        JOptionPane.showMessageDialog(null,"Error en la digitación: ");
        errorMain.printStackTrace();
    } 
}
}