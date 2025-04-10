package org.firstspring.course.entities.pk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.firstspring.course.entities.Order;
import org.firstspring.course.entities.Product;

import java.io.Serializable;

@Embeddable
public class OrderItemPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderItemPK() {
    }
    public OrderItemPK(Order order, Product product) {
        this.order = order;
        this.product = product;
    }
    @JsonIgnore
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemPK that = (OrderItemPK) o;
        return getOrder().equals(that.getOrder()) && getProduct().equals(that.getProduct());
    }

    @Override
    public int hashCode() {
        int result = getOrder().hashCode();
        result = 31 * result + getProduct().hashCode();
        return result;
    }
}
