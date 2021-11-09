public class ComputadoraLaptop implements Navegar_internet, Reproducir_videos, Ejecutar_videojuego{
    // Atributos 
    public boolean navegar = false;
    public boolean reproducirvideos = false;
    public boolean ejecutarvideojuego = false;
    public boolean portabilidad = false;
  
  
      // Interfaz 1
    public boolean Navegarinternet (int propiedad){
      if (propiedad == 0){
        navegar = false;
      } else if (propiedad == 1){
        navegar = true;
      }
      return navegar;
    }   
  
      // Interfaz 2 
    public boolean ReproducirVideos (int propiedad){ 
      if (propiedad == 0){
        reproducirvideos = false;
      } else if (propiedad == 1){
        reproducirvideos = true;
      }
      return reproducirvideos;
    }   
  
     // Interfaz 3
  
    public boolean EjecutarVideojuego (int propiedad){ 
      if (propiedad == 0){
        ejecutarvideojuego = false;
      } else if (propiedad == 1){
        ejecutarvideojuego = true;
      }
      return ejecutarvideojuego;
    }   
  
    // Interfaz 4 
    public boolean Portabilidad (int decision){ 
      if (decision == 0){
        portabilidad = false;
      } else if (decision == 1){
        portabilidad = true;
      }
      return portabilidad;
    } 
  
  }