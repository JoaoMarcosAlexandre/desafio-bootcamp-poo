import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição curso Java");
        cursoJava.setCargaHoraria(80);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Descrição curso Python");
        cursoPython.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer 2024");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer 2024");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabi = new Dev();
        devGabi.setNome("Gabi");
        devGabi.inscreverBootcamp(bootcamp);
        System.out.println("Cursos Inscritos Gabi:" + devGabi.getConteudosInscritos());
        devGabi.progredir();
        devGabi.progredir();
        System.out.println("-");
        System.out.println("Cursos Inscritos Gabi:" + devGabi.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gabi:" + devGabi.getConteudosConcluidos());
        System.out.println("XP:" + devGabi.calcularTotalXp());

        System.out.println("-----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Cursos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Cursos inscritos de João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos de João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-----------");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Cursos inscritos de Davi: " + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        System.out.println("Cursos inscritos de Davi: " + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos concluidos de Davi: " + devDavi.getConteudosConcluidos());
        System.out.println("XP:" + devDavi.calcularTotalXp());

        System.out.println("-----------");

        Dev devManu = new Dev();
        devManu.setNome("Manu");
        devManu.inscreverBootcamp(bootcamp);
        System.out.println("Cursos inscritos de Manu: " + devManu.getConteudosInscritos());
        devManu.progredir();
        devManu.progredir();
        devManu.progredir();
        System.out.println("-");
        System.out.println("Cursos inscritos de Manu: " + devManu.getConteudosInscritos());
        System.out.println("Conteúdos concluidos de Manu: " + devManu.getConteudosConcluidos());
        System.out.println("XP:" + devManu.calcularTotalXp());
    }

}