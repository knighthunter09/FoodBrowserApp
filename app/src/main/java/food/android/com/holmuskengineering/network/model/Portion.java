
package food.android.com.holmuskengineering.network.model;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Portion {

    @Expose
    private Nutrients nutrients;
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The nutrients
     */
    public Nutrients getNutrients() {
        return nutrients;
    }

    /**
     * 
     * @param nutrients
     *     The nutrients
     */
    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Portion{" +
                "nutrients=" + nutrients +
                ", name='" + name + '\'' +
                '}';
    }
}
