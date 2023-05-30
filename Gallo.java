package prc;
public class Gallo extends Animal {
    public Gallo(){
        super();
    }
    public Gallo(String name, String color,int age,String type){

        super(name,color,age,type);}
    @Override
    public String talk(){return"El animal "+super.getName()+"dice kikiriki";}
    public String toString(){
        return "El animal"+super.getName()+
                " de color "+super.getColor()+
                " tiene "+super.getAge()+
                "y dice" +this.talk();
    }
}

