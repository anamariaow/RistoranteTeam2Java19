import prodotti.Portata;

import java.util.Objects;

public class Cliente {
   private String nome;
   private Integer numeroPersone;
   private TipoEnum menuScelto;
   private FidelityCard fidelityCard;
   public Cliente(String nome,Integer numeroPersone,TipoEnum menuScelto){
      this.nome=nome;
      this.numeroPersone=numeroPersone;
      this.menuScelto=menuScelto;
      this.fidelityCard = new FidelityCard();
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Integer getNumeroPersone() {
      return numeroPersone;
   }

   public void setNumeroPersone(Integer numeroPersone) {
      this.numeroPersone = numeroPersone;
   }

   public TipoEnum getMenuScelto() {
      return menuScelto;
   }

   public void setMenuScelto(TipoEnum menuScelto) {
      this.menuScelto = menuScelto;
   }

   public FidelityCard getFidelityCard() {
      return fidelityCard;
   }

   public void setFidelityCard(FidelityCard fidelityCard) {
      this.fidelityCard = fidelityCard;
   }

   public void stampaDettagliCliente(){
      /**
       * questo metodo stampa i dettagli (fields: nome, menuScelto, numeroPersone) della classe Cliente e inserisce stellne per rendere la stampa più accattivante
       * @author Ana
       */
      System.out.println("☆ Il Cliente " + nome + " ha scelto il " + menuScelto.getDescrizione() + " per " + numeroPersone + " persone ed ha " + getFidelityCard().getPunti() + " punti sulla sua fidelityCard ☆"  );
   }

   //TODO spostare
   /**
    * questo metodo permette di visualizzare il menu scelto dal cliente (un field presente in ogni oggetto di tipo Cliente) a scelta tra quelli presenti nel TipoMenuEnum
    * @author Samira
    * @param portata: cicla sull'array menuArrayList (in classe Ristorante) che contiene tutte le portate
    */
   public void sceltaMenu(Ristorante portata){
      for(Menu menu : portata.getMenuArrayList()){
         if(menu.getTipoMenuEnum().equals(menuScelto)){
            menu.stampaMenu();
         }
      }
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Cliente cliente = (Cliente) o;
      return Objects.equals(nome, cliente.nome) && Objects.equals(numeroPersone, cliente.numeroPersone) && menuScelto == cliente.menuScelto && Objects.equals(fidelityCard, cliente.fidelityCard);
   }

   @Override
   public int hashCode() {
      return Objects.hash(nome, numeroPersone, menuScelto, fidelityCard);
   }
}
