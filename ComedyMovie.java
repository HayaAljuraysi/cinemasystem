public class ComedyMovie extends Movie{
private int Comedylevel;

public ComedyMovie(int id, String title, double basePrice,int Comedylevel){
super(id,title,basePrice);
this.Comedylevel=Comedylevel;
}

public double CalculatePrice(){
if(Comedylevel==2)
return basePrice+5;
else
if(Comedylevel==3)
return basePrice+10;

return basePrice;
}

public String toString(){
return super.toString()+" Comedy level "+Comedylevel+"\n";
}
}


