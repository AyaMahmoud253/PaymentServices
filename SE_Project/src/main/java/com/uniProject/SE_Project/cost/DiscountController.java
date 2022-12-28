//package com.uniProject.SE_Project.cost;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.uniProject.SE_Project.user.UsersModel;
//import com.uniProject.SE_Project.user.logic;
//import com.uniProject.SE_Project.user.Repo;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.uniProject.SE_Project.user.UsersModel;
//import com.uniProject.SE_Project.user.logic;
//
//import jakarta.websocket.server.PathParam;
//
//import com.uniProject.SE_Project.user.Repo;
//import com.uniProject.SE_Project.user.controller;
//import com.uniProject.SE_Project.payment.credit;
//import com.uniProject.SE_Project.payment.cash;
//import java.util.List;
//import com.uniProject.SE_Project.Services.Services;
//import com.uniProject.SE_Project.cost.DiscountView;
//@RestController
//public class DiscountController
//{
//
//    //private Repo DRepository;
//    Discount model;
//    DiscountView view;
//
////    public DiscountController(Discount model, DiscountView view)
////    {
////        this.model = model;
////        this.view = view;
////    }
//
//    public void setDiscount(Discount discountModel){
//        model.setdiscountModel(discountModel);
//     }
//
//    @RequestMapping(value = "/setamount", method = RequestMethod.POST)
//    public void setOverallamount(@PathParam ("amount") double amount){
//    	amount=model.getamount()-(0.1*model.getamount());
//        model.setamount(amount);
//     }
//    /*public void Setdis(Discount D_record)
//    {
//        DRepository.save(D_record);
//    }*/
//    public void setSpecificamount(double amount){
//    	amount=model.getamount()-(0.2*model.getamount());
//        model.setamount(amount);
//     }
//    public void setSpecificOverallamount(double amount){
//    	amount=model.getamount()-(0.3*model.getamount());
//        model.setamount(amount);
//     }
//    //@RequestMapping(value = "/getamount", method = RequestMethod.GET)
//    @GetMapping("/m/{id}")
//    @ResponseBody
//    public double getamount(){
//    	double am=  model.getamount()-(0.1*model.getamount());
//    	model.setamount(am);
//        return model.getamount();
//    	//return id;
//     }
//    /*public double calccost( ){
//      return model.amount-(0.1*model.amount);
//    }*/
//    public static void main(String[] args) throws Exception {
//        //SpringApplication.run(Functions.class, args);
//   }
//    public void updateView()
//    {
//        view.printStudentDetails(model.getamount());
//    }
//}
//
