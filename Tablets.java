public class Tablets implements Tomar_fotos, Navegar_internet, Reproducir_videos, Son_portables {

    public boolean tomarfotos;
    public boolean portabilidad;
    public boolean reproducirvideos;
    public boolean navegar;
  
    @Override
    public boolean TomarFotos (int propiedad){ 
      if (propiedad == 0){
        tomarfotos = false;
      } else if (propiedad == 1){
        tomarfotos = true;
      }
      return tomarfotos;
    }
  
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