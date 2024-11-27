package ex4_4_product_description;

import java.util.Locale;

public class Product {

    private String name;
    private Integer size;
    private Double percentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public Product(String name, Integer size, Double percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }


    public String productDescription() {
        if (size == null && percentage == null) {
            return "";
        }

        String result = name +" • ";

        if (size != null) result += size + "CL";


        if (percentage != 0.0){
           String format = percentage % 1 == 0 ? "%.0f" : "%.1f";
           if (size != null) result += " ";
           result += String.format(Locale.ROOT,format, percentage) + "%";
        }
        return result;
    }

}

