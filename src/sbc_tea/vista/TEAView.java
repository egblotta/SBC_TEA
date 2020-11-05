package sbc_tea.vista;

import sbc_tea.modelo.Paciente;

import java.util.logging.Level;
import java.util.logging.Logger;

import jess.JessException;
import sbc_tea.controlador.Motor;

public class TEAView extends javax.swing.JFrame{
    
    Motor motor;

    public void setMotorController(Motor motorController) {
        this.motor = motorController;
    }
    

    public TEAView(){
        initComponents();
        this.setVisible(true);
    }          

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxSocial1 = new javax.swing.JCheckBox();
        jCheckBoxSocial2 = new javax.swing.JCheckBox();
        jCheckBoxSocial3 = new javax.swing.JCheckBox();
        jCheckBoxSocial4 = new javax.swing.JCheckBox();
        jCheckBoxSocial5 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBoxComunicacion1 = new javax.swing.JCheckBox();
        jCheckBoxComunicacion2 = new javax.swing.JCheckBox();
        jCheckBoxComunicacion4 = new javax.swing.JCheckBox();
        jCheckBoxComunicacion3 = new javax.swing.JCheckBox();
        jCheckBoxComunicacion5 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jCheckBoxComportamiento1 = new javax.swing.JCheckBox();
        jCheckBoxComportamiento2 = new javax.swing.JCheckBox();
        jCheckBoxComportamiento4 = new javax.swing.JCheckBox();
        jCheckBoxComportamiento3 = new javax.swing.JCheckBox();
        jCheckBoxComportamiento5 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneDiagnostico = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Diagnóstico de TEA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Edad");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Sexo");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Información General");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Sintomas"));

        jCheckBoxSocial1.setText("Carencia de sociablidad");

        jCheckBoxSocial2.setText("Falta de interes por llamar la atención");

        jCheckBoxSocial3.setText("Deficit en el comportamiento social");

        jCheckBoxSocial4.setText("Falta de empatía");

        jCheckBoxSocial5.setText("Obsesión con ciertos temas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Diferencias Sociales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxSocial2)
                    .addComponent(jCheckBoxSocial5)
                    .addComponent(jCheckBoxSocial4)
                    .addComponent(jCheckBoxSocial3)
                    .addComponent(jCheckBoxSocial1)
                    .addComponent(jLabel3))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxSocial1)
                .addGap(6, 6, 6)
                .addComponent(jCheckBoxSocial2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxSocial3)
                .addGap(3, 3, 3)
                .addComponent(jCheckBoxSocial4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxSocial5)
                .addContainerGap())
        );

        jCheckBoxComunicacion1.setText("Carencia de comunicación verbal");

        jCheckBoxComunicacion2.setText("Alteraciones en la comunicación");

        jCheckBoxComunicacion4.setText("Falta de entendimiento de ironias");

        jCheckBoxComunicacion3.setText("Discapacidad intelectual nula");

        jCheckBoxComunicacion5.setText("Retraso en el desarrollo del lenguaje");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Diferencias de Comunicación");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxComunicacion5)
                    .addComponent(jCheckBoxComunicacion2)
                    .addComponent(jCheckBoxComunicacion3)
                    .addComponent(jCheckBoxComunicacion1)
                    .addComponent(jCheckBoxComunicacion4)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addComponent(jCheckBoxComunicacion1)
                .addGap(6, 6, 6)
                .addComponent(jCheckBoxComunicacion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxComunicacion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxComunicacion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxComunicacion5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBoxComportamiento1.setText("Caracter regresivo");
        jCheckBoxComportamiento1.setActionCommand("");

        jCheckBoxComportamiento2.setText("Alteraciones en la motricidad y cognición");
        jCheckBoxComportamiento2.setToolTipText("");
        jCheckBoxComportamiento2.setActionCommand("");

        jCheckBoxComportamiento4.setText("Poca coordinación psicomotriz");

        jCheckBoxComportamiento3.setText("Reducción del tono muscular");
        jCheckBoxComportamiento3.setToolTipText("");
        jCheckBoxComportamiento3.setActionCommand("");

        jCheckBoxComportamiento5.setText("Conocimiento del problema por parte del niño");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Diferencias de Comportamiento");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxComportamiento4)
                    .addComponent(jCheckBoxComportamiento3)
                    .addComponent(jCheckBoxComportamiento2)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBoxComportamiento1)
                    .addComponent(jCheckBoxComportamiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxComportamiento1)
                .addGap(5, 5, 5)
                .addComponent(jCheckBoxComportamiento2)
                .addGap(3, 3, 3)
                .addComponent(jCheckBoxComportamiento3)
                .addGap(3, 3, 3)
                .addComponent(jCheckBoxComportamiento4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxComportamiento5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPaneDiagnostico);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
       
    }//GEN-LAST:event_formComponentRemoved

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        Paciente paciente = new Paciente();                                    
        
        String sexo = String.valueOf(cbSexo.getSelectedItem().toString());
        
        if(!txtEdad.getText().isEmpty()){
            int edad = Integer.valueOf(txtEdad.getText());
        paciente.setEdad(edad);        
        paciente.setSexo(sexo);        
        
        if(jCheckBoxComunicacion1.isSelected())
            paciente.setDifcomu1("true");
        if(jCheckBoxComunicacion2.isSelected())
            paciente.setDifcomu2("true");
        if(jCheckBoxComunicacion3.isSelected())
            paciente.setDifcomu3("true");
        if(jCheckBoxComunicacion4.isSelected())
            paciente.setDifcomu4("true");
        if(jCheckBoxComunicacion5.isSelected())
            paciente.setDifcomu5("true");
        if(jCheckBoxSocial1.isSelected())
            paciente.setDifsoc1("true");
        if(jCheckBoxSocial1.isSelected())
            paciente.setDifsoc2("true");
        if(jCheckBoxSocial1.isSelected())
            paciente.setDifsoc3("true");
        if(jCheckBoxSocial1.isSelected())
            paciente.setDifsoc4("true");
        if(jCheckBoxSocial1.isSelected())
            paciente.setDifsoc5("true");
        if(jCheckBoxComportamiento1.isSelected())
            paciente.setDifcomp1("true");
        if(jCheckBoxComportamiento2.isSelected())
            paciente.setDifcomp1("true");
        if(jCheckBoxComportamiento3.isSelected())
            paciente.setDifcomp1("true");
        if(jCheckBoxComportamiento4.isSelected())
            paciente.setDifcomp1("true");
        if(jCheckBoxComportamiento5.isSelected())
            paciente.setDifcomp1("true");
        
            try {
             motor.setInformacion(paciente);
             //jTextPaneDiagnostico.setText(null);
             motor.ejecutar();
                                
            } catch (JessException ex) {
                Logger.getLogger(TEAView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
            System.out.println("El campo edad es requerido");
                   
    }//GEN-LAST:event_jButtonConsultarActionPerformed
    
    public void mostrarRespuesta(String res){        
       jTextPaneDiagnostico.setText(res);
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JButton jButtonConsultar;
    public javax.swing.JCheckBox jCheckBoxComportamiento1;
    public javax.swing.JCheckBox jCheckBoxComportamiento2;
    public javax.swing.JCheckBox jCheckBoxComportamiento3;
    public javax.swing.JCheckBox jCheckBoxComportamiento4;
    public javax.swing.JCheckBox jCheckBoxComportamiento5;
    public javax.swing.JCheckBox jCheckBoxComunicacion1;
    public javax.swing.JCheckBox jCheckBoxComunicacion2;
    public javax.swing.JCheckBox jCheckBoxComunicacion3;
    public javax.swing.JCheckBox jCheckBoxComunicacion4;
    public javax.swing.JCheckBox jCheckBoxComunicacion5;
    public javax.swing.JCheckBox jCheckBoxSocial1;
    public javax.swing.JCheckBox jCheckBoxSocial2;
    public javax.swing.JCheckBox jCheckBoxSocial3;
    public javax.swing.JCheckBox jCheckBoxSocial4;
    public javax.swing.JCheckBox jCheckBoxSocial5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPaneDiagnostico;
    public javax.swing.JTextField txtEdad;
    // End of variables declaration//GEN-END:variables

   

   
}
