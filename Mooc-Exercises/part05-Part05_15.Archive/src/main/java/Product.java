public class Product {
    private String name;
    private String identifier;


    public Product(String name, String identifier){
        this.name = name;
        this.identifier = identifier;
    }


    @Override
    public boolean equals(Object compare){ 
        if(this == compare){
            return true;
        }
        if(!(this instanceof Product)){
            return false;
        }

        Product compareProduct = (Product) compare;

        if(this.identifier.contentEquals(compareProduct.identifier)){
            return true;
        }
        return false;


    }

    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}
