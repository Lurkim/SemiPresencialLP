public class Main {
    public static void main(String[] args) {
        Prova prova1_aluno1 = new Prova(4.0,2.5);
        Prova prova2_aluno1 = new Prova(1.0,7.0);
        Aluno aluno1 = new Aluno(prova1_aluno1,prova2_aluno1);

        Prova prova1_aluno2 = new Prova(6.5,3.5);
        Prova prova2_aluno2 = new Prova(0.0,3.0);
        Aluno aluno2 = new Aluno(prova1_aluno2,prova2_aluno2);

        Prova prova1_aluno3 = new Prova(5.0,4.0);
        Prova prova2_aluno3 = new Prova(6.0,1.5);
        Aluno aluno3 = new Aluno(prova1_aluno3,prova2_aluno3);

        Aluno[] alunos = {aluno1, aluno2, aluno3};
        Turma turma = new Turma(alunos);

        System.out.println("Média do aluno 1: " + aluno1.calcularMedia());
        System.out.println("Média do aluno 2: " + aluno2.calcularMedia());
        System.out.println("Média do aluno 3: " + aluno3.calcularMedia());
        System.out.println("Média da turma: " + turma.calcularMedia());
    }
}
