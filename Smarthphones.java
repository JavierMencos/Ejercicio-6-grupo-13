public class Smarthphones implements Hacer_llamadas, Son_portables, Reproducir_videos, Navegar_internet{
    public boolean llamada;
    public boolean portabilidad;
    public boolean reproducirvideos;
    public boolean navegar;
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
  
    @Override
    public boolean ReproducirVideos(int propiedad){ 
      if (propiedad == 0){
        reproducirvideos = false;
      } else if (propiedad == 1){
        reproducirvideos = true;
      }
      return reproducirvideos;
    }
  
    @Override
    public boolean Navegarinternet (int propiedad){ 
      if (propiedad == 0){
        navegar = false;
      } else if (propiedad == 1){
        navegar = true;
      }
      return navegar;
    }
  }  