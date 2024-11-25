package com.learning.socialmediablog.social_media_blog_app.service;

import com.learning.socialmediablog.social_media_blog_app.dto.PostDto;
import java.util.List;

public interface PostService {

    //Get all the post
    List<PostDto> getAllPosts();

    //Get post by id
    PostDto getPostById(long id);

    //Create post
    PostDto createPost(PostDto postDtoToBeCreated);

    //Update post
    PostDto updatePost(PostDto postDto, long postIdToBeUpdated);

    //Delete post by id
    boolean deletePostById(long postIdToBeDeleted);
}