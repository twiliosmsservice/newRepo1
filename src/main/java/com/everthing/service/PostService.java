package com.everthing.service;

import com.everthing.payload.PostDto;

public interface PostService {
    public PostDto createPost(PostDto postDto);

    void deletePost(long id);
}
