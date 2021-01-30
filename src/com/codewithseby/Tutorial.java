package com.codewithseby;
/*
108. Write a Java program to add all the digits of a given positive integer until the result has a single digit. G
 */

//{ se pune pe aceeasi linie cu clasa deschisa. Numele clasei trebuie sa inceapa cu litera mare si sa aiba acelasi nume cu fisierul java.

public class Tutorial {

    static int myNumarg;   // Global variabila si are valoare 0 implicit fara sa ii dam noi

    public static void main(String[] args) {           //sa aiba clasa Main si metoda main

        int myNumarl = 0;   // Local variabila, care se gaseste in metode, constructori si trebuie initializata ca altfel da eroare
    }

    public static void altametoda () {

        System.out.println(myNumarg);      //La variabila asta avem acces pentru ca este globala
    }
}
    /* tot ce este in bucata asta de cod este comentata
Comanda conditie comanda   =   if (x<5) { System.out.prinln (i);}
for (int i=0; i<5; i++) {System.out.println ("ce vrem noi se va printa de i ori");
System.out.println(cars[i]);  = cars de index i , unde i este definit inainte. ADica de exemplu daca avem i are valorile 1,2,3,4. Noi vom aveam print [1], [2]. [3].
for (String i : cars)  =  loop printre valorile din Array.
String - 'Arrayofobjectssorting'
int - 1 , 2 ,3 ,4
float - 1,23f
double - 1,23d
boolean - true or false
char - 'A'
&	AND - Sets each bit to 1 if both bits are 1	5 & 1	0101 & 0001	0001	 1 , transformam numarul in binar .
&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
boolean g = false  || (f++ < 4);  // daca primul statement este false, a doua expresia nu mai este evaluata. Adica f++ nu se va activa. f va ramane tot 4
|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
^   Returns true daca ambele expresii sunt diferite, rezultatul este true

int f =4;
f--   Mai intai folosim f =4 in expresia noastra. In expresia urmatoare f va fi = 3

  int x = 9;
  int y =4;
  boolean z = (x<=10) || (y++ ==4);       // prima conditie e true nu se mai evalueaza a doua conditie  // daca prima conditie e false se evalueaza a doua conditie
  // si daca avem c1 && c2 || c3  // c1 && c2 da false || c3  se va evalua c3

boolean x = (z = false);   // x = false;
*/



/* Cum sa chemi o variabla dintr-o functie a unei alte clase
public class Person {
   private String name;

   // Getter
   public String getName() {
     return name;
   }

   // Setter
   public void setName(String newName) {
     this.name = newName;
   }
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John");
    System.out.println(myObj.getName());
  }
}

 */


/*
// Programel care iti scrii numele si ti-l afiseaza
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println ("Enter your username:.......");
String username= obj.nextLine();
System.out.println ("Your username is :" + username );
    }
}
 */



/*////////AFISEAZA NUMERE PE CARE SA LE SCRII SI FACE ADUNRAREA LOR LA SFARSIT
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner obj = new Scanner(System.in);

      int x;
      int y;
      int sum;
        System.out.println ("Type a number: ");
        x= obj.nextInt();
        System.out.println ("Type a number: ");
        y= obj.nextInt();
        sum= x+y;
        System.out.println ("Suma totala este: " +sum);
    }
}



 */

/* Formatare data

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime obj1= LocalDateTime.now();

        System.out.println("Before formatting:  " + obj1);

        DateTimeFormatter obj2= DateTimeFormatter.ofPattern("dd-MM-yyyy" ) ; //HH:mm:ss");

        System.out.println("AFter formatting:  " + obj1.format(obj2));
    }
}
 */


/* Sorteaza valorile dintr-o multime
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    for (String i : cars) {
      System.out.println(i);
 */


/*   ITERATOR = repetare
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("LAmbo");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        //In timp ce it.hasNext e True |  adica next() sa fie true adica next next next, adica returneaza "Volvo", "Lambo", "Mazda".
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
 */


/* // CUM SE CREEAZA MESAJE PENTRU ERORI. sa execute un anumit bloc de cod si sa dea eroare.
public class Main {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}
 */


/*// REGEX - cauti un cuvant intr-un text

public class Main {
  public static void main(String[] args) {
  // variabila matchfound foloseste obiectul matcher care cheama metoda find sa caute in obiectul matcher care foloseste paternul pentru cautat w3schools.
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    //Alte exemeple de regex pentru pattern(model)
    // Pattern pattern = Pattern.compile("[abcd]", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
      System.out.println(matcher.group());
  }

}
// Outputs Match found
 */



/* /// CREARE FISIER NOU
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File obj = new File("filename.txt");
if (obj.createNewFile()) {
    System.out.println("File created succesufuly");
    System.out.println("The path of the file is : "  + obj.getAbsolutePath());
}
    else {
        System.out.println("File already exists");
                System.out.println("The path of the file is : " + obj.getAbsolutePath());
    }

        }
        catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
 */


/*////////SCRIE CEVA INTR-UN FISIER

package com.codewithseby;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class WriteToFile {
    public static void main (String [] args) {
        try {
            FileWriter obj = new FileWriter("C:\\Users\\SEBY\\Downloads\\filename.txt");
            File obj1 = new File("C:\\Users\\SEBY\\Downloads\\filename.txt");
            obj.write("Scrie ceva in fisierul nostru" );
            obj.close();
            System.out.println("A scris ceva in fisierul " + obj1.getName() + " de la locatia " + obj1.getAbsolutePath());
        }
        catch (IOException e) {
            System.out.println("A dat o eroare");
            e.printStackTrace();
        }

    }

}
 */


/* //// SCRIE CEVA INTR-UN FISIER IN CONTINUARE DEDESUBT FARA SA FACA OVERWRITE
import java.io.*;


public class Appendfisier {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("C:\\\\Users\\\\SEBY\\\\Downloads\\\\filename.txt", true);
            BufferedWriter buffer = new BufferedWriter(obj);
            buffer.write("\nJava is fun when you learn it at home");
            buffer.close();
            System.out.println("File succesufuly wrote to it");
        } catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}

 */



/* ////// CITESTE UN FISIER
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files



public class ReadFile {
    public static void main (String [] args) {
        try {
            File obj = new File("filename.txt");
            Scanner myscanner = new Scanner(obj);
            System.out.println(myscanner.nextLine());
        }
        catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
 */


/*////// CITESTE TOT CONTINUTUL UNUI FISIER

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File obj = new File("filename.txt");
            Scanner scanner = new Scanner(obj);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("An error has occured. See the bellow stackstrace: ");
            e.printStackTrace();
        }
    }
}
 */

//switch-ul printeaza de la match case pana la primul break;