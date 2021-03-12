package com.leonardolariu.models;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Post {
    @Builder.Default
    UUID id = UUID.randomUUID();
    String content;
    Set<Tag> tags;

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Tag> getTags() {
        return Collections.unmodifiableSet(tags);
    }

    public Post addTag(Tag e) {
        if (tags == null) {
            tags = new HashSet<>();
        }

        tags.add(e);
        return this;
    }

    public void removeTag(Tag e) {
        tags.remove(e);

        tags.removeIf(tag -> tag.equals(e));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) &&
            Objects.equals(content, post.content) &&
            Objects.equals(tags, post.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Post{" +
            "id=" + id +
            ", content=" + content +
            ", tags=" + tags +
            '}';
    }
}
