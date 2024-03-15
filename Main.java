//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Aluno> lista = new ArrayList<>();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();


        a1.setNome("Pedro");
        a2.setNome("Miguel");
        a3.setNome("Jonas");
        a4.setNome("Yuri");
        a5.setNome("Belladona");
        a6.setNome("Alice");
        a7.setNome("Maria");
        a8.setNome("Marcos");
        a9.setNome("Yamato");
        a10.setNome("Isley");
        a11.setNome("Laura");
        a12.setNome("Lisa");
        a13.setNome("Mona");
        a14.setNome("Andreia");
        a15.setNome("Agata");


        System.out.println("\nAlunos: " + a2.getNome());
        System.out.println("Alunos: " + a1.getNome());


        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        lista.add(a6);
        lista.add(a7);
        lista.add(a8);
        lista.add(a9);
        lista.add(a10);
        lista.add(a11);
        lista.add(a12);
        lista.add(a13);
        lista.add(a14);
        lista.add(a15);

        System.out.println(" ");

        System.out.println("Total de alunos: " + lista.size());

        System.out.println(lista);

        System.out.println(lista.contains(a4));

        lista.remove(1);
        lista.remove(2);
        System.out.println(" ");

        System.out.println("Lista com alunos removidos: " + lista);

        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();
        a16.setNome("Luffy");
        a17.setNome("Goku");

        lista.add(1, a16);
        lista.add(2, a17);
        System.out.println(" ");
        System.out.println("Lista com alunos novos: " + lista);

    }
}