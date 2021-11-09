public class TelefonosCelulares implements Hacer_llamadas, Son_portables {
    public boolean llamada;
    public boolean portabilidad;
    @Override
    public boolean Hacerllamadas(int propiedad){ 
      if (propiedad == 0){
        llamada = false;
      } else if (propiedad == 1){
        llamada = true;
      }
      return llamada;
    }   
    
    @Override
    public boolean Portabilidad(int decision){ 
      if (decision == 0){
        portabilidad = false;
      } else if (decision == 1){
        portabilidad = true;
      }
      return portabilidad;
    } 
  }  