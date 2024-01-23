package prodotti;

public enum CalorieEnum {
   CENTO("100 Kcal"),
    OTTANTA("80 Kcal"),
    SESSANTA("60 Kcal"),
   CINQUECENTO("550 Kcal"),
    CENTOVENTI("120 Kcal"),
    NOVANTA("90 Kcal");
   private String calorie;
   CalorieEnum(String calorie){
       this.calorie=calorie;
   }

    public String getCalorie() {
        return calorie;
    }
}
