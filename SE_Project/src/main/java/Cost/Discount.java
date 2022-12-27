package Cost;
import Services.Services;
import jakarta.persistence.Entity;
@Entity
public class Discount {
	protected Discount discountModel;
	protected Services service;
	protected double amount;
	public double getamount() 
    {
        return amount;
    }
     
    public void setamount(double amount) 
    {
        this.amount = amount;
    }
    public Discount getdiscountModel() 
    {
        return discountModel;
    }
    public void setService(Services service) 
    {
        this.service =  service;
    }
    public Services getService() 
    {
        return service;
    }
    public void setdiscountModel(Discount discountModel) 
    {
        this.discountModel = discountModel;
    }
     
     
	 //abstract public double  calc_cost(double a,Services s );
	 //abstract public double  getcost();

}
/*abstract class ModalWindowModel
{
  protected ModalWindowModel modalWindowModel; //This can be any class implementing/derived from ModalWindowModel
}*/
