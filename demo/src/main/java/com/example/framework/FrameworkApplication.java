package com.example.framework;

import com.example.framework.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
@ServletComponentScan
public class FrameworkApplication {
    public static void main(String[] args) {

        SpringApplication.run(FrameworkApplication.class, args);
    }
}

class Test{
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3 };
        List myList = Arrays.asList(myArray);
        System.out.println(myList.size());
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        int [] array=(int[]) myList.get(0);
        System.out.println(array[0]);
    }

}