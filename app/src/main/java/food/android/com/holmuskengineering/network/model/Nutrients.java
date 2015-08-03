
package food.android.com.holmuskengineering.network.model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Nutrients {

    @Expose
    private List<Object> unhandled = new ArrayList<Object>();
    @Expose
    private Extra extra;
    @Expose
    private Important important;

    /**
     * 
     * @return
     *     The unhandled
     */
    public List<Object> getUnhandled() {
        return unhandled;
    }

    /**
     * 
     * @param unhandled
     *     The unhandled
     */
    public void setUnhandled(List<Object> unhandled) {
        this.unhandled = unhandled;
    }

    /**
     * 
     * @return
     *     The extra
     */
    public Extra getExtra() {
        return extra;
    }

    /**
     * 
     * @param extra
     *     The extra
     */
    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    /**
     * 
     * @return
     *     The important
     */
    public Important getImportant() {
        return important;
    }

    /**
     * 
     * @param important
     *     The important
     */
    public void setImportant(Important important) {
        this.important = important;
    }

    @Override
    public String toString() {
        return "Nutrients{" +
                "unhandled=" + unhandled +
                ", extra=" + extra +
                ", important=" + important +
                '}';
    }
}
