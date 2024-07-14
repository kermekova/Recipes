package com.geeks.recipes;

public class Item {
    private String name;
    private String recipe;
    private String image;

    public Item(String name, String recipe, String image) {
        this.name = name;
        this.recipe = recipe;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
