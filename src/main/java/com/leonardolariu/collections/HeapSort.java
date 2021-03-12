package com.leonardolariu.collections;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

import com.leonardolariu.models.Post;
import com.leonardolariu.models.Tag;

public class HeapSort {

    public static void main(String[] args) {
        PriorityQueue<Post> posts = new PriorityQueue<>((o1, o2) -> - Integer.compare(o1.getTags().size(), o2.getTags().size()));

        posts.add(Post.builder().tags(new HashSet<>(List.of(Tag.AD, Tag.DS))).build());
        posts.add(Post.builder().tags(new HashSet<>(List.of(Tag.AD, Tag.NETWORKING, Tag.OOM))).build());
        posts.add(Post.builder().tags(new HashSet<>(List.of(Tag.AD))).build());
        posts.add(Post.builder().tags(new HashSet<>(List.of(Tag.AD, Tag.DS, Tag.OOM, Tag.WT))).build());
        posts.add(Post.builder().tags(new HashSet<>(List.of(Tag.values()))).build());

        System.out.println("Posts in the order they were");
        posts.forEach(System.out::println);

        System.out.println("\n HeapSort in action");
        while (!posts.isEmpty()) {
            System.out.println(posts.poll());
        }
    }
}
