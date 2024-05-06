package it.marconi.verificavella.domains;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmForm {

    @NotEmpty
    @Size(max = 50)
    private String titolo;

    @NotEmpty
    @Size(max = 30)
    private String genere;

    @NotEmpty
    @Size(max = 5)
    private int anno;

    @NotEmpty
    @Size(max = 1)
    private int voto;

}
