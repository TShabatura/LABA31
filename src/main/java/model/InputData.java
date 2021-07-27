package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InputData {
    private String groupOfThings;
    private String producer;
    private int totalAmount;

    public InputData() {
    }

    public InputData(String groupOfThings, String producer, int totalAmount) {
        this.groupOfThings = groupOfThings;
        this.producer = producer;
        this.totalAmount = totalAmount;
    }
    @XmlElement
    public String getGroupOfThings() {
        return groupOfThings;
    }
    public void setGroupOfThings(String groupOfThings) {
        this.groupOfThings = groupOfThings;
    }

    @XmlElement
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }

    @XmlElement
    public int getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
