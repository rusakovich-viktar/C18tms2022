package by.tms.onlinestore.repository.impl;

import by.tms.onlinestore.model.Category;
import by.tms.onlinestore.repository.CategoryRepository;
import by.tms.onlinestore.utils.CategoryHelper;

import java.util.List;

public class StaticCategoryRepositoryImpl implements CategoryRepository {

    @Override
    public List<Category> getCategories() {
        return CategoryHelper.categories;
    }

    @Override
    public Category getCategory(int id) { //3
        List<Category> categories = getCategories();
        // 1 холодильник &&&&
        // 2 мобильники 3333
        // 3 навигаторы 33344
//        for (int i = 0; i < categories.size(); i++) {//0 1 2 ...
//            Category category = categories.get(i);
//            if (category.getId() == id) {
//                return category;
//            }
//        }

        return categories.stream()
                .filter(category -> category.getId() == id)
                .findFirst()
                .orElse(null);
    }
}

//page -> servlet -> service -> repository


//            List<User> users = userService.findUsersLoginPasswordAndPutAllInList();
//            for (User user : users) {
//                if (user.getUsername().equals(login) && user.getPassword().equals(pass)) {
//                    UserDto userDto = new UserDto(user.getUsername());
//                    Cart cart = new Cart();
//                    session.setAttribute("cart", cart);
//                    session.setAttribute("username", login);
//                    request.getRequestDispatcher("home").forward(request, response);
//                    break;
//                }
//            }
