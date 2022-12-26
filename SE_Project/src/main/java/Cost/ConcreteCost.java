package Cost;
import Services.Services;
public class ConcreteCost extends Cost{
	   
    double y;
    @Override
    public double calc_cost(double a, Services s) {
    	y=a;
        return a;
    }

    @Override
    public double getcost() {
        return y;
    }
}
