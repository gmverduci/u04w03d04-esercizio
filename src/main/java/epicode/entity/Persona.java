package epicode.entity;

import epicode.enums.Sesso;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "persone")
public class Persona {

    @Id
    @GeneratedValue
    private int id;
    private String nome;

    private String cognome;
    private String email;

    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;
    @Enumerated(EnumType.STRING)
    @Column(name = "sesso")
    private Sesso Sesso;
    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> partecipazioni;

    public Persona(int id, String nome, String cognome, String email, LocalDate dataDiNascita, epicode.enums.Sesso sesso) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        Sesso = sesso;
    }

    public Persona(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public epicode.enums.Sesso getSesso() {
        return Sesso;
    }

    public void setSesso(epicode.enums.Sesso sesso) {
        Sesso = sesso;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }
}