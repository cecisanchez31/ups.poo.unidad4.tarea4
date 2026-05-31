package ups.poo.contenidoaudiovisual.tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    ContenidoAudiovisualTest.class,
    PeliculaTest.class,
    SerieDeTVTest.class,
    DocumentalTest.class,
    VideosFacebookTest.class,
    VideosTiktokTest.class,
    ActorTest.class,
    TemporadaTest.class
})
public class TestsGeneral {
    // No necesita código, JUnit ejecuta todas las clases listadas
}
