package payment;
import com.uniProject.SE_Project.UsersModel;
import com.uniProject.SE_Project.controller;
public class creditcardInfo {

	String CardNumber;
	String Password;
	UsersModel user; 
	double AmountInCard;
	public creditcardInfo(String c,String pas,UsersModel u,double amount ) {
		CardNumber=c; 
		Password=pas;
		user=u;
		AmountInCard=amount;
	}
	
	
}
