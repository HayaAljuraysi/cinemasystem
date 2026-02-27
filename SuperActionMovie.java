public class SuperActionMovie extends Movie{
private boolean has3DEffets;

public SuperActionMovie(int id, String title, double basePrice, boolean has3DEffets){
super(id, title,basePrice);
this.has3DEffets=has3DEffets;
}
public double CalculatePrice(){
if(has3DEffets)
return basePrice+50;
return basePrice;
}

public String toString(){
return super.toString()+" has 3D Effets";
}
}