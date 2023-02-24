package by.tms.service;

import by.tms.Product;

import java.util.List;

public interface ServiceStoreAware {
    //        * методы:
//        * • добавить товар(принимает объект товара и добавляет его в список
//        * товаров). При попытке добавить товар с id уже существующем в списке,
//        * вставка производится не должна
//        * • получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в
//        * магазине)
//        * • удалить товар (метод принимает id товара и удаляет из списка товар с
//        * соответствующим id)
//        * • редактировать товар(принимает объект товара и редактирует им список
//        * товаров)
    boolean add(Product product);

    boolean remove(Product product);

    void edit(long id, Product product);

    List<Product> getAll();
}