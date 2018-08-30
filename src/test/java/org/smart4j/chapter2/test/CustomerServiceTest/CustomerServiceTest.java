package org.smart4j.chapter2.test.CustomerServiceTest;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import  java.util.HashMap;
import  java.util.List;
import  java.util.Map;

import javafx.scene.chart.PieChart;
import  org.junit.Assert;
import  org.junit.Before;
import  org.junit.Test;
import org.smart4j.chapter2.helper.DatabaseHelper;
import  org.smart4j.chapter2.model.Customer;
import  org.smart4j.chapter2.service.CustomerService;


/**
 * CustomerService 单元测试
 */
public class CustomerServiceTest {

    private final CustomerService  customerService ;

    public CustomerServiceTest() {
        customerService = new CustomerService() ;
    }

    @Before
    public void init() throws Exception{
//        String file  = "sql/customer_init.sql";
//        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);
//
////        InputStream is = System.in;//键盘输入流
////        InputStreamReader isr = new InputStreamReader(is);//字节流转换为字符流
////        BufferedReader bufr = new BufferedReader(isr);//把字符流添加到缓冲流
//
//        BufferedReader reader =new BufferedReader(new InputStreamReader(is));
//        String sql ;
//        while ((sql = reader.readLine()) != null ) {
//            DatabaseHelper.executeUpdate(sql);
//        }
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer>  customerList = customerService.getCustomerList();
        Assert.assertEquals (2 , customerList.size());
    }
    @Test
    public void getCustomerTest()  throws  Exception {
        long id = 1 ;
        Customer customer  =  customerService.getCustomer(id) ;
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>() ;
        fieldMap.put("name","customer100");
        fieldMap.put("contact","John");
        fieldMap.put("telephone","13512345678");
        boolean result = customerService.createCustomer(fieldMap);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        long id =1 ;
        Map<String , Object> fieldMap = new HashMap<String, Object>() ;
        fieldMap.put("contact","Eric");
        boolean result = customerService.updateCustomer(id ,fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id =1 ;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }

}
