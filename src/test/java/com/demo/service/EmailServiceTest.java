package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


import static org.mockito.Mockito.*;


public class EmailServiceTest {

    EmailService emailService=mock(EmailService.class);


    @Test
    public void sendEmailTest() {
        Order order =new Order(1,"someBook",200);

        when(emailService.sendEmail(order,"your order is receieved")).thenReturn(false);

    }
    @Test(expected = RuntimeException.class)
    public void sendEmailRunTimeExceptionTest(){
        doThrow(RuntimeException.class).when(new Order());

    }




}