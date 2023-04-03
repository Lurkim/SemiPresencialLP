public class Turma {
    private Aluno[] alunos;

    public Turma(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double calcularMedia(){
        double mediaTotal = 0.0;
        for (Aluno aluno : alunos) {
            mediaTotal += aluno.calcularMedia();
        }
        double mediaTurma = mediaTotal / alunos.length;
        return mediaTurma;
    }

}
