public class UpdateRecipes extends Recipes {

  public void update(String name, String desc) { //metódusával lehessen módosítani a Recipes objektumban tárolt elemeket
        boolean contains = false;
        for (int i = 0; i < super.goodsList.size(); i++) {
            if (super.goodsList.get(i).getName().equals(name)) {
                contains = true;
            }
        }
        if (!contains) {
            super.goodsList.add(new Goods(name, desc));
        }
    }

    public void addGoods(Goods goods) {
        boolean contains = false;
        for (int i = 0; i < super.goodsList.size(); i++) {
            if (super.goodsList.get(i).getName().equals(goods.getName())) {
                contains = true;
            }
        }
        if (!contains) {
            super.goodsList.add(new Goods(goods.getName(), goods.getDesc()));
        }
    }
/*
    public void addGoods2(Goods goods) {
        boolean contains = false;
        for (int i = 0; i < super.goodsList.size(); i++) {
            if (super.goodsList.get(i) == goods) {
                contains = true;
            }
        }
        if (!contains) {
            super.goodsList.add(goods);
        }

    }*/
}