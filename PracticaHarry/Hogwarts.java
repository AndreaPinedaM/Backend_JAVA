package Harry;

public class Hogwarts {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        Personaje Harry= new Personaje("Griffindor", "M", "Harry Potter", "Dementor","Ciervo");
        Personaje Draco= new Personaje("Slytherin","M","Draco Malfoy", "Lord Voldemort","None");
        Personaje Hermione= new Personaje("Gryffindor","F","Hermione Granger", "McGonagall", "Nutria");
        Personaje Ron= new Personaje("Gryffindor","M", "Ron Weasley","Acromántula", "Jack Russell Terrier");
        Personaje Luna= new Personaje("Ravenclaw","F", "Luna Lovegood","Ver morir a su padre", "Liebre");

        System.out.println("\n");
        System.out.println(Harry.getNombre());
        System.out.println(Harry.getGenero());
        System.out.println(Harry.getCasa());
        System.out.println(Harry.getBoggart());
        System.out.println(Harry.getPatronus());

        System.out.println("\n");
        System.out.println(Draco.getNombre());
        System.out.println(Draco.getGenero());
        System.out.println(Draco.getCasa());
        System.out.println(Draco.getBoggart());
        System.out.println(Draco.getPatronus());

        System.out.println("\n");
        System.out.println(Hermione.getNombre());
        System.out.println(Hermione.getGenero());
        System.out.println(Hermione.getCasa());
        System.out.println(Hermione.getBoggart());
        System.out.println(Hermione.getPatronus());

        System.out.println("\n");
        System.out.println(Ron.getNombre());
        System.out.println(Ron.getGenero());
        System.out.println(Ron.getCasa());
        System.out.println(Ron.getBoggart());
        System.out.println(Ron.getPatronus());

        System.out.println("\n");
        System.out.println(Luna.getNombre());
        System.out.println(Luna.getGenero());
        System.out.println(Luna.getCasa());
        System.out.println(Luna.getBoggart());
        System.out.println(Luna.getPatronus());
    }

}
