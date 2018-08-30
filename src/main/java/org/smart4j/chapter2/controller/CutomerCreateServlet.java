package org.smart4j.chapter2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;



/**
 * 创建客户
 */
@WebServlet("/customer_create")
public class CutomerCreateServlet extends HttpServlet{

    /**
     * 进入创建用户界面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        //TODO
    }

    /**
     * 处理 创建客户 请求
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        //TODO
    }
}
