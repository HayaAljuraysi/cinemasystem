public class ActionMovie extends Movie{
private int actionlevel;

public ActionMovie(int id , String title, double basePrice, int actionlevel){
super(id,title,basePrice);
this.actionlevel=actionlevel;
}
public double CalculatePrice(){
if(actionlevel==2)
return basePrice+5;
else
if(actionlevel==3)
return basePrice+10;

return basePrice;
}

public String toString(){
return super.toString()+" Action level: "+actionlevel+"\n";
}
}
