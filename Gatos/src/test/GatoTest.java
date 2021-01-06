package test;

import main.Gato;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GatoTest {

    @Test
    @DisplayName("Creando un gatito")
    public void creatingGatosTest(){
        Gato testGato = new Gato("Tomasito", "Alonso", "Negro");
        Assertions.assertNotNull(testGato);

    }

    @Test
    @DisplayName("Corroborando color gato")
    public void checkingColorTest(){
        Gato testGato = new Gato("W. White", "Alonso", "blanco");
        Assertions.assertEquals("blanco", testGato.getColor());
    }

    @Test
    @DisplayName("Corroborando gato con dueño")
    public void checkingPropietarioTest(){
        Gato testGato = new Gato("Tomasito", "Alonso", "Negro");
        Assertions.assertNotNull(testGato.propietario);
    }

    @Test
    @DisplayName("Corroborando los gatitos")
    public void checkingGatitosTest(){
        Gato testGato = new Gato("Tomasito", "Alonso", "Negro");
        testGato.addGatitos(2);
        Assertions.assertEquals(2, testGato.getGatitos());

    }

    @Test
    @DisplayName("Corroborando no poder adoptar mas de 2 gatitos")
    public void checkingUnvalidGatitosTest(){
        Gato testGato = new Gato("Tomasito", "Alonso", "Negro");
        testGato.addGatitos(4);
        Assertions.assertEquals(0, testGato.getGatitos());

    }

    @Test
    @DisplayName("Gatos del mismo color")
    public void sameColorGatosTest(){
        Gato testGato = new Gato("W. White", "Alonso", "blanco");
        Gato testGato2 = new Gato("W. White Junior", "Alonso", "blanco");
        Assertions.assertEquals(testGato, testGato2);

    }


}
