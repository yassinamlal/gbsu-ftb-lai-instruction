package com.kata.gbsuftblai

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.junit.Assert.*

@SpringBootTest
class GbsuFtbLaiApplicationTests (@Autowired val restTemplate: GbsuFtbLaiService){

    @Test
    fun contextLoads() {
        var result:String;

        result = restTemplate.convertNumber(1);
        assertEquals(result,"1");

        result = restTemplate.convertNumber(3);
        assertEquals(result,"GbsuGbsu");

        result = restTemplate.convertNumber(5);
        assertEquals(result,"FtbFtb");

        result = restTemplate.convertNumber(7);
        assertEquals(result,"Lai");

        result = restTemplate.convertNumber(9);
        assertEquals(result,"Gbsu");

        result = restTemplate.convertNumber(51);
        assertEquals(result,"GbsuFtb");

        result = restTemplate.convertNumber(53);
        assertEquals(result,"FtbGbsu");

        result = restTemplate.convertNumber(33);
        assertEquals(result,"GbsuGbsuGbsu");

        result = restTemplate.convertNumber(27);
        assertEquals(result,"GbsuLai");

        result = restTemplate.convertNumber(15);
        assertEquals(result,"GbsuFtbFtb");

    }

}
