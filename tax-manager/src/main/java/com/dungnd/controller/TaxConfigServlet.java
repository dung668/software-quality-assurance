package com.dungnd.controller;

import com.dungnd.dao.TaxConfigDao;
import com.dungnd.dao.impl.TaxConfigDaoImpl;
import com.dungnd.model.TaxConfig;
import com.dungnd.util.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/tax-config"})
public class TaxConfigServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer banThan = Integer.valueOf(request.getParameter("banThan"));
        Integer phuThuoc = Integer.valueOf(request.getParameter("phuThuoc"));
        Integer tienAn = Integer.valueOf(request.getParameter("tienAn"));

        TaxConfig taxConfig = new TaxConfig(null, banThan, phuThuoc, tienAn);

        TaxConfigDao taxConfigDao = new TaxConfigDaoImpl();
        
        if(taxConfig.equals(taxConfigDao.getTaxConfig())) {
        	response.sendRedirect("tax-config");
        	return;
        }
        
        if(taxConfigDao.editTax(taxConfig, DBConnection.getCon()))
        	request.setAttribute("mess", "success");
        
        request.setAttribute("taxConfig", taxConfig);
        request.getRequestDispatcher("/tax-config.jsp").forward(request, response);;

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        TaxConfigDao taxConfigDao = new TaxConfigDaoImpl();
        TaxConfig taxConfig = taxConfigDao.getTaxConfig();

        request.setAttribute("taxConfig", taxConfig);
        request.getRequestDispatcher("/tax-config.jsp").forward(request, response);


    }
}
