package Harry;

public class Hogwarts {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        Personaje Harry= new Personaje("Griffindor", "M", "Harry Potter", "Dementor","Ciervo");
        Personaje Draco= new Personaje("Slytherin","M","Draco Malfoy", "Lord Voldemort","None");
        Personaje Hermione= new Personaje("Gryffindor","F","Hermione Granger", "McGonagall", "Nutria");
        Personaje Ron= new Personaje("Gryffindor","M", "Ron Weasley","Acromantula", "Jack Russell Terrier");
        Personaje Luna= new Personaje("Ravenclaw","F", "Luna Lovegood","Ver morir a su padre", "Liebre");

        Harry.display();
        Draco.display();
        Hermione.display();
        Ron.display();
        Luna.display();
    }
}
