/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class MetodosCitas {
    
    NodoCita primero;
    String[] arregloInformacionConsultada;
    public MetodosCitas() {
        
        primero=null;
        arregloInformacionConsultada=new String[4];
    }
    public String devolverLista() {
        
        NodoCita auxiliar=primero;
        String valores="Lista:\n\n";
        
        while(auxiliar!=null) {
            
            valores+=primero.getCedula()+"\n"+primero.getNombre()+"\n"+primero.getEdad()+"\n"+
                        primero.getPrioridad()+"\n"+primero.getFecha()+"\n\n";
            
            auxiliar=auxiliar.getSiguiente();
        }
        
        return valores;
    }
    public String devolverPromedio() {
        
        NodoCita auxiliar=primero;
        String valores="Promedio de edad:\n\n";
        int suma=0, promedio;
        
        while(auxiliar!=null) { 
            suma+=Integer.parseInt(auxiliar.getEdad());
            auxiliar=auxiliar.getSiguiente();
        }
        
        promedio=suma/devolverCantidadNodos();
        valores+=promedio+"";
        return valores;
    }
    public boolean consultar(String cedula) {
        
        NodoCita aux=primero;
        boolean existe=false;
        
        while(aux!=null)
        {
            if(aux.getCedula().equals(cedula))
            {
                arregloInformacionConsultada[0]=aux.getNombre();
                arregloInformacionConsultada[1]=aux.getEdad();
                arregloInformacionConsultada[2]=aux.getPrioridad();
                arregloInformacionConsultada[3]=aux.getFecha();
                existe=true;
            }
            aux=aux.getSiguiente();
        }
      return existe;
    }
    public String[] getArreglo()
    {
      return arregloInformacionConsultada;
    }
    public String devolverInfoPrimero() {
        
        if(primero!=null) {
            String atendiendo="Atendiendo a:\n\n";
        
            atendiendo+=primero.getCedula()+"\n"+primero.getNombre()+"\n"+primero.getEdad()+"\n"+
                        primero.getPrioridad()+"\n"+primero.getFecha()+"\n\n";
        
            return atendiendo;
        }
        else {
            return null;
        }
    }
    public void agregar(String arreglo[]) {
        
        NodoCita auxiliar;
        
        if(arreglo[3].equalsIgnoreCase("7600")) {
            auxiliar= new NodoCita(arreglo[0],arreglo[1],arreglo[2],arreglo[3],arreglo[4]);
            auxiliar.setSiguiente(primero);
            primero=auxiliar;
        }
        else {
            if(primero!=null) {
                auxiliar= devolverUltimo();
                auxiliar.setSiguiente(new NodoCita(arreglo[0],arreglo[1],arreglo[2],arreglo[3],arreglo[4]));
            }
            else {
                auxiliar= new NodoCita(arreglo[0],arreglo[1],arreglo[2],arreglo[3],arreglo[4]);
                auxiliar.setSiguiente(primero);
                primero=auxiliar;
            }
        }
    }
    public NodoCita devolverUltimo() {
        
        NodoCita auxiliar=primero;
        while(auxiliar.getSiguiente()!=null) {
            auxiliar=auxiliar.getSiguiente();
        }
        return auxiliar;
    }
    public void eliminarPrimero() {
        if(primero!=null)
            primero=primero.getSiguiente();
    }
    public void eliminar(String[] arreglo) {

        NodoCita aux,anterior;
        boolean encontrado;

        aux=primero;
        anterior=null;
        encontrado=false;

        while((aux != null) && (!encontrado)){

           encontrado = (aux.getCedula().equals(arreglo[0]));
           if(!encontrado)
           {
             anterior = aux;
             aux= aux.getSiguiente();
           }
        }
        
        if(aux != null)
        {
           if(aux == primero)
           {
             primero = aux.getSiguiente();
           }
           else
           {
             anterior.setSiguiente(aux.getSiguiente());
           }
           aux = null;
        }
    }
    public void modificar(String[] arreglo)
    {
      NodoCita aux=primero;
      
      while(aux!=null)
      {
        if(aux.getCedula().equals(arreglo[0]))
        {
            aux.setNombre(arreglo[1]);
            aux.setEdad(arreglo[2]);
            aux.setPrioridad(arreglo[3]);
            aux.setFecha(arreglo[4]);
        }
        aux=aux.getSiguiente();
      }
    
    }
    public void ordenarMenorAMayor() {
        
        int cantidadNodos=devolverCantidadNodos();
        String fechaTemporal,nombreTemporal,edadTemporal,cedulaTemporal,prioridadTemporal;
        NodoCita auxiliar;
        
        for(int contador=0;contador<cantidadNodos;contador++) {
            
            auxiliar=primero;
            while(auxiliar.getSiguiente()!=null) {
                
                if(Integer.parseInt(auxiliar.getEdad())>Integer.parseInt(auxiliar.getSiguiente().getEdad())) {
                    
                    fechaTemporal=auxiliar.getFecha();
                    nombreTemporal=auxiliar.getNombre();
                    edadTemporal=auxiliar.getEdad();
                    cedulaTemporal=auxiliar.getCedula();
                    prioridadTemporal=auxiliar.getPrioridad();
                    
                    auxiliar.setFecha(auxiliar.getSiguiente().getFecha());
                    auxiliar.setNombre(auxiliar.getSiguiente().getNombre());
                    auxiliar.setEdad(auxiliar.getSiguiente().getEdad());
                    auxiliar.setCedula(auxiliar.getSiguiente().getCedula());
                    auxiliar.setPrioridad(auxiliar.getSiguiente().getPrioridad());
                    
                    auxiliar.getSiguiente().setFecha(fechaTemporal);
                    auxiliar.getSiguiente().setNombre(nombreTemporal);
                    auxiliar.getSiguiente().setEdad(edadTemporal);
                    auxiliar.getSiguiente().setCedula(cedulaTemporal);
                    auxiliar.getSiguiente().setPrioridad(prioridadTemporal);
                }
                auxiliar=auxiliar.getSiguiente();
            }
        }
    }
    public void ordenarMayorAMenor() {
        
        int cantidadNodos=devolverCantidadNodos();
        String fechaTemporal,nombreTemporal,edadTemporal,cedulaTemporal,prioridadTemporal;
        NodoCita auxiliar;
        
        for(int contador=0;contador<cantidadNodos;contador++) {
            
            auxiliar=primero;
            while(auxiliar.getSiguiente()!=null) {
                
                if(Integer.parseInt(auxiliar.getEdad())<Integer.parseInt(auxiliar.getSiguiente().getEdad())) {
                    
                    fechaTemporal=auxiliar.getFecha();
                    nombreTemporal=auxiliar.getNombre();
                    edadTemporal=auxiliar.getEdad();
                    cedulaTemporal=auxiliar.getCedula();
                    prioridadTemporal=auxiliar.getPrioridad();
                    
                    auxiliar.setFecha(auxiliar.getSiguiente().getFecha());
                    auxiliar.setNombre(auxiliar.getSiguiente().getNombre());
                    auxiliar.setEdad(auxiliar.getSiguiente().getEdad());
                    auxiliar.setCedula(auxiliar.getSiguiente().getCedula());
                    auxiliar.setPrioridad(auxiliar.getSiguiente().getPrioridad());
                    
                    auxiliar.getSiguiente().setFecha(fechaTemporal);
                    auxiliar.getSiguiente().setNombre(nombreTemporal);
                    auxiliar.getSiguiente().setEdad(edadTemporal);
                    auxiliar.getSiguiente().setCedula(cedulaTemporal);
                    auxiliar.getSiguiente().setPrioridad(prioridadTemporal);
                }
                auxiliar=auxiliar.getSiguiente();
            }
        }
    }
    public int devolverCantidadNodos() {
        
        int contador=1;
        NodoCita auxiliar=primero;
        while(auxiliar.getSiguiente()!=null)
        {
            contador++;
            auxiliar=auxiliar.getSiguiente();
        }
        
        return contador;
    }
}
