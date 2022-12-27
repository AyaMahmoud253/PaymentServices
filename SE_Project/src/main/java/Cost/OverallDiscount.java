package Cost;
import Services.Services;
class OverallDiscount extends Discount
{
	OverallDiscount(Discount discountModel,Services service)
 {
  this.discountModel = discountModel;
  this.service=service;
 }
}
/*public class OverallDiscount extends Discount{
    Cost pay;
    double m;
    public OverallDiscount(Cost pay) {
        this.pay = pay;
    }

    public double  calc_cost(double a,Services s ){
        m=pay.calc_cost(a,s);
      return a-(0.1*a);
        
    }
    public double  getcost() {return m;}
    
}*/
