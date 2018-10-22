package com;
import com.repository.*;
import com.entity.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    private  ItemListRepository itemListRepository;
    private  ItemDetailRepository itemDetailRepository;
    private  CategoryRepository categoryRepository;
    private  CustomerRepository customerRepository;
 
    @Autowired
    public DataLoader(ItemListRepository itemListRepository, ItemDetailRepository itemDetailRepository, CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.itemListRepository = itemListRepository;
        this.itemDetailRepository = itemDetailRepository;
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
       
    }



    @Override
    public void run(ApplicationArguments args) throws Exception {


        //ItemList
 //  this.itemListRepository.save(new ItemList(itemDetail, category, customer))

       // Item Detail String item_name,Integer price,String ItemDescription,String image
      this.itemDetailRepository.save(new ItemDetail("สร้อยคอประดับเพชร", 150000,
       "สร้อยคอประดับเพชร อายุ80ปี ซึ่งอดีตเคยเป็นของหม่อมราชวงศ์ท่านหนึ่ง","PC051315_2017_12_13_15_30_53"));
      

    // Category String category_name
        this.categoryRepository.save(new Category("Picture"));
        this.categoryRepository.save(new Category("Car"));
        this.categoryRepository.save(new Category("Old book"));
     //Customer String customer_name, String username, String password, Long address_id, String birthday,
            //String gender, String email, String phonenumber
         this.customerRepository.save(new Customer("John","John-App","1234","1.06.39",
         "male","John_app@hotmail.com","0879583674"));
         this.customerRepository.save(new Customer("Boling","Boling-App","5678","18.04.40",
         "female","Boling_app@hotmail.com","0659849900"));
         

       
       //test load data in ItemList
        //ItemDetail p  = this.itemDetailRepository.findByItemDetailId(1L);  //find id =  1   
        //Category t =  this.categoryRepository.findByCategoryId(1L);  //find id =  1 
        Customer u = this.customerRepository.findByCustomerId(1L);  //find id =  1 
     
    /*
        ItemDetail p2  = this.itemDetailRepository.findByItemId(2L);  //find id =  1   
        Category t2 =  this.categoryRepository.findByCategoryId(2L);  //find id =  1 
        Customer u2 = this.customerRepository.findByCustomerId(2L);  //find id =  1 

        ItemDetail p3  = this.itemDetailRepository.findByItemDetailId(3L);  //find id =  1   
        Category t3 =  this.categoryRepository.findByCategoryId(3L);  //find id =  1 
        Customer u3 = this.customerRepository.findByCustomerId(3L);  //find id =  1 
        //save billOfLa 
        this.itemListRepository.save(new ItemList());
        this.itemListRepository.save(new ItemList());
        this.itemListRepository.save(new ItemList());
        */

    
    }
    
}
