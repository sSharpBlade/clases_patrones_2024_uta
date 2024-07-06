public class App {
    public static void main(String[] args) throws Exception {
        Personas p = new Personas();
        p.setFecha_nacimiento("07/01/2004");
        System.err.print(p.getAge());
    }
}
