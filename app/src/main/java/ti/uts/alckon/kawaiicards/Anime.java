package ti.uts.alckon.kawaiicards;

/**
 * Created by alckon on 8/06/15.
 */
public class Anime {

    private int imagen;
    private String nombre;
    private int visitas;

    public Anime(int imagen, String nombre, int visitas)
    {
        this.imagen = imagen;
        this.nombre = nombre;
        this.visitas = visitas;
    }

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVisitas() {
        return visitas;
    }
}
