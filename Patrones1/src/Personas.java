import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Personas {
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;

    public Integer getAge() {
        Calendar fechaN = Calendar.getInstance();
        fechaN.setTime(this.fecha_nacimiento);
        Calendar hoy = Calendar.getInstance();
        return hoy.get(Calendar.YEAR) - fechaN.get(Calendar.YEAR);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.fecha_nacimiento = format.parse(fecha_nacimiento);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
