package com.example;

import com.example.service.BankingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BankingService service = context.getBean(BankingService.class);

        service.transferMoney(1, 2, 500.0);
        context.close();
    }
}
