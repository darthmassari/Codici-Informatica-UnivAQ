public class Testing {
    public static void main(String[] args) {
        Professore p1 = new Professore("Nesi", "L'Aquila", "12334556", "NIADFISAOFJ");
        Studente s1 = new Studente("Lorenzo", "Roma", "195119", "DOAU8402");

        System.out.println(p1.info());
        System.out.println(p1.get_codice());

        System.out.println(s1.info());
        System.out.println(s1.get_codice());

    }
}