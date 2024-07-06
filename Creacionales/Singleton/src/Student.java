public class Student {
    private String nombre;
    private String apellido;
    private String facultad;

    private static Student student;

    private Student(String nombre, String apellido, String facultad) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
    }

    public static Student getSingletonInstance(String nombre, String apellido, String facultad) {
        if (student == null) {
            student = new Student(nombre, apellido, facultad);
        } else {
            System.out.println("Ya está creado ");
        }
        return student;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " de " + this.facultad;
    }

    // TODO: desactivar .clone()

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clonación no permitida");
    }

}
