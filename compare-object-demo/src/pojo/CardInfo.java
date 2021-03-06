package pojo;

import annotation.ApiModelProperty;

import java.util.Date;

/**
 * @author RongTongXin
 * @version 1.0
 */
public class CardInfo {

    private Integer id;
    @ApiModelProperty("银行卡号")

    private String bankNo;
    @ApiModelProperty("存款金额")

    private Double money;
    @ApiModelProperty("开卡日期")

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "CardInfo [id=" + id + ", bankNo=" + bankNo + ", money=" + money + ", createDate=" + createDate + "]";
    }

    public CardInfo() {
    }

    public CardInfo(Integer id, String bankNo, Double money, Date createDate) {
        this.id = id;
        this.bankNo = bankNo;
        this.money = money;
        this.createDate = createDate;
    }
}
