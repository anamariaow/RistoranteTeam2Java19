public class Dessert {
   public String nome;
   public double prezzo;
   public Dessert(String nome,double prezzo){
      this.nome=nome;
      this.prezzo=prezzo;
   }

   @Override
   public String toString() {
      return "Dessert{" +
              "nome='" + nome + '\'' +
              ", prezzo=" + prezzo +
              '}';
   }
}
