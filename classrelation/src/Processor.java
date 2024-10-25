public class Processor {
    private String brand;
    private double cache;


    Processor(String brand, int cache) {
        this.brand = brand;
        this.cache = cache;
    }

    Processor() {

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public String getBrand() {
        return brand;
    }
    public double getCache() {
        return cache;
    }

    public void print() {
        System.out.printf("Brand Processor = %s\n ", brand);
        System.out.printf("Cache Memory = %.2f\n ", cache);
    }
}
