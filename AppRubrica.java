package ifts.rubrica;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class AppRubrica extends Application<RubricaConfig> {

    public static void main(String[] args) throws Exception{
        new AppRubrica().run(args);
    }

    public void run(RubricaConfig rubricaConfig, Environment environment){
        final Rubrica risorsaRubrica = new Rubrica(rubricaConfig.getNomeIniziale());
        environment.jersey().register(risorsaRubrica);
    }
}
