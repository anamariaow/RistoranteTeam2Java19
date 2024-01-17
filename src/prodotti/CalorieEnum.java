package prodotti;

public enum CalorieEnum {
   CENTO("100 KL"),
    OTTANTA("80 KL"),
    SESSANTA("60 KL"),
   CINQUECENTO("550 KL"),
    CENTOVENTI("120 KL"),
    NOVANTA("90 KL");
   private String calorie;
   CalorieEnum(String calorie){
       this.calorie=calorie;
   }

    public String getCalorie() {
        return calorie;
    }
}
