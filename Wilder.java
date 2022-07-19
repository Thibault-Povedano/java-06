public class Wilder {
  String firstname;
  boolean aware;

  public Wilder(String cFirstname, boolean cAware) {
    this.firstname = cFirstname;
    this.aware = cAware;
  }

  public void whoIam(){
    if(isAware()==true){
    System.out.println("Je m'appelle " + getFirstname() + " et je suis aware");
  } else {
    System.out.println("Je m'appelle " + getFirstname() + " et je NE suis PAS aware");};
  
  }
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public boolean isAware() {
    return aware;
  }

  public void setAware(boolean aware) {
    this.aware = aware;
  }

}
