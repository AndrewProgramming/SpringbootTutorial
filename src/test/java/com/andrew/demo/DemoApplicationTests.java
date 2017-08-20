package com.andrew.demo;

import com.andrew.demo.model.Blog;
import com.andrew.demo.service.BlogService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private BlogService blogService;

    @Test
    public void contextLoads() {
        Blog blog = blogService.findUser(1);
        System.out.println("blog--->" + blog);
        assertEquals(1, blog.getId());
        assertEquals("andrew", blog.getAuthor());
    }

}
