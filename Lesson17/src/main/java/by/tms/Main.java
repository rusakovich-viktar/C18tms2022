package by.tms;

import by.tms.model.Product;
import by.tms.model.Store;
import by.tms.service.ServiceStore;
import by.tms.service.ServiceStoreAware;

public class Main {
    public static void main(String[] args) {
        ServiceStoreAware serviceStore = new ServiceStore(new Store());
        serviceStore.add(new Product(1L, "Хлебушек", 200));
        serviceStore.add(new Product(3L, "Творог", 150));
        serviceStore.add(new Product(4L, "Кофе", 1000));
        serviceStore.add(new Product(6L, "Филе куриное", 10500));

        serviceStore.getAll();
    }
}
