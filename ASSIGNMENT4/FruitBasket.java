
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Apple;
import com.app.fruits.Orange;

import java.util.Scanner;

public class FruitBasket{
    
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
            int arraySize=0;
            System.out.println("Enter the size of basket");
            int size = sc.nextInt();
            int choice;

            Fruit[] basket = new Fruit[size];
            do{
                System.out.println("\n--- Fruit Basket Menu ---");
                System.out.println("1. Add Mango");
                System.out.println("2. Add Orange");
                System.out.println("3. Add Apple");
                System.out.println("4. Display names of all fruits in basket");
                System.out.println("5. Display details of all fresh fruits");
                System.out.println("6. Display tastes of all stale fruits");
                System.out.println("7. Mark a fruit as stale");
                System.out.println("8. Mark all sour fruits stale");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch(choice){
                
                    case 1 : {
                        if(size == arraySize){
                            System.out.println("Array is full");
                            break;
                        }
                        basket[arraySize++] = new Mango("Malgova","yellow",12,true);
                        break;
                    }
                    case 2 : { 
                        if(size == arraySize){
                            System.out.println("Array is full");
                            break;
                        }
                        basket[arraySize++] = new Orange("Orange","orange",12,true);
                        break; 
                    }
                    case 3 : {
                        if(size == arraySize){
                            System.out.println("Array is full");
                            break;
                        }
                        basket[arraySize++] = new Apple("Apple","red",12,true);
                        break; 
                    }
                    case 4 : { 
                        for(Fruit f : basket ){
                            if(f == null) continue;
            
                            if ( f instanceof Mango){
                                Mango m = (Mango)f;
                                System.out.println(m.getName());
                            }
                            else if(f instanceof Orange ){
                                Orange o = (Orange)f;
                                System.out.println(o.getName());
                            }
                            else{
                                Apple a = (Apple)f;
                                System.out.println(a.getName());
                            }
                        }
                        break; 
                    }
                    
                    case 5 : { 
                        for(Fruit f : basket ){
                            if(f == null) continue;

                            if ( f instanceof Mango){
                                Mango m = (Mango)f;
                                if(m.getIsFresh()){
                                    
                                    m.display();
                                }
                            }
                            else if(f instanceof Orange ){
                                Orange o = (Orange)f;
                                 if(o.getIsFresh()){
                                    
                                    o.display();
                                }
                            }
                            else{
                                Apple a = (Apple)f;
                                 if(a.getIsFresh()){
                                    
                                    a.display();
                                }
                            }
                        }
                        break; 
                    }
                    case 6 : { 
                        for(Fruit f : basket ){
                            if(f == null) continue;

                            if ( f instanceof Mango){
                                Mango m = (Mango)f;
                                if(!m.getIsFresh()){
                                    
                                    System.out.println( m.taste());
                                }
                            }
                            else if(f instanceof Orange ){
                                Orange o = (Orange)f;
                                 if(!o.getIsFresh()){
                                    
                                    System.out.println( o.taste());
                                }
                            }
                            else{
                                Apple a = (Apple)f;
                                 if(!a.getIsFresh()){
                                    
                                    System.out.println( a.taste());
                                }
                            }
                        }
                        break; 
                    }

                    case 7 : { 
                        System.out.println( "Enter the index of the fruit to mark stale");
                        int index = sc.nextInt();
                        if(index > 0 && index > basket.length){
                            // index out of bounds
                        }
                        
                            if(basket[index] == null) continue;

                            if ( basket[index] instanceof Mango){
                                Mango m = (Mango)basket[index];
                                if(m.getIsFresh()){
                                    
                                    m.setFresh(false);
                                    
                                }
                            }
                            else if(basket[index] instanceof Orange ){
                                Orange o = (Orange)basket[index];
                                 if(o.getIsFresh()){
                                    o.setFresh(false);
                                    
                                }
                            }
                            else{
                                Apple a = (Apple)basket[index];
                                 if(a.getIsFresh()){
                                    
                                    a.setFresh(false);
                                }
                            }
                        
                        
                        break; 
                    }
                    case 8 : { 
                        
                        for(Fruit f : basket ){
                            if(f == null) continue;

                           
                            if(f instanceof Orange ){
                                Orange o = (Orange)f;
                                 if( o.taste().equals("Sour") ){
                                    
                                    o.setFresh(false);
                                    
                                }
                            }
                            
                        
                        }
                        break; 
                    
                    }


                }


            }while(choice != 0);

            for(Fruit f: basket){
                System.out.println(f);
            }
                
           

            

    }
            
}




        

