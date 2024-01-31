public class Cliente {
   private String nome;
   private Integer numeroPersone;
   private TipoEnum menuScelto;
   public Cliente(String nome,Integer numeroPersone,TipoEnum menuScelto){
      this.nome=nome;
      this.numeroPersone=numeroPersone;
      this.menuScelto=menuScelto;
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
   public void stampaDettagliCliente(){
      /**
       * questo metodo stampa i dettagli (fields: nome, menuScelto, numeroPersone) della classe Cliente e inserisce stellne per rendere la stampa più accattivante
       * @author Ana
       */
      System.out.println("☆ Il Cliente " + nome + " ha scelto il " + menuScelto.getDescrizione() + " per " + numeroPersone + " persone ☆" );
   }

   //TODO spostare
   /**
    * questo metodo permette di visualizzare il menu scelto dal cliente (un field presente in ogni oggetto di tipo Cliente) a scelta tra quelli presenti nel TipoMenuEnum
    * @author Samira
    * @param portata: cicla sull'array manuArrayList (in classe Ristorante) che contiene tutte le portate
    */
   public void sceltaMenu(Ristorante portata){
      for(Menu menu : portata.getMenuArrayList()){
         if(menu.getTipoMenuEnum().equals(menuScelto)){
            menu.stampaMenu();
         }
      }

   }

   @Override
   public String toString() {
      return " " + nome;
   }
}
