package sbc_tea.controlador;

import sbc_tea.vista.TEAView;

/**
 *
 * @author Emiliano
 */
public class TEAController {
    
    public static void main(String[] args) {
        // TODO code application logic here
        TEAView teaView = new TEAView();
        Motor motorController = new Motor();        
        EventHandler eventController = new EventHandler(teaView);
        
        teaView.setMotorController(motorController);
        
        motorController.addEscuchador(eventController);
        motorController.ejecutar();
    }
    
}
