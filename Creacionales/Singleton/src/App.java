public class App {
    public static void main(String[] args) throws Exception {
        Student a = Student.getSingletonInstance("John", "117", "Plata");
        System.out.println(a.toString());

        Student b = Student.getSingletonInstance("Kai", "125", "Plata");

    }
}
