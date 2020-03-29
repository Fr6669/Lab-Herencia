
package labHeren;

import javax.swing.JOptionPane;

/**
 *
 * @author Frank Rojas
 */
public class Estudiante extends Persona{
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;
    //Inicializar variables
    private Estudiante(String carnet, double promedioNotas, int numeroMaterias) {
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }
    private Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }
    public Estudiante() {
       //Constructor
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public double getPromedioNotas() {
        return promedioNotas;
    }
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    public int getNumeroMaterias() {
        return numeroMaterias;
    }
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    public void calcularPromedio(int notas){
        double not;
        not = notas/getNumeroMaterias();
        setPromedioNotas(not);
    }
    public void leerNotasEstudiante(){
        int x, notas = 0, cont = 1;
        setNumeroMaterias(Integer.parseInt(JOptionPane.showInputDialog("Cuantas materias ve?")));
        for (int i = 0; i < getNumeroMaterias(); i++) {
            x=Integer.parseInt(JOptionPane.showInputDialog("Digite la nota de la materia "+cont));
            cont++;
            notas+=x;   
        }
        calcularPromedio(notas);
    }
    public void ingresarDatosEstudiante(){
        this.nombre=JOptionPane.showInputDialog("Digite el nombre del estudiante");
        this.apellido=JOptionPane.showInputDialog("Digite el apellido del estudiante");
        this.edad=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del estudiante"));
        this.carnet=JOptionPane.showInputDialog("Digite el numero de carnet del estudiante");
        
    }
    public void imprimirDatosEstudiante(){
        String name;
        name=this.nombre + " "+ this.apellido;
        JOptionPane.showMessageDialog(null, name+" Edad "+edad+"\nCarnet "+carnet+"\nMaterias vistas "+getNumeroMaterias()+"\nCon promedio total de "+getPromedioNotas());
    }
}

