public enum Season {
   WINTER ("kysh"),
    SPRING("jaz"),
    SUMMER("jai"),
    AUTUMN("kuz");
  private String name;
   Season(String name){
       this.name =name;
   }
   public void method(){
       System.out.println("mezgil");
   }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}
