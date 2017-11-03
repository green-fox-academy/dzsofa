package com.greenfox.reddit;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    @Autowired
    PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        postRepository.save(new Post("funny cat picture"));
//        postRepository.save(new Post("some yo momma joke"));
//        postRepository.save(new Post("green fox review"));
//        postRepository.save(new Post("lorem ipsum"));
//        postRepository.save(new Post("fikusz kukisz"));
//        postRepository.save(new Post("mr bean is the best"));
//        postRepository.save(new Post("hello darkness my old friend"));
//        postRepository.save(new Post("y u do dis"));
//        postRepository.save(new Post("review my code review view"));
//        postRepository.save(new Post("send me some cookie"));
//        postRepository.save(new Post("i can give you a hug if you want"));
//        postRepository.save(new Post("thank god it's friday"));
//        postRepository.save(new Post("lemme out from here!!!"));
//        postRepository.save(new Post("Keep the change you filthy animal!"));
//        postRepository.save(new Post("Java 4eva!"));

    }
}
