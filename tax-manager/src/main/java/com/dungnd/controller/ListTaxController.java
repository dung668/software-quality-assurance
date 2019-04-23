package com.dungnd.controller;

import com.dungnd.dao.UserTaxDao;
import com.dungnd.dao.impl.UserTaxDaoImpl;
import com.dungnd.model.UserTax;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

@WebServlet(urlPatterns = {"/home", "/list-taxes"})
public class ListTaxController extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        doGet(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        UserTaxDao userTaxDao = new UserTaxDaoImpl();

        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        int prevMonth = (currentMonth == 0) ? 12 : currentMonth;

        List<UserTax> userTaxes = userTaxDao.findUserTaxesByMonth(prevMonth,2016,1);

        request.setAttribute("userTaxes", userTaxes);

        request.getRequestDispatcher("/tax-list.jsp").forward(request,response);

    }
}
