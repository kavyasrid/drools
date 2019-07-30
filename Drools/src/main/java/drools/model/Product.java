package drools.model;
import drools.enums.TypeEnum;
/**
 * Created by kavya on 2/23/17.
 */
public class Product {
    private final TypeEnum typeEnum;
    private String productName;

    public Product(TypeEnum typeEnum) {
        this.typeEnum = typeEnum;
        productName = typeEnum.getSomeOutputString();
    }

    public TypeEnum getTypeEnum() {
        return typeEnum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
