package payment;
import com.uniProject.SE_Project.UsersModel;
import com.uniProject.SE_Project.Response;

public class credit implements ordinaryPayment {

	Response R; 
	private double limit=900000;
	 
	public String  Pay(double amo,UsersModel user) {
		double result =limit-amo;
		R.setMessage("you paid amount"+amo +"your new balance"+result);
		
		return R.getMessage(); 
	}

    public void setLimit(double r) {
        limit=r;
    }
    public double getLimit() {
        return limit;
    }
}
