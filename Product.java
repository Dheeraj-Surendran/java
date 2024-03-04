public class Product{
int pcode;
String pname;
double price;

public Product(int pcode, String pname, double price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
public static Product
findLowestPriceProduct(Product[]products){
Product lowestPriceProduct=products[0];
for(int i=1;i<products.length;i++){
if(products[i].price<lowestPriceProduct.price){
lowestPriceProduct=products[i];
}
}
return lowestPriceProduct;
}
public static void main(String[]args){
Product product1=new Product(1,"Product1",20.0);
Product product2=new Product(2,"Product2",15.0);
Product product3=new Product(3,"Product3",25.0);
Product[] products={product1,product2,product3};
Product lowestPriceProduct=findLowestPriceProduct(products);
System.out.println("product with lowest price:"+ lowestPriceProduct.pname);
}
}
