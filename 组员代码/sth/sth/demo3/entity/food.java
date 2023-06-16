package com.example.demo3.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;

@Entity
@Table(name = "food")
public class food {
    public double cos;
    @Id
    @Column
    public int id;
    @Basic
    @Column(name = "name")
    public String name;
    private String description;
    private String canteen;
    @Basic
    @Column(name = "location")
    public int location;//1-7表示餐厅位置，0表示校外，8表示玉兰苑，9表示哈乐
    @Basic
    @Column(name = "price")
    public int price;//价格
    @Basic
    @Column(name = "hot")
    public int hot;//热度
    @Basic
    @Column(name = "photo")
    public String photo;
    @Basic
    @Column(name = "type")
    public int type;//value: 1 '面食',2,'香锅',3,'自选菜',4,'铁板',5,'木桶饭',6,'其他'
    // features 价格，油腻度，饱腹程度，菜品分类，口味，营养价值（我也不知道怎么区分）
    //public double[] feature;

    @Basic
    @Column(name = "taste")
    public int taste;//1-5,甜，微辣，辣,普通

    public int getType() {
        return type;
    }

    public int getTaste() {
        return taste;
    }

    public double getCos() {
        return cos;
    }

    public void setCos(double cos) {
        this.cos = cos;
    }

    public void setTaste(int taste) {
        this.taste = taste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    public void setType(int type) {
        this.type = type;
    }

    public food(){
        /*feature=new double[7];
        feature[0]=(price*100.0/40);//价格
        feature[1]=(location*10.0);//位置
        feature[2]=
*/

    }
}
