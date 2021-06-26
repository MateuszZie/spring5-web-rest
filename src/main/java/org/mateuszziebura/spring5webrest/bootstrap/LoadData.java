package org.mateuszziebura.spring5webrest.bootstrap;

import lombok.RequiredArgsConstructor;
import org.mateuszziebura.spring5webrest.domain.Customer;
import org.mateuszziebura.spring5webrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoadData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        Customer mateusz = Customer.builder().firstName("Mateusz").lastName("Ziebura").build();
        Customer adam = Customer.builder().firstName("Adam").lastName("Ryt").build();
        Customer krystian = Customer.builder().firstName("Krystian").lastName("Lis").build();

        customerRepository.save(mateusz);
        customerRepository.save(adam);
        customerRepository.save(krystian);

        System.out.println("loaded customer = " +customerRepository.count());
    }
}
