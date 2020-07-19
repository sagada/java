package com.study.out.StandardInter;

import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;

public class FunctionInterFace {
    public static void main(String[] args) {

        Function<Product, Result> productFunction = p ->
                new Result(p.getProductName() + "의 가격 : " + p.getPrice());
        Result ret = productFunction.apply(new Product(100000, "장갑"));
        System.out.println(ret.getProductInfo());
        System.out.println();

        System.out.println("ToIntFunction 테스트 ");
        ToIntFunction<Product> t = Product::getPrice;
        System.out.println(t.applyAsInt(new Product(1000000,"컴퓨터")));
        System.out.println();

        ToLongBiFunction<Product, Result> toLongBiFunction = (p, r)->1L;
        toLongBiFunction.applyAsLong(new Product(1000, "신발"), new Result("오매나"));

    }
}

class Result
{
    String productInfo;
    String testStr = "다시";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public Result(String productInfo) {
        this.productInfo = productInfo;
    }
}
class Product
{
    public Product(int price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    int price;
    String productName;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

