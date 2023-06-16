package com.example.jddpbackend.controller;

import com.example.jddpbackend.entity.CommentEntity;
import com.example.jddpbackend.repository.CommentRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CommentController {
    private final CommentRepository commentRepository;
    @Autowired
    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @PostMapping("/comments/upload")
    public ResponseEntity<String> addComment(@RequestBody CommentEntity comment) {
        try {
            System.out.println(comment.getUserId());
            commentRepository.save(comment);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @RequestMapping("/comments/getAll")
    public List<CommentEntity>GetAllComments() {
        return commentRepository.findAll();
    }

    @PostMapping("/comments/{commentId}/like")
    public ResponseEntity<String> likeComment(@PathVariable Long commentId) {
        CommentEntity comment = commentRepository.findById(commentId).orElse(null);
        if (comment == null) {
            return ResponseEntity.notFound().build();
        }

        // 更新点赞数
        comment.setLikes(comment.getLikes() + 1);
        commentRepository.save(comment);

        return ResponseEntity.ok("点赞成功");
    }

}
