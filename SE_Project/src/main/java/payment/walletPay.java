package payment;
import com.uniProject.SE_Project.UsersModel;
import com.uniProject.SE_Project.Response;
public class walletPay implements ordinaryPayment {

	Response R;
	

	
	@Override
	public String Pay(double amo,UsersModel user) {
		double walletcredit =user.getWalletAmount();
        if (walletcredit>amo) {
            double newWalletAmount = walletcredit - amo;
            user.setWalletAmount(newWalletAmount);
            R.setMessage("you paid"+amo);
        }
        else {
        	R.setMessage("Not Enough Money in your Wallet");
        }
		return R.getMessage();
	}

}
