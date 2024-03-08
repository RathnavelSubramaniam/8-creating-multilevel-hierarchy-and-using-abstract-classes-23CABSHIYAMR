// Animal.java
 abstract class Animal {
    protected String species;
    protected int age;

    public Animal(String species,int age){
        this.species=species;
        this.age=age;
    }
    public abstract void sound();

    public String toString(){
        return "Species :"+species+"  Age :"+age;
    }

    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null||getClass()!=obj.getClass()) return false;

        Animal otherAnimal=(Animal) obj;
        return species.equals(otherAnimal.species) && age==otherAnimal.age;
    }
// Basic attributes and methods including abstract sound method
}

// Mammal.java
 class Mammal extends Animal {
    private String habitat;

    public Mammal(String species,int age,String habitat){
        super(species,age);
        this.habitat=habitat;
    }

    public void sound(){
        System.out.println(" Mammal sound");
    }
// Additional attributes and methods
}

// Bird.java
 class Bird extends Animal {
    private String featherColor;
    public Bird(String species,int age,String featherColor){
        super(species,age);
        this.featherColor=featherColor;
    }

        public void sound(){
        System.out.println(" Bird sound");
    }
// Additional attributes and methods
}


// Parrot.java
 class Parrot extends Bird {
        private boolean canSpeak;
        public Parrot(String species,int age,String featherColor,boolean canSpeak){
            super(species,age,featherColor);
            this.canSpeak=canSpeak;
        }
        public void sound(){
            if(canSpeak){
                System.out.println("Parrot can speak.");}
            else{
                System.out.println("Parrot cannot speak.");
                }
        }

// Additional characteristics specific to Parrot
}

// Main.java
 class Practical8 {
public static void main(String[] args) {
    Mammal Lion=new Mammal("Lion",15,"Forest");
    Bird Eagle=new Bird("Eagle",12,"orange");
    Parrot parrot=new Parrot("Pet bird",11,"green",true);
    System.out.println(Lion);
    System.out.println(Eagle);
    System.out.println(parrot);
    System.out.println(Lion.equals(Eagle));
    System.out.println(Lion.equals(new Mammal("Lion",15,"Forest")));
    Lion.sound();
    Eagle.sound();
    parrot.sound();
    
// Instantiate and demonstrate object class methods
}
}
