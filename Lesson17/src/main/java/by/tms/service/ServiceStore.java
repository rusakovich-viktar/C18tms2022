package by.tms.service;

import by.tms.Product;
import by.tms.Store;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ServiceStore implements ServiceStoreAware {

    private Store store;

    @Override
    public boolean add(Product product) {
        if (!store.getProducts().contains(product)) {
            return store.getProducts().add(product);
        }
        return false;
    }

    @Override
    public boolean remove(Product product) {
//        Iterator<Product> iterator = store.getProducts().iterator();
//        while (iterator.hasNext()) {
//            Product productForDelete = iterator.next();
//            if (productForDelete.equals(product)) {
//                iterator.remove();
//                return true;
//            }
//        }
//        return false;
        return store.getProducts().removeIf(p -> p.equals(product));
    }

    @Override
    public void edit(long id, Product product) {

        for (Product storeProduct : store.getProducts()) {
            if (storeProduct.getId() == id) {
                modify(product, storeProduct);
                break;
            }
        }
//        Optional<Product> first = store.getProducts().stream()
//                .filter(storeProduct -> storeProduct.getId() == id)
//                .findFirst();
//        if (first.isPresent()) {
//            Product resultProduct = first.get();
//            resultProduct.setName(product.getName());
//        }

        store.getProducts().stream()
                .filter(storeProduct -> storeProduct.getId() == id)
                .findFirst()
                .ifPresent(resultProduct -> modify(product, resultProduct));
    }

    private void modify(Product expected, Product actual) {
        expected.setName(actual.getName());
    }

    @Override
    public List<Product> getAll() {
        return store.getProducts();
    }

}