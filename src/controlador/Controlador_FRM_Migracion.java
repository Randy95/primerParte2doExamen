/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MetodosCitas;
import vista.FRM_Migracion;


public class Controlador_FRM_Migracion implements ActionListener {
    
    MetodosCitas metodosCitas;
    FRM_Migracion frm_Migracion;
    
    public Controlador_FRM_Migracion(FRM_Migracion frm_Migracion) {
        
        metodosCitas= new MetodosCitas();
        this.frm_Migracion=frm_Migracion;
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equalsIgnoreCase("Registrar")) {
            metodosCitas.agregar(frm_Migracion.devolverInformacion());
            frm_Migracion.mostrarLista(metodosCitas.devolverLista()); 
            frm_Migracion.resetearGUI();
        }
        if(e.getActionCommand().equalsIgnoreCase("Atender")) {
            if(metodosCitas.devolverInfoPrimero()!=null) {
                frm_Migracion.mostrarAtencionCliente(metodosCitas.devolverInfoPrimero());
                metodosCitas.eliminarPrimero();
            }
            else {
                frm_Migracion.resetearAtendiendo();
                JOptionPane.showMessageDialog(null,"No existen clientes en espera");
            }
        }
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
          metodosCitas.modificar(frm_Migracion.devolverInformacion());
          frm_Migracion.mostrarLista(metodosCitas.devolverLista());
          frm_Migracion.resetearGUI();
        }
        if(e.getActionCommand().equalsIgnoreCase("Cancelar"))
        {
          metodosCitas.eliminar(frm_Migracion.devolverInformacion());
          frm_Migracion.mostrarLista(metodosCitas.devolverLista());
           frm_Migracion.resetearGUI();
        }
        if(e.getActionCommand().equalsIgnoreCase("<")) {
            metodosCitas.ordenarMenorAMayor();
            frm_Migracion.mostrarLista(metodosCitas.devolverLista());
        }
        if(e.getActionCommand().equalsIgnoreCase("Informacion")) {
            frm_Migracion.mostrarLista(metodosCitas.devolverLista());
        }
        if(e.getActionCommand().equalsIgnoreCase("Promedio")) {
            frm_Migracion.mostrarLista(metodosCitas.devolverPromedio());
        }
        if(e.getActionCommand().equalsIgnoreCase("Buscar")) {
            buscar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Cantidad")) {
            String msj="Cantidad de citas en la cola:\n\n";
            msj+=metodosCitas.devolverCantidadNodos();
            frm_Migracion.mostrarLista(msj);
        }
        if(e.getActionCommand().equalsIgnoreCase(">")) {
            metodosCitas.ordenarMayorAMenor();
            frm_Migracion.mostrarLista(metodosCitas.devolverLista());
        }
        if(e.getActionCommand().equalsIgnoreCase("Normal")) {
            frm_Migracion.definirPrioridad("Normal");
        }
        if(e.getActionCommand().equalsIgnoreCase("7600")) {
            frm_Migracion.definirPrioridad("7600");
        }
    }
    public void buscar()
    {
      if(!metodosCitas.consultar(frm_Migracion.devolverCedula()))
      {
         frm_Migracion.habilitarCampos();
         frm_Migracion.activarRegistrar();
      }
      else
      {
         frm_Migracion.mostrarInformacion(metodosCitas.getArreglo());
         frm_Migracion.activarEdicion();
         frm_Migracion.habilitarCampos();
      }
    }
}
