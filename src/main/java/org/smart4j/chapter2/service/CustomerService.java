package org.smart4j.chapter2.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;
import org.apache.log4j.Logger;
import org.smart4j.chapter2.helper.DatabaseHelper;

public class CustomerService {



//    private static final String DRIVER;
//    private static final String URL;
//    private static final String USERNAME;
//    private static final String PASSWORD;
    private static final Logger LOGGER = Logger.getLogger(CustomerService.class);



//    static {
//        Properties conf = PropsUtil.loadProps("config.properties");
//        DRIVER = conf.getProperty("jdbc.driver");
//        URL = conf.getProperty("jdbc.url");
//        USERNAME = conf.getProperty("jdbc.username");
//        PASSWstaORD = conf.getProperty("jdbc.password");
//
//        try {
//            Class.forName(DRIVER);
//        }catch (ClassNotFoundException e) {
//            LOGGER.error("can not load jdbc driver",e );
//        }
//    }

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList () {
//        Connection conn = null ;
        Connection conn = DatabaseHelper.getConnection();
        try{
//            List<Customer> customerList = new ArrayList<Customer>();
            String sql = "SELECT * FROM CUSTOMER";
//            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);


//            conn = DatabaseHelper.getConnection();
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            ResultSet rs = stmt.executeQuery();
//            while(rs.next()) {
//                Customer customer = new Customer() ;
//                customer.setId(rs.getLong("id"));
//                customer.setName(rs.getString("name"));
//                customer.setContact(rs.getString("contact"));
//                customer.setEmail(rs.getString("email"));
//                customer.setTelephone(rs.getString("telephone"));
//                customer.setRemark(rs.getString("remark"));
//                customerList.add(customer);
//                return customerList;
//            }
            return DatabaseHelper.queryEntityList(Customer.class,sql);



//        }catch (SQLException e) {
//            LOGGER.error("execute sql failure" ,e );

        }


        finally {
//            if(conn != null);
//            try {
//                conn.close();
//            }catch (SQLException e) {
//                LOGGER.error("close connection failure" ,e);
//            }
//            DatabaseHelper.closeConnection();
          }
//        return null;
       }
    /**
     * 获取客户
     */
    public  Customer  getCustomer (Long id ) {
        //TODO
        return null;
    }

    /**
     * 创建客户
     */
    public  boolean  createCustomer (Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     * 更新客户
     */
    public  boolean  updateCustomer (Long id ,Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }
    /**
     * 删除客户
     */
    public  boolean  deleteCustomer (Long id ) {
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}
