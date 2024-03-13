package com.example.demo;

import com.example.demo.dao.entities.Product;
import com.example.demo.dao.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    //Create Product
    @Autowired
    private ProductRepository productRepository ;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(1,"pc1","ttt",100);
        product.getId();
        product.getName();
        product.getDescription();
        product.getPrice();
        Product product1 = new Product();
        product1.setId(2);
        product1.setName("Iphone 12");
        product1.setDescription("Best Quality");
        product1.setPrice(12888);

        Product product2 = new Product();
        product2.setId(3);
        product2.setName("Iphone 15");
        product2.setDescription("Best Quality");
        product2.setPrice(15000);

        productRepository.save(product);
        productRepository.save(product1);
        productRepository.save(product2);

        //Read Product

        List<Product> products = productRepository.findAll();
        products.forEach(productFromList -> {

            System.out.println(productFromList.toString());

        });

        //Update product

        Product productUpdatedById = productRepository.findById(1).get();
        System.out.println(productUpdatedById);
        productUpdatedById.setName("Yes updated");
        productRepository.save(productUpdatedById);
        productUpdatedById = productRepository.findById(1).get();
        System.out.println(productUpdatedById);

        //Delete Product



        System.out.println(productRepository.findById(2).get());
        productRepository.delete(product1);
        try {
            System.out.println(productRepository.findById(2).get());
        } catch (Exception exception) {
            System.out.println("The product has been deleted");
        }

        /*System.out.println("***********************findByX********************");
        System.out.println(productRepository.findByname("pc1"));
        System.out.println(productRepository.findBydesc("ttt"));
        System.out.println(productRepository.findByprice(100)); */


    }



}
