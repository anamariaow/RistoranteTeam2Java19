package prodotti;

public enum CalorieEnum {
    ZERO("0 Kcal"),
    CINQUE("5 Kcal"),
    CENTO("100 Kcal"),
    CENTOCINQUANTA("150 Kcal"),
    DUECENTO("200 Kcal"),
    DUECENTOCINQUANTA("250 Kcal"),
    TRECENTO("300 Kcal"),
    TRECENTOCINQUANTA("350 Kcal"),
    QUATTROCENTO("400 Kcal"),
    QUATTROCENTOCINQUANTA("450 Kcal"),
    CINQUECENTO("500 Kcal"),
    CINQUECENTOCINQUANTA("550 Kcal"),
    SEICENTO("600 Kcal");
   private String calorie;
   CalorieEnum(String calorie){
       this.calorie=calorie;
   }

    public String getCalorie() {
        return calorie;
    }
}
