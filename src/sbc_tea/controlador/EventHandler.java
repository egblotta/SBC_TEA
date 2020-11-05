package sbc_tea.controlador;

import util.Helper;
import jess.*;
import sbc_tea.vista.TEAView;


public class EventHandler implements JessListener{

    TEAView vista;
    
    public EventHandler(TEAView vista){
        this.vista = vista;
    }

    @Override
    public void eventHappened(JessEvent je){
        
        int type = je.getType();
        Rete rete = (Rete)je.getSource();
        Helper helper = new Helper(rete);

        if(type == JessEvent.DEFRULE_FIRED){
           Fact respuesta = helper.findFactByTempleteName("MAIN::respuesta");
           
            if (respuesta != null){                           
                try {
                    String res = respuesta.get(0).toString();                    
                    System.out.println("Respuesta: "+ res);
                    vista.mostrarRespuesta(res);
                } catch (JessException e) {
                    System.out.println("Error: "+ e);
                }
            }
            else
                vista.mostrarRespuesta("Respuesta no encontrada ");
        }        
    }    
}
