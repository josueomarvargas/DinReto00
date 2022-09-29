/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josue
 */
public class ModelImplementationFileTest {
    
    @Test
    public void testConstructor() {
        ModelImplementationFile modelo= new ModelImplementationFile();
        assertNotNull("Fallo no se ha instanciado bien la clase",modelo);
        
    }
    @Test
    public void testInterface() {
         ModelImplementationFile modelo= new ModelImplementationFile();
        
        assertTrue("Esta clase no implementa la clase modelo",modelo instanceof Model);
        
        
    }
    @Test
    public void testGetGreeting() {
          ModelImplementationFile modelo= new ModelImplementationFile();
     
        assertNotNull("No devuelve ningun String",modelo.getGreeting());
    }
    
}
