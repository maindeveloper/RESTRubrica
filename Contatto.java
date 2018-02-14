package ifts.rubrica;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contatto {


    private String cognome;
    private String nome;
    private String numero;


    public Contatto(){

    }

    public Contatto(String cognome, String nome, String numero){
        this.cognome=cognome;
        this.nome=nome;
        this.numero=numero;
    }

    @JsonProperty
    public String getCognome() {
        return cognome;
    }

    @JsonProperty
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @JsonProperty
    public String getNome() {
        return nome;
    }

    @JsonProperty
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty
    public String getNumero() {
        return numero;
    }

    @JsonProperty
    public void setNumero(String numero) {
        this.numero = numero;
    }

}
