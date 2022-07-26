import br.com.ulteriorti.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição");
        curso2.setCargaHoraria(6);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        //System.out.println(mentoria);

        Bootcam bootcamp = new Bootcam();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("Descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDenis = new Dev();
        devDenis.setNome("Denis");
        devDenis.inscreverBootcamp(bootcamp);
        System.out.println(devDenis.getConteudosInscritos());
        Dev devJoao = new Dev();
        devDenis.setNome("Jão");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(devJoao.getConteudosInscritos());
        devDenis.progredir();
        devJoao.progredir();
        System.out.println(devDenis.getConteudosConcluidos());
        System.out.println(devJoao.getConteudosConcluidos());

        System.out.println(devDenis.calcularTotalXp());
    }
}
