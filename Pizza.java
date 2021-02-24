package lab2;
import java.util.*; 

public class Pizza  {
	
    String name; 
    public Pizza(String name) { 
       this.name = name; 
    }
    public void pr(){
       System.out.println("Pizza zahialga:" + name);
    }

class BBQ_pizza extends Pizza{
        
    public BBQ_pizza(String name) { 
       super(name);
    }
    public void pr() {
       System.out.println("BBQ pizza zahialah:" + name);
    }
}

class Cheese_pizza extends Pizza{

    public Cheese_pizza(String name) { 
       super(name); 
     }
     public void pr() {
        System.out.println("Cheese pizza zahialah:" + name);
     }
}

class Mix_pizza extends Pizza{

     public Mix_pizza(String name) { 
        super(name); 
     }
     public void pr() {
        System.out.println("Mix pizza zahialah:" + name);
     }
}

class Hawain_pizza extends Pizza{

      public Hawain_pizza(String name) { 
         super(name); 
      }
      public void pr() {
         System.out.println("Hawain pizza zahialah:" + name);
      }
}

class Tuna_pizza extends Pizza{

      public Tuna_pizza(String name) { 
         super(name); 
      }
      public void pr() {
         System.out.println("Tuna pizza zahialah:" + name);
      }
}
 
class Salami_pizza extends Pizza{

       
       public Salami_pizza(String name) { 
          super(name); 
       }
       public void pr() {
          System.out.println("Salami pizza zahialah:" + name);
       }
}

class Vegetable_pizza extends Pizza{

        public Vegetable_pizza(String name) { 
           super(name); 
           
        }
        public void pr() {
           System.out.println("Vegetable pizza zahialah:" + name);
        }
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pizza p = new Pizza("Pizza");
        Pizza b = new BBQ_pizza("BBQ");
        Pizza c = new Cheese_pizza("Cheese");
        Pizza m = new Mix_pizza("Mix");
        Pizza h = new Hawain_pizza("Hawain");
        Pizza t = new Tuna_pizza("Tuna");
        Pizza s = new Salami_pizza("Salami");
        Pizza v = new Vegetable_pizza("Vegetable");
 
ArrayList<Pizza> object = new ArrayList<Pizza>();
        object.add(p);
        object.add(b);
        object.add(c);
        object.add(m);
        object.add(h);
        object.add(t);
        object.add(s);
        object.add(v);
        for(Pizza a:object){
        a.pr();
        }
    }
}

