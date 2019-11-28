package com.blbz.InventoryDataManagement.service;

public interface Service {
public void add(String item,String name,int price,int weight);
public long calculateInventory(String item);

}


