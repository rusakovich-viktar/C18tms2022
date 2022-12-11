package task2_clothes.service;

import task2_clothes.model.*;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[3]; // ничего не понятно, но очень инетерсно)
        {
            clothes[0] = new Tie(Size.XL, 500, "white");
        }
        {
            clothes[1] = new Skirt(Size.L, 100, "black");
        }
        {
            clothes[2] = new TShirt(Size.XXS, 200, "red");
        }
        Studio studio = new Studio();
        studio.dressMan(clothes);
        System.out.println("==========");
        studio.dressWomen(clothes);
    }
}
