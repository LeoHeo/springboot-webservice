package com.leoheo.webservice.web;

import com.leoheo.webservice.domain.posts.PostsRepository;
import com.leoheo.webservice.dto.posts.PostSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

  private PostsRepository postsRepository;

  @GetMapping("/hello")
  public String hello() {
    return "Hello world";
  }

  @PostMapping("/posts")
  public void savePosts(@RequestBody PostSaveRequestDto dto) {
    postsRepository.save(dto.toEntity());
  }
}
