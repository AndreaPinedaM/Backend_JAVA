package Harry;

public class Personaje {
    public String casa;
    public String genero;
    public String nombre;
    public String boggart;
    public String patronus;

    //public Personaje(){}

    public Personaje(String casa, String genero, String nombre, String boggart, String patronus){
        this.casa= casa;
        this.genero= genero;
        this.nombre= nombre;
        this.boggart= boggart;
        this.patronus= patronus;
    }

    void display(){
        System.out.println("\nNombre: "+nombre+
                "\nGenero: "+genero+
                "\nCasa: "+casa+
                "\nBoggart: "+ boggart+
                "\nPatronus: "+patronus);
    }

    public String getCasa(){  return casa;  }
    public String getGenero() {  return genero;  }
    public String getNombre() {  return nombre;  }
    public String getBoggart() {  return boggart;  }
    public String getPatronus() {  return patronus;  }
}

