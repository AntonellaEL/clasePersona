package dev.anto;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    
    @Test 
    void testgetName(){
        Person person1 = new Person("Anto" , "Ledesma", 2305450, 25, "España", 'M');
       assertEquals("Anto", person1.getName());
       assertEquals("Ledesma", person1.getLastname());
       assertEquals(2305450, person1.getId());
       assertEquals(25, person1.getYears());
       assertEquals("España", person1.getNationality());
       assertEquals('M', person1.getOption());

    }
}
