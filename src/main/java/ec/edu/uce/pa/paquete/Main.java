package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private MatriculaService matriculaService;
    

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {

        System.out.println("Holaaa");

        Persona persona1 = new Persona("Juan", "123456", "juan@gmai.com", "PCA-232");
        this.matriculaService.matricular(persona1, "valor 1");

        System.out.println("-----------------------------");
        Persona persona2 = new Persona("Ismael", "abi2026", "isma@gmail.com", "ABC-1234");
        this.matriculaService.matricular(persona2, "valor 2");

       return 0;
    }
}
