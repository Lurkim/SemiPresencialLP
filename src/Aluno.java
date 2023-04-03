public class Aluno {
     private Prova prova1;
     private Prova prova2;

     public Aluno(Prova prova1, Prova prova2) {
         this.prova1 = prova1;
         this.prova2 = prova2;
     }

     public double calcularMedia() {
        double notaTotal1 = prova1.calcularNotaTotal();
        double notaTotal2 = prova2.calcularNotaTotal();
        double media = (notaTotal1 + notaTotal2) / 2;
        return media;
    }
}