package com.jb.app.test;

import com.jb.app.beans.Category;
import com.jb.app.beans.Company;
import com.jb.app.beans.Coupon;
import com.jb.app.beans.Customer;
import com.jb.app.repo.CompanyRepository;
import com.jb.app.repo.CouponRepository;
import com.jb.app.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

@Component
@Order(1)
@RequiredArgsConstructor
public class InitTest implements CommandLineRunner {

    private final CompanyRepository companyRepo;
    private final CouponRepository couponRepo;
    private final CustomerRepo customerRepo;

    @Override
    public void run(String... args) throws Exception {
        Company c1 = Company.builder()
                .name("coca Cola")
                .email("cocacola@cocacola.com")
                .password("cocaCola12*")
                .build();

        Company c2 = Company.builder()
                .name("john bryce")
                .email("jb@bryce.com")
                .password("cocaCola12*")
                .build();

        Company c3 = Company.builder()
                .name("Amazon")
                .email("amazon@amazon.com")
                .password("cocaCola12*")
                .build();

        Coupon cn1 = Coupon.builder()
                .company(c1)
                .category(Category.FOOD)
                .name("Free shipping")
                .description("Free Shipping on Orders Over $50")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusDays(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Coupon cn2 = Coupon.builder()
                .company(c2)
                .category(Category.SCHOOL)
                .name("bonus lecture")
                .description("bonus lecture for students who completed extra assignments")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusDays(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Coupon cn3 = Coupon.builder()
                .company(c3)
                .category(Category.SHOPPING)
                .name("Free shipping")
                .description("Free Shipping on Orders Over $50")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusYears(2)))
                .amount(100)
                .price(35.99f)
                .img("https://coca_cola.jpg")
                .build();

        Coupon cn4 = Coupon.builder()
                .company(c1)
                .category(Category.FOOD)
                .name("discount coke")
                .description("drugs are too expensive? get discount cocaine-I mean coke-today!")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusYears(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Coupon cn5 = Coupon.builder()
                .company(c2)
                .category(Category.SCHOOL)
                .name("returning student discount")
                .description("get 10% off your second course! only in John Bryce")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusYears(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Coupon cn6 = Coupon.builder()
                .company(c3)
                .category(Category.SHOPPING)
                .name("Free remote?")
                .description("get a remote! claim it now!!! just enter your credit information this is not a scam")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusYears(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Coupon cn7 = Coupon.builder()
                .company(c1)
                .category(Category.FOOD)
                .name("enlarge order")
                .description("get a larger bottle without paying extra, yam!")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusYears(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Coupon cn8 = Coupon.builder()
                .company(c1)
                .category(Category.FOOD)
                .name("Fanta")
                .description("please buy some Fanta it's not radioactive we checked")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusYears(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Coupon cn9 = Coupon.builder()
                .company(c3)
                .category(Category.SHOPPING)
                .name("cutting edge TV!")
                .description("get a new, cutting edge \"smart\" TV, with over 4_000 pixels! at just 100$")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusYears(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Coupon cn10 = Coupon.builder()
                .company(c3)
                .category(Category.SHOPPING)
                .name("exclusive payment")
                .description("exclusive payment method is the way to distinguish yourself as a serious person with serious pockets, where you pay an extra 250% on your order, and get an EXCLUSIVE CLIENT STICKER")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusYears(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Coupon cn11 = Coupon.builder()
                .company(c3)
                .category(Category.SHOPPING)
                .name("prime tv first month off")
                .description("get a free month when you join prime tv")
                .startDate(Date.valueOf(LocalDate.now().minusWeeks(1)))
                .endDate(Date.valueOf(LocalDate.now().plusYears(2)))
                .amount(100)
                .price(35.99f)
                .img("https://i.imgur.com/0TGZoQb.jpg")
                .build();

        Customer cr1 = Customer.builder()
                .firstName("Moti")
                .lastName("Lohim")
                .email("moti@gmail.com")
                .password("Moti$1234")
                .coupons(Arrays.asList(cn4,cn9,cn8,cn7,cn10))
                .build();

        Customer cr2 = Customer.builder()
                .firstName("Moshe")
                .lastName("non")
                .email("moshe@ks.com")
                .password("Moti$1234")
                .coupons(Arrays.asList(cn6,cn9))
                .build();

        Customer cr3 = Customer.builder()
                .firstName("Kobi")
                .lastName("Shasha")
                .email("KS@moshe.com")
                .password("Moti$1234")
                .coupon(cn1)
                .build();

        Customer cr4 = Customer.builder()
                .firstName("omer")
                .lastName("keidar")
                .email("omer@gmail.com")
                .password("Moti$1234")
                .coupons(Arrays.asList(cn1,cn11))
                .build();




        companyRepo.saveAll(Arrays.asList(c1,c2,c3));
        couponRepo.saveAll(Arrays.asList(cn1,cn2,cn3,cn4,cn5,cn6,cn7,cn8,cn9,cn10,cn11));
        customerRepo.saveAll(Arrays.asList(cr1,cr2,cr3,cr4));


    }
}
