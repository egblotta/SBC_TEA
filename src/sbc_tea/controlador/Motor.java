package sbc_tea.controlador;

import sbc_tea.vista.TEAView;

import java.util.logging.Level;
import java.util.logging.Logger;
import jess.JessEvent;

import jess.JessException;
import jess.Rete;
import sbc_tea.modelo.Paciente;

public class Motor {
    
    Rete motor;
    TEAView main;
       
    public static String res;         

    public Motor(){
        
        try{     
            motor = new Rete();
            motor.reset();                               
            motor.batch("clips/TEA.CLP");         //Cargo el archivo clp 
            }
        catch(JessException e){
            Logger.getLogger(Motor.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void setInformacion(Paciente paciente) throws JessException{
         try{
             motor.reset();
             motor.add(paciente);
             motor.run();
            //System.out.println("assert "+ paciente);
        }catch(JessException e){             
            Logger.getLogger(Motor.class.getName()).log(Level.SEVERE, null, e);
            }
    }
    
    public void addEscuchador(EventHandler eventController){
        motor.addJessListener(eventController);
        motor.setEventMask(JessEvent.DEFRULE_FIRED);
    }

    public void ejecutar(){        
        try {
             this.motor.run();             
        } catch (JessException e) {
            Logger.getLogger(Motor.class.getName()).log(Level.SEVERE, null, e);
        }          
    }
    
}
