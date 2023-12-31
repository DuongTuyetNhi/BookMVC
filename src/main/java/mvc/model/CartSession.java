package mvc.model;

import mvc.entity.ProductEntity;



public class CartSession {
    private ProductEntity productEntity;
    private int quantity;

    public CartSession(ProductEntity productEntity, int quantity) {
        this.productEntity = productEntity;
        this.quantity = quantity;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
