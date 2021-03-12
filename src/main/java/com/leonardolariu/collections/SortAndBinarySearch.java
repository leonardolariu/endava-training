package com.leonardolariu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.leonardolariu.models.Post;

public class SortAndBinarySearch {

    public static void main(String[] args) {
        List<Post> posts = new ArrayList<>();
        Post post = Post.builder().build();

        posts.add(post);
        posts.add(Post.builder().build());
        posts.add(Post.builder().build());
        posts.add(Post.builder().build());
        posts.add(Post.builder().build());

        System.out.println("Collection before sort");
        posts.forEach(System.out::println);

        // sort
        posts.sort(new PostComparator());

        System.out.println("\nCollection after sort");
        posts.forEach(System.out::println);

        // binary search for a stored post
        System.out.println(Collections.binarySearch(posts, post, new PostComparator()));
        // binary search for a post that is not stored
        System.out.println(Collections.binarySearch(posts, Post.builder().build(), new PostComparator()));
    }

    static class PostComparator implements Comparator<Post> {
        @Override
        public int compare(Post o1, Post o2) {
            return o1.getId().compareTo(o2.getId());
        }
    }
}
