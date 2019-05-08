package com.dungnd.dao;

import java.sql.Connection;

import com.dungnd.model.TaxConfig;

public interface TaxConfigDao {

    boolean editTax(TaxConfig taxConfig, Connection conn);

    TaxConfig getTaxConfig();

}
