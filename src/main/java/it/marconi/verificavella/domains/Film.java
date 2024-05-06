package it.marconi.verificavella.domains;



// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// @Entity
// @Table(name="films")
public class Film {
    
    // @Id
    // @GeneratedValue
    // @Column(name="codice")
    private String codice;

    // @Column(name="titolo")
    private String titolo;

    // @Column(name="genere")
    private String genere;

    // @Column(name="anno")
    private int anno;

    // @Column(name="voto")
    private int voto;
}
