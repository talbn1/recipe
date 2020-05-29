package com.talbn1.recipe.domain;


import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recipe recipe;
    private String recopeNotes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecopeNotes() {
        return recopeNotes;
    }

    public void setRecopeNotes(String recopeNotes) {
        this.recopeNotes = recopeNotes;
    }
}
