package com.example.apprecipesmeal.model;

import com.google.gson.annotations.SerializedName;

public class Meal {


    /**
     * id : 2
     * name : Brie wrapped in prosciutto & brioche
     * image : apimeal/images/briewrappedinprosciuttobrioche.jpg
     * youtube : https://www.youtube.com/watch?v=FzNPPD8lbWg
     * instruction : Mix the flour, 1 tsp salt, caster sugar, yeast, milk and eggs together in a mixer using the dough attachment for 5 mins until the dough is smooth. Add the butter and mix for a further 4 mins on medium speed. Scrape the dough bowl and mix again for 1 min. Place the dough in a container, cover with cling film and leave in the fridge for at least 6 hrs before using.\\r\\nWrap the Brie in the prosciutto and set aside. Turn out the dough onto a lightly floured surface. Roll into a 25cm circle. Place the wrapped Brie in the middle of the circle and fold the edges in neatly. Put the parcel onto a baking tray lined with baking parchment and brush with beaten egg. Chill in the fridge for 30 mins, then brush again with beaten egg and chill for a further 30 mins. Leave to rise for 1 hr at room temperature. Heat oven to 200C/180C fan/gas 6, then bake for 22 mins. Serve warm.
     * calo : 687
     * ingredient : 375g Plain Flour.\r\n50g Caster Sugar.\r\n7g Yeast.\r\n75g Milk.\r\n3 Large Eggs.\r\nTo Glaze Eggs.\r\n180g Butter.\r\n250g Brie.\r\n8 slices Prosciutto.\r\n
     * carbo : 78
     * protein : 23
     */

    private String id;
    private String name;
    private String image;
    private String youtube;
    private String instruction;
    private String calo;
    private String ingredient;
    private String carbo;
    private String protein;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getCalo() {
        return calo;
    }

    public void setCalo(String calo) {
        this.calo = calo;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getCarbo() {
        return carbo;
    }

    public void setCarbo(String carbo) {
        this.carbo = carbo;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }
}
