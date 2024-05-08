package com.everthing.service.impl;

import com.everthing.entity.Post;
import com.everthing.exception.ResourceNotFoundException;
import com.everthing.payload.PostDto;
import com.everthing.repository.PostRepository;
import com.everthing.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepo;
    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setName(postDto.getName());
        post.setCity(postDto.getCity());
        post.setMobile(postDto.getMobile());
        Post savedPost = postRepo.save(post);

        PostDto dto = new PostDto();
        dto.setName(savedPost.getName());
        dto.setCity(savedPost.getCity());
        dto.setMobile(savedPost.getMobile());
        dto.setMessage("post is saved");
        return dto;

    }

    @Override
    public void deletePost(long id) {
        Post post = postRepo.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("post not found with id:" +id)
        );
        postRepo.deleteById(id);
    }
}
