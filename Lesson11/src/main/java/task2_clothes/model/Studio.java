package task2_clothes.model;

public class Studio {

    public void dressMan(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof MenClothes) {
                MenClothes menClothes = (MenClothes) clothe;
                menClothes.dressMan();
                System.out.println(menClothes + clothe.getSize().getDescription());
            }
        }
    }


    public void dressWomen(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                WomenClothes womenClothes = (WomenClothes) clothe;
                womenClothes.dressWomen();
                System.out.println(womenClothes + clothe.getSize().getDescription());
            }
        }
    }
}
