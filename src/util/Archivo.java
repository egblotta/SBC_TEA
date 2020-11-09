package util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import sbc_tea.modelo.Diagnostico;

public class Archivo {
    static PrintWriter writer;    
    
    public void CrearArchivo(Diagnostico diagnostico) throws FileNotFoundException, UnsupportedEncodingException{
       
        writer = new PrintWriter("D:\\NetbeansProjects\\SBC_TEA\\src\\diagnosticos\\"+diagnostico.getNombre()+".txt", "UTF-8");
        writer.println("Diagnostico n° "+ diagnostico.getNumero());
        writer.println("Fecha: "+ diagnostico.getFecha());
        writer.println("Nombre del Paciente: "+ diagnostico.getNombre());
        writer.println("Edad: "+ diagnostico.getEdad());
        writer.println("Resultado: "+ diagnostico.getResultado());
        writer.close();
        
    }
}
