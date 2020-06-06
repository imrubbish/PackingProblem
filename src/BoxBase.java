/**
 * 长方体基类
 */
public class BoxBase {

    /**
     * 长
     */
    private Integer length;

    /**
     * 宽
     */
    private Integer wieth;

    /**
     * 高
     */
    private Integer height;

    /**
     * 重量
     */
    private Integer weight;

    public BoxBase() {
    }

    public BoxBase(Integer length, Integer wieth, Integer height, Integer weight) {
        this.length = length;
        this.wieth = wieth;
        this.height = height;
        this.weight = weight;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWieth() {
        return wieth;
    }

    public void setWieth(Integer wieth) {
        this.wieth = wieth;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BoxBase{" +
                "length=" + length +
                ", wieth=" + wieth +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
