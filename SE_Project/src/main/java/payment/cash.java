package payment;
import com.uniProject.SE_Project.UsersModel;
import com.uniProject.SE_Project.Response;

public class cash implements ordinaryPayment {
	Response R; 

	@Override
	public String  Pay(double amo,UsersModel user) {
		R.setMessage("you pay cash ");
		
		return R.getMessage();
	}
	

}
