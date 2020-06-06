/**
 * 货柜类
 */
public class Container extends BoxBase {

    /**
     * 货柜名
     */
    private String name;

    public Container() {
    }

    public Container(Integer length, Integer wieth, Integer height, Integer weight, String name) {
        super(length, wieth, height, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
