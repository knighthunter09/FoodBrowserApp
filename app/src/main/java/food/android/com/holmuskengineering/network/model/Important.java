
package food.android.com.holmuskengineering.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Important {

    @Expose
    private Constituent monounsaturated;
    @Expose
    private Constituent cholesterol;
    @Expose
    private Constituent calories;
    @Expose
    private Constituent saturated;
    @SerializedName("dietary_fibre")
    @Expose
    private Constituent dietaryFibre;
    @Expose
    private Constituent sugar;
    @Expose
    private Constituent potassium;
    @SerializedName("total_fats")
    @Expose
    private Constituent totalFats;
    @Expose
    private Constituent trans;
    @SerializedName("total_carbs")
    @Expose
    private Constituent totalCarbs;
    @Expose
    private Constituent protein;
    @Expose
    private Constituent sodium;
    @Expose
    private Constituent polyunsaturated;

    /**
     * 
     * @return
     *     The monounsaturated
     */
    public Constituent getMonounsaturated() {
        return monounsaturated;
    }

    /**
     * 
     * @param monounsaturated
     *     The monounsaturated
     */
    public void setMonounsaturated(Constituent monounsaturated) {
        this.monounsaturated = monounsaturated;
    }

    /**
     * 
     * @return
     *     The cholesterol
     */
    public Constituent getCholesterol() {
        return cholesterol;
    }

    /**
     * 
     * @param cholesterol
     *     The cholesterol
     */
    public void setCholesterol(Constituent cholesterol) {
        this.cholesterol = cholesterol;
    }

    /**
     * 
     * @return
     *     The calories
     */
    public Constituent getCalories() {
        return calories;
    }

    /**
     * 
     * @param calories
     *     The calories
     */
    public void setCalories(Constituent calories) {
        this.calories = calories;
    }

    /**
     * 
     * @return
     *     The saturated
     */
    public Constituent getSaturated() {
        return saturated;
    }

    /**
     * 
     * @param saturated
     *     The saturated
     */
    public void setSaturated(Constituent saturated) {
        this.saturated = saturated;
    }

    /**
     * 
     * @return
     *     The dietaryFibre
     */
    public Constituent getDietaryFibre() {
        return dietaryFibre;
    }

    /**
     * 
     * @param dietaryFibre
     *     The dietary_fibre
     */
    public void setDietaryFibre(Constituent dietaryFibre) {
        this.dietaryFibre = dietaryFibre;
    }

    /**
     * 
     * @return
     *     The sugar
     */
    public Constituent getSugar() {
        return sugar;
    }

    /**
     * 
     * @param sugar
     *     The sugar
     */
    public void setSugar(Constituent sugar) {
        this.sugar = sugar;
    }

    /**
     * 
     * @return
     *     The potassium
     */
    public Constituent getPotassium() {
        return potassium;
    }

    /**
     * 
     * @param potassium
     *     The potassium
     */
    public void setPotassium(Constituent potassium) {
        this.potassium = potassium;
    }

    /**
     * 
     * @return
     *     The totalFats
     */
    public Constituent getTotalFats() {
        return totalFats;
    }

    /**
     * 
     * @param totalFats
     *     The total_fats
     */
    public void setTotalFats(Constituent totalFats) {
        this.totalFats = totalFats;
    }

    /**
     * 
     * @return
     *     The trans
     */
    public Object getTrans() {
        return trans;
    }

    /**
     * 
     * @param trans
     *     The trans
     */
    public void setTrans(Constituent trans) {
        this.trans = trans;
    }

    /**
     * 
     * @return
     *     The totalCarbs
     */
    public Constituent getTotalCarbs() {
        return totalCarbs;
    }

    /**
     * 
     * @param totalCarbs
     *     The total_carbs
     */
    public void setTotalCarbs(Constituent totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    /**
     * 
     * @return
     *     The protein
     */
    public Constituent getProtein() {
        return protein;
    }

    /**
     * 
     * @param protein
     *     The protein
     */
    public void setProtein(Constituent protein) {
        this.protein = protein;
    }

    /**
     * 
     * @return
     *     The sodium
     */
    public Constituent getSodium() {
        return sodium;
    }

    /**
     * 
     * @param sodium
     *     The sodium
     */
    public void setSodium(Constituent sodium) {
        this.sodium = sodium;
    }

    /**
     * 
     * @return
     *     The polyunsaturated
     */
    public Constituent getPolyunsaturated() {
        return polyunsaturated;
    }

    /**
     * 
     * @param polyunsaturated
     *     The polyunsaturated
     */
    public void setPolyunsaturated(Constituent polyunsaturated) {
        this.polyunsaturated = polyunsaturated;
    }

    @Override
    public String toString() {
        return "Important{" +
                "monounsaturated=" + monounsaturated +
                ", cholesterol=" + cholesterol +
                ", calories=" + calories +
                ", saturated=" + saturated +
                ", dietaryFibre=" + dietaryFibre +
                ", sugar=" + sugar +
                ", potassium=" + potassium +
                ", totalFats=" + totalFats +
                ", trans=" + trans +
                ", totalCarbs=" + totalCarbs +
                ", protein=" + protein +
                ", sodium=" + sodium +
                ", polyunsaturated=" + polyunsaturated +
                '}';
    }
}
