package prc;

public class Store {
    public static void main(String[] args) {
        Gato michi =new Gato("michi","gris",5,"gato");
        Perro dog =new Perro("dog","blanco",3,"perro");
        Gallo bartolo =new Gallo("bartolo","negro",1,"gallo");

        System.out.println("Ejemplo :");
        System.out.println(michi.talk());
        System.out.println(dog.talk());
        System.out.println(bartolo.talk());


    }
}