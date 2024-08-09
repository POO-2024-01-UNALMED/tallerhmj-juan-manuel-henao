package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
	}
	
	public String toString() {
		return "El futbolista" + this.getNombre() + "tiene" + this.getEdad() + ", y juega de" + this.getPosicion() + "con el dorsal"+ dorsal+ ". Le han marcado"+golesRecibidos;
	}
	

	public boolean jugarConLasManos(Futbolista f) {
		if(f.getClass().getName()=="Portero") {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Futbolista f) {
		
            Portero p = (Portero) this;
            Portero a = (Portero) f;
            int diferencia=p.golesRecibidos-a.golesRecibidos;
    		if (diferencia<0) {
    			diferencia= -(diferencia);
    		}
    	
    		
        
		return diferencia;
        
	}
	
	
}

