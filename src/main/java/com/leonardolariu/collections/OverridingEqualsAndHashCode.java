package com.leonardolariu.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.leonardolariu.models.Author;
import com.leonardolariu.models.Post;

public class OverridingEqualsAndHashCode {

    public static void main(String[] args) {
        Map<Post, Author> feed = new HashMap<>();

        Author author = new Author();
        UUID uuid = UUID.randomUUID();
        Post post1 = Post.builder().id(uuid).build();
        Post post2 = Post.builder().id(uuid).build();
        Post post3 = Post.builder().build();

        feed.put(post1, author);
        feed.put(post2, author);
        feed.put(post3, author);

        // how many entries will the feed contain?
        feed.forEach((k, v) -> System.out.println(k + " - " + v));

        // what may happen if hashCode depends on mutable objects?
        post3.setContent("asd");
        System.out.println(feed.get(post3));
    }
}
