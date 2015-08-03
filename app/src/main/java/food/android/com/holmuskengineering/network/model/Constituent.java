
package food.android.com.holmuskengineering.network.model;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Constituent {

    @Expose
    private String unit;
    @Expose
    private Double value;

    /**
     * 
     * @return
     *     The unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 
     * @return
     *     The value
     */
    public Double getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Constituent{" +
                "unit='" + unit + '\'' +
                ", value=" + value +
                '}';
    }
}
