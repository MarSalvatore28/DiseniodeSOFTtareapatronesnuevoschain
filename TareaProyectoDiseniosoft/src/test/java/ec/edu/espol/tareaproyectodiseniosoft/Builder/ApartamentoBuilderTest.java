/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espol.tareaproyectodiseniosoft.Builder;

import ec.edu.espol.tareaproyectodiseniosoft.FactoryMethod.Unidad;
import ec.edu.espol.tareaproyectodiseniosoft.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author DHAMAR
 */
public class ApartamentoBuilderTest {
    
    private ApartamentoBuilder builder;

    @BeforeEach
    void setUp() {
        builder = new ApartamentoBuilder();
    }


    
    @Test
    void testConstruccionCompleta() {
        builder.setId("AP001");
        builder.setNombre("Apartamento Test");
        builder.setDireccion("Calle Test 123");
        builder.setReglas(List.of("No fumar", "No mascotas"));
        builder.setUnidades(List.of(new Unidad("U1")));
        builder.setAnfitrion(new Usuario("A1", "Anfitrión Test"));
        
        Propiedad apartamento = builder.build();
        
        assertNotNull(apartamento);
        assertEquals("AP001", apartamento.getId());
        assertEquals("Apartamento Test", apartamento.getNombre());
        assertEquals("Calle Test 123", apartamento.getDireccion());
        assertEquals(2, apartamento.getReglas().size());
    }

    @Test
    void testReset() {
        builder.setId("AP001");
        builder.setNombre("Apartamento Test");
        builder.reset();
        
        Propiedad apartamento = builder.build();
        assertNull(apartamento.getId());
        assertNull(apartamento.getNombre());
    }

    @Test
    void testConstruccionSinReglas() {
        builder.setId("AP001");
        builder.setReglas(new ArrayList<>());
        
        Propiedad apartamento = builder.build();
        assertNotNull(apartamento.getReglas());
        assertTrue(apartamento.getReglas().isEmpty());
    }

    @Test
    void testConstruccionesMultiples() {
        // Primera construcción
        builder.setId("AP001");
        builder.setNombre("Apartamento 1");
        Propiedad apartamento1 = builder.build();
        
        // Segunda construcción
        builder.setId("AP002");
        builder.setNombre("Apartamento 2");
        Propiedad apartamento2 = builder.build();
        
        assertNotEquals(apartamento1.getId(), apartamento2.getId());
        assertNotEquals(apartamento1.getNombre(), apartamento2.getNombre());
    }
}
