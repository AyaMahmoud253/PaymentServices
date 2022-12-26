package Cost;
import Services.Services;
public class SpecificDiscount extends Discount{
    Cost payement;
    double m;
    public SpecificDiscount(Cost pay) {
        this.payement = pay;
    }

    public double  calc_cost(double a,Services s ){
        m=payement.calc_cost(a,s);

        return  a-(0.2*a);
    }
    public double  getcost() {return m;}
}