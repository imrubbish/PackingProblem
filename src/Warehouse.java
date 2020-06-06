/**
 *货仓类
 */
public class Warehouse extends BoxBase {

    /**
     * 货仓名
     */
    private String name;

    /**
     * 剩余宽度
     */
    private Integer widthRemain;

    /**
     * 剩余高度
     */
    private Integer heightRemain;

    public Warehouse() {
    }

    public Warehouse(Integer length, Integer wieth, Integer height, Integer weight, String name, Integer widthRemain, Integer heightRemain) {
        super(length, wieth, height, weight);
        this.name = name;
        this.widthRemain = widthRemain;
        this.heightRemain = heightRemain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWidthRemain() {
        return widthRemain;
    }

    public void setWidthRemain(Integer widthRemain) {
        this.widthRemain = widthRemain;
    }

    public Integer getHeightRemain() {
        return heightRemain;
    }

    public void setHeightRemain(Integer heightRemain) {
        this.heightRemain = heightRemain;
    }
}
