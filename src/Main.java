import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("PHP");
        curso2.setDescricao("Curso de PHP");
        curso2.setCargaHoraria(60);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Erika");

        Dev dev2 = new Dev();
        dev2.setNome("João");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        dev1.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("Conteúdos inscritos Dev: " + dev1.getNome() + " " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Dev: " + dev2.getNome() + " " + dev2.getConteudosInscritos());
        System.out.println(
                "=============================================================================================");
        System.out.println("Conteúdos concluidos Dev: " + dev1.getNome() + " " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos concluidos Dev: " + dev2.getNome() + " " + dev2.getConteudosConcluidos());
        System.out.println(
                "=============================================================================================");
        System.out.println("XP Dev:" + dev1.getNome() + " " + dev1.calcularXPTotal());
        System.out.println("XP Dev:" + dev2.getNome() + " " + dev2.calcularXPTotal());
    }

}