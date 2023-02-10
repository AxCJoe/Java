package JSample;
public class JSample14_1 {
    public static void main(String[] args) {
      show(new Cat());  
      show(new Dog()); 
      Animal a = new Cat();    
      a.eat();              
      Cat c = (Cat)a;         
      c.work();       
    }  


    public static void show(Animal a)  {
      a.eat();  
      if (a instanceof Cat)  { 
            Cat c = (Cat)a;  
            c.work();  
      } else if (a instanceof Dog) { 
            Dog c = (Dog)a;  
            c.work();  
      }  
    }  
}

abstract class Animal {  
    abstract void eat();  
}  
class Cat extends Animal {  
    public void eat() {  
        System.out.println("Catに食べる?");  
    }  
    public void work() {  
        System.out.println("Catにネズミを捕まえる");  
    }  
}  
class Dog extends Animal {  
    public void eat() {  
        System.out.println("Dogに食べる?");  
    }  
    public void work() {  
        System.out.println("Dogに留守番する");  
    }  
}


// Catに食べる?
// Catにネズミを捕まえる
// Dogに食べる?
// Dogに留守番する
// Catに食べる?
// Catにネズミを捕まえる