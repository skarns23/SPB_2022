package io.nams.rest.service.logic;

import io.nams.rest.entity.User;
import io.nams.rest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
public class UserServiceLogicTest {
    @Autowired
    private UserService userService;
    private User kim;
    private User lee;
    @BeforeEach
    public void startUp(){
        this.kim = new User("kim","kim@naver.com");
        this.lee = new User("lee","lee@naver.com");
        this.userService.register(kim);
        this.userService.register(lee);
    }
    @Test
    public void find(){
        assertThat(this.userService.find(lee.getId())).isNotNull();
        assertThat(this.userService.find(lee.getId()).getEmail()).isEqualTo(lee.getEmail());
    }
    @Test
    public void registerTest(){
        User sample = User.sample();
        this.userService.register(sample);
        assertThat(this.userService.register(sample)).isEqualTo(sample.getId());
        assertThat(this.userService.findAll().size()).isEqualTo(3);
        this.userService.remove(sample.getId());
    }
    @AfterEach
    public void cleanUp(){
        this.userService.remove(kim.getId());
        this.userService.remove(lee.getId());
    }
}
