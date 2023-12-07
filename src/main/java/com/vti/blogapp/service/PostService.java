package com.vti.blogapp.service;

import com.vti.blogapp.dto.PostDto;
import com.vti.blogapp.form.PostCreateForm;
import com.vti.blogapp.form.PostUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface PostService {
    // Các phương thức đều auto là public
    Page<PostDto> findAll(Pageable pageable);

    PostDto findById(Long id);
     PostDto create(PostCreateForm form);

     PostDto update(PostUpdateForm form, Long id);

     void DeleteById(Long id);
}
