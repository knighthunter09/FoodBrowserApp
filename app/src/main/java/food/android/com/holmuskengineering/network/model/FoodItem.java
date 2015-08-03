
package food.android.com.holmuskengineering.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class FoodItem {

    @SerializedName("_id")
    @Expose
    private String Id;
    @Expose
    private String name;
    @Expose
    private List<Portion> portions = new ArrayList<Portion>();
    @Expose
    private String source;

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    public void setId(String Id) {
        this.Id = Id;
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

    /**
     * 
     * @return
     *     The portions
     */
    public List<Portion> getPortions() {
        return portions;
    }

    /**
     * 
     * @param portions
     *     The portions
     */
    public void setPortions(List<Portion> portions) {
        this.portions = portions;
    }

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", portions=" + portions +
                ", source='" + source + '\'' +
                '}';
    }
}
