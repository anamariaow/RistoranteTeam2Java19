import prodotti.Portata;

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
      System.out.println("* Il Cliente " + nome + " ha scelto il " + menuScelto.getDescrizione() + " per " + numeroPersone + " persone *" );
   }
   public void vizualizzaMenuConsigliti(Ristorante portata){
      System.out.println(" * Il menù consiglito per voi è *");
      for(Menu menu :portata.getMenuArrayList()){
         if(menu.getTipoMenuEnum().equals(menuScelto)){
            menu.stampaMenu();
         }
      }

   }
}
