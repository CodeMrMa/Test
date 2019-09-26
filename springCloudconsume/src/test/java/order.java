import java.io.Serializable;

/**
 * Created by Administrator on 2019/9/19.
 */
public class order implements Serializable{
    private String orderId;
    private String orederCreTime;
    private String money;
    public order( String orderId,String orederCreTime,String money){
        this.orderId = orderId;
        this.orederCreTime = orederCreTime;
        this.money = money;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrederCreTime() {
        return orederCreTime;
    }

    public void setOrederCreTime(String orederCreTime) {
        this.orederCreTime = orederCreTime;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
