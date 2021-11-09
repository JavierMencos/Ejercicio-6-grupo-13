public class CamaraFotografica implements Tomar_fotos {
    public boolean tomarfotos;
    @Override
    public boolean TomarFotos(int propiedad){ 
      if (propiedad == 0){
        tomarfotos = false;
      } else if (propiedad == 1){
        tomarfotos = true;
      }
      return tomarfotos;
    }   
  }