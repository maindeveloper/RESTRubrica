package ifts.rubrica;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class RubricaConfig extends Configuration {

    //Qua devo mettere il parametro o parametri
    //che scelgo di configurare nel caso in cui non
    //inserisco un valore, quindi i valori default

    private String nomeIniziale;

    @JsonProperty
    public String getNomeIniziale() {
        return nomeIniziale;
    }

    @JsonProperty
    public void setNomeIniziale(String nomeIniziale) {
        this.nomeIniziale = nomeIniziale;
    }

}
