/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_Migracion;
import javax.swing.ButtonGroup;


public class FRM_Migracion extends javax.swing.JFrame {

    Controlador_FRM_Migracion controlador;
    ButtonGroup botonesServicio= new ButtonGroup();
    ButtonGroup botonesPrioridad= new ButtonGroup();
    private String prioridad;
    
    public FRM_Migracion() {
        super("Departamento Migración");
        initComponents();
        setLocationRelativeTo(this);
        controlador= new Controlador_FRM_Migracion(this);
        this.jta_Lista.setEditable(false);
        this.jta_Atendiendo.setEditable(false);
        agregarRadioBotones();
        agregarEventos();
    }
    
    public void agregarEventos() {
        this.btn_Registrar.addActionListener(controlador);
        this.btn_Atender.addActionListener(controlador);
        this.btn_Cola.addActionListener(controlador);
        this.btn_Cantidad.addActionListener(controlador);
        this.btn_Cancelar.addActionListener(controlador);
        this.btn_Promedio.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Busqueda.addActionListener(controlador);
        this.btn_Menor_Mayor.addActionListener(controlador);
        this.btn_Mayor_Menor.addActionListener(controlador);
        this.jrb_Normal.addActionListener(controlador);
        this.jrb_7600.addActionListener(controlador);
    }
    public void agregarRadioBotones() {
        botonesPrioridad.add(jrb_Normal);
        botonesPrioridad.add(jrb_7600);
    }
    public void resetearGUI() {
        desactivarRegistrar();
        deshabilitarCampos();
    }
    public void resetearAtendiendo() {
        this.jta_Atendiendo.setText("");
    }
    public void definirPrioridad(String prioridad) {
        this.prioridad=prioridad;
    }
    public String[] devolverInformacion() {
        
        String arreglo[]= new String[5];
        
        arreglo[0]=this.jt_Cedula.getText();
        arreglo[1]=this.jt_Nombre.getText().trim();
        arreglo[2]=this.jt_Edad.getText().trim();
        arreglo[3]=this.prioridad;
        arreglo[4]=this.jt_Fecha.getText().trim();
        
        return arreglo;
    }
    public void mostrarInformacion(String[] arreglo)
    {
      this.jt_Edad.setText(arreglo[1]);
      this.jt_Nombre.setText(arreglo[0]);
      this.jt_Fecha.setText(arreglo[3]);
      if(this.jrb_7600.getActionCommand().equalsIgnoreCase(arreglo[2]))
      {
        this.jrb_7600.setSelected(true);
      }
      else
      {
        this.jrb_Normal.setSelected(true);
      }
    }
    public String devolverCedula()
    {
      return jt_Cedula.getText();
    }
    public void mostrarLista(String lista) {
        activarReportes();
        this.jta_Lista.setText("");
        this.jta_Lista.setText(lista);
    }
    public void mostrarAtencionCliente(String atendiendo) {
        
        this.jta_Atendiendo.setText("");
        this.jta_Atendiendo.setText(atendiendo);
    }
    public void habilitarCampos()
    {
      this.jt_Cedula.setEnabled(false);
      this.jt_Edad.setEnabled(true);
      this.jt_Nombre.setEnabled(true);
      this.jt_Fecha.setEnabled(true);
      this.jrb_7600.setEnabled(true);
      this.jrb_Normal.setEnabled(true);
    }
    public void activarReportes()
    {
      this.btn_Cantidad.setEnabled(true);
      this.btn_Cola.setEnabled(true);
      this.btn_Promedio.setEnabled(true);
      this.btn_Mayor_Menor.setEnabled(true);
      this.btn_Menor_Mayor.setEnabled(true);
    }
    public void desactivarReportes()
    {
      this.btn_Cantidad.setEnabled(false);
      this.btn_Cola.setEnabled(false);
      this.btn_Promedio.setEnabled(false);
      this.btn_Mayor_Menor.setEnabled(false);
      this.btn_Menor_Mayor.setEnabled(false);
    }
    public void deshabilitarCampos()
    {
      this.jt_Cedula.setEnabled(true);
      this.jt_Edad.setEnabled(false);
      this.jt_Nombre.setEnabled(false);
      this.jt_Fecha.setEnabled(false);
      this.jrb_7600.setEnabled(false);
      this.jrb_Normal.setEnabled(false);
      this.jt_Nombre.setText("");
      this.jt_Edad.setText("");
      this.jt_Fecha.setText("");
      this.jt_Cedula.setText("");
    }
    public void activarEdicion()
    {
      this.btn_Modificar.setEnabled(true);
      this.btn_Cancelar.setEnabled(true);
    }
    public void desactivarEdicion()
    {
      this.btn_Modificar.setEnabled(false);
      this.btn_Cancelar.setEnabled(false);
    }
    public void activarRegistrar()
    {
      this.btn_Registrar.setEnabled(true);
    }
    public void desactivarRegistrar()
    {
      this.btn_Registrar.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j_Separador = new javax.swing.JSeparator();
        j_Separador2 = new javax.swing.JSeparator();
        jl_MantenimientoCitas = new javax.swing.JLabel();
        jl_Cedula = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Edad = new javax.swing.JLabel();
        jl_Prioridad = new javax.swing.JLabel();
        jt_Edad = new javax.swing.JTextField();
        jt_Cedula = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jrb_Normal = new javax.swing.JRadioButton();
        jrb_7600 = new javax.swing.JRadioButton();
        jl_Atencion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_Atendiendo = new javax.swing.JTextArea();
        btn_Registrar = new javax.swing.JButton();
        btn_Atender = new javax.swing.JButton();
        btn_Menor_Mayor = new javax.swing.JButton();
        btn_Mayor_Menor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_Lista = new javax.swing.JTextArea();
        jl_Fecha = new javax.swing.JLabel();
        jt_Fecha = new javax.swing.JTextField();
        btn_Modificar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jl_Orden = new javax.swing.JLabel();
        btn_Cola = new javax.swing.JButton();
        btn_Promedio = new javax.swing.JButton();
        btn_Cantidad = new javax.swing.JButton();
        btn_Busqueda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        j_Separador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jl_MantenimientoCitas.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jl_MantenimientoCitas.setText("Mantenimiento de Citas");

        jl_Cedula.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jl_Cedula.setText("Cedula:");

        jl_Nombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jl_Nombre.setText("Nombre Completo:");

        jl_Edad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jl_Edad.setText("Edad:");

        jl_Prioridad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jl_Prioridad.setText("Prioridad:");

        jt_Edad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jt_Edad.setEnabled(false);

        jt_Cedula.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jt_Nombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jt_Nombre.setEnabled(false);

        jrb_Normal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jrb_Normal.setText("Normal");
        jrb_Normal.setEnabled(false);

        jrb_7600.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jrb_7600.setText("7600");
        jrb_7600.setEnabled(false);

        jl_Atencion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jl_Atencion.setText("Cita Actual");

        jta_Atendiendo.setColumns(20);
        jta_Atendiendo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jta_Atendiendo.setRows(5);
        jScrollPane1.setViewportView(jta_Atendiendo);

        btn_Registrar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Registrar.setText("Registrar");
        btn_Registrar.setEnabled(false);

        btn_Atender.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Atender.setText("Atender");

        btn_Menor_Mayor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Menor_Mayor.setText("<");

        btn_Mayor_Menor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Mayor_Menor.setText(">");

        jta_Lista.setColumns(20);
        jta_Lista.setRows(5);
        jScrollPane2.setViewportView(jta_Lista);

        jl_Fecha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jl_Fecha.setText("Fecha:");

        jt_Fecha.setEnabled(false);

        btn_Modificar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Modificar.setText("Modificar");
        btn_Modificar.setEnabled(false);

        btn_Cancelar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Cancelar.setText("Cancelar Cita");
        btn_Cancelar.setActionCommand("Cancelar");
        btn_Cancelar.setEnabled(false);

        jl_Orden.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jl_Orden.setText("Ordenar:");

        btn_Cola.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Cola.setText("Información");
        btn_Cola.setActionCommand("Informacion");

        btn_Promedio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Promedio.setText("Promedio de Edad");
        btn_Promedio.setActionCommand("Promedio");

        btn_Cantidad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Cantidad.setText("Cantidad Citas");
        btn_Cantidad.setActionCommand("Cantidad");

        btn_Busqueda.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_Busqueda.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Fecha)
                                .addGap(26, 26, 26)
                                .addComponent(jt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Prioridad)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrb_7600)
                                    .addComponent(jrb_Normal)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jl_Cedula)
                                        .addGap(18, 18, 18)
                                        .addComponent(jt_Cedula))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl_Nombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jl_Edad)
                                        .addGap(32, 32, 32)
                                        .addComponent(jt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Busqueda))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jl_MantenimientoCitas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btn_Registrar)
                        .addGap(26, 26, 26)
                        .addComponent(btn_Modificar)
                        .addGap(29, 29, 29)
                        .addComponent(btn_Cancelar)))
                .addGap(43, 43, 43)
                .addComponent(j_Separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(j_Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jl_Atencion)
                                    .addGap(170, 170, 170))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btn_Atender)
                                    .addGap(180, 180, 180)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jl_Orden)
                                .addGap(29, 29, 29)
                                .addComponent(btn_Menor_Mayor)
                                .addGap(32, 32, 32)
                                .addComponent(btn_Mayor_Menor))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_Cola)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Promedio)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Cantidad)))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j_Separador)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jl_MantenimientoCitas)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Cedula)
                    .addComponent(btn_Busqueda))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Edad)
                    .addComponent(jt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Prioridad)
                    .addComponent(jrb_Normal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_7600)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_Fecha)
                    .addComponent(jt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Registrar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Cancelar))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jl_Atencion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Atender)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(j_Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Cola)
                            .addComponent(btn_Promedio)
                            .addComponent(btn_Cantidad))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Orden)
                            .addComponent(btn_Menor_Mayor)
                            .addComponent(btn_Mayor_Menor))
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Migracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Migracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atender;
    private javax.swing.JButton btn_Busqueda;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Cantidad;
    private javax.swing.JButton btn_Cola;
    private javax.swing.JButton btn_Mayor_Menor;
    private javax.swing.JButton btn_Menor_Mayor;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Promedio;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator j_Separador;
    private javax.swing.JSeparator j_Separador2;
    private javax.swing.JLabel jl_Atencion;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Edad;
    private javax.swing.JLabel jl_Fecha;
    private javax.swing.JLabel jl_MantenimientoCitas;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Orden;
    private javax.swing.JLabel jl_Prioridad;
    private javax.swing.JRadioButton jrb_7600;
    private javax.swing.JRadioButton jrb_Normal;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Edad;
    private javax.swing.JTextField jt_Fecha;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextArea jta_Atendiendo;
    private javax.swing.JTextArea jta_Lista;
    // End of variables declaration//GEN-END:variables
}
