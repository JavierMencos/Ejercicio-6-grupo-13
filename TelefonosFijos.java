public class Telefonosfijos implements Hacer_llamadas {
    public boolean llamada;
    @Override
    public boolean Hacerllamadas(int propiedad){ 
      if (propiedad == 0){
        llamada = false;
      } else if (propiedad == 1){
        llamada = true;
      }
      return llamada;
    }   
  }