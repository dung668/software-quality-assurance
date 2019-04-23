package com.dungnd.dao;

import com.dungnd.model.UserTax;

import java.util.List;

public interface UserTaxDao {

    List<UserTax> findUserTaxesByMonth(int month, int year, int command);

}
