public abstract class Movie{
protected int id;
protected String title;
protected double basePrice;

public Movie(int id, String title, double basePrice){
this.id=id;
this.title=title;
this.basePrice=basePrice;
}

public abstract double CalculatePrice();

public String toString(){
return "ID: "+id+" Title: "+title+" BasePrice: "+ basePrice+"\n";
}
}