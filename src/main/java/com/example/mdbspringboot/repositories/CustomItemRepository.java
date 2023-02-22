package com.example.mdbspringboot.repositories;

public interface CustomItemRepository {
    
    void updateItemQuantity(String name, float newQuantity);
}
