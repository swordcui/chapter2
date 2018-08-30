package org.smart4j.chapter2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;



/**
 * 编辑客户
 */
@WebServlet("/customer_edit")

public class CustomerEditServlet extends HttpServlet{

    @Override
    protected long getLastModified(HttpServletRequest req) {
        return super.getLastModified(req);
    }
}
