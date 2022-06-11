package com.example.fxapplikasjon.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ordRepository {
     List<String> ordliste= new ArrayList<>();

     public void leggtilord () {
         ordliste.add("troll");
         ordliste.add("fjell");
         ordliste.add("sau");
         ordliste.add("tyggegummi");
         ordliste.add("knekkebrød");
         ordliste.add("rød");
         ordliste.add("grønn");
         ordliste.add("pochantas");
         ordliste.add("postman");
         ordliste.add("postman pat");
         ordliste.add("lungemos");
         ordliste.add("leverpostei");
         ordliste.add("kake");
         ordliste.add("reke");
         ordliste.add("kaffe");
     }

     public String tilfeldigord (){
         Random r = new Random();
        return ordliste.get(r.nextInt(ordliste.size()));
     }
     public boolean gjetning(String gjetning) {
         try {
             if (gjetning == tilfeldigord()) return true;
             if (gjetning != tilfeldigord()) return false;
         } catch (Exception e) {
             System.out.println("feil");
             return false;
         }
         return false;
     }
}
