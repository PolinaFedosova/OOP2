package org.example;

public class Main {


    public static void main(String[] args) {
        Entity[] entity= new Entity[]{new Human("Андрей"),
                 new Cat("Бобик"),
                 new Robot("Саша"),
                 new Human("Аркадий")};
      Obstacle [] obstacles= new Obstacle[]  {new Doroga(250),
      new Stena(11),
      new Stena(7),
      };
      for(Entity en: entity){
          for(Obstacle ob: obstacles){
             if(ob.passing(en).contains(" не ")){
                 break;
             }else{
                 System.out.println(ob.passing(en));
             }
          }
      }
    }
}