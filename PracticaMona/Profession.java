package Mona;

public class Profession extends Mona{
        String profession;

        Profession(int number, String name, String profession){
            super(number, name);
            this.profession =profession;
        }
        void display(){
            System.out.println("\n\nNumber: "+number+
                                "\nName: "+name+
                                "\nProfession: "+profession);
        }
        void action(){
            System.out.println("Estoy...");
        }

        void main(){
            display();
            action();
        }
}

class Professor extends Profession{
    Professor(int number, String name, String profession) {
        super(number, name, profession);
    }

    @Override
    void action() {
        super.action();
        System.out.println("Aplicando un examen");
    }
}

class Electrician extends Profession{

    Electrician(int number, String name, String profession) {
        super(number, name, profession);
    }

    @Override
    void action() {
        super.action();
        System.out.println("Arreglando la electricidad");
    }
}

class Astronaut extends Profession{

    Astronaut(int number, String name, String profession) {
        super(number, name, profession);
    }

    @Override
    void action() {
        super.action();
        System.out.println("Estudiando el cosmos");
    }
}

class Filmmaker extends Profession{

    Filmmaker(int number, String name, String profession) {
        super(number, name, profession);
    }

    @Override
    void action() {
        super.action();
        System.out.println("Grabando una pelicula");
    }
}

class Diver extends Profession{

    Diver(int number, String name, String profession) {
        super(number, name, profession);
    }

    @Override
    void action() {
        super.action();
        System.out.println("Buceando con tiburones");
    }
}

class Miner extends Profession{

    Miner(int number, String name, String profession) {
        super(number, name, profession);
    }

    @Override
    void action() {
        super.action();
        System.out.println("Minando oro");
    }
}

class TestProfessions{
    public static void main(String[] args) {

        Professor A= new Professor(94,"Professorcat","Professor");
        Electrician B= new Electrician(71,"Electocat","Electrician");
        Astronaut C= new Astronaut(15,"Octonaut","Astronaut");
        Filmmaker D= new Filmmaker(120,"Filmtocat","Filmmaker");
        Diver E= new Diver(136, "Scubatocat","Scuba Diver");
        Miner F= new Miner(115,"Minertocat","Miner");

        A.main();
        B.main();
        C.main();
        D.main();
        E.main();
        F.main();
    }
}
