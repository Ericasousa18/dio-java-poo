
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String toString() {

        return "Mentoria {" +
                "titulo:'" + getTitulo() + '\'' +
                "descricao:'" + getDescricao() + '\'' +
                "data:'" + getData().format(formatter) +
                "}";
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

}