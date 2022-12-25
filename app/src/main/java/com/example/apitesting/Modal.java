package com.example.apitesting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Modal {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("post_all_data")
    @Expose
    private List<PostAllDatum> postAllData = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("is_like")
    @Expose
    private Integer isLike;
    @SerializedName("count")
    @Expose
    private Integer count;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PostAllDatum> getPostAllData() {
        return postAllData;
    }

    public void setPostAllData(List<PostAllDatum> postAllData) {
        this.postAllData = postAllData;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getIsLike() {
        return isLike;
    }

    public void setIsLike(Integer isLike) {
        this.isLike = isLike;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    public class PostAllDatum {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("introVideoType")
        @Expose
        private String introVideoType;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("video_thumnails")
        @Expose
        private String videoThumnails;
        @SerializedName("category_id")
        @Expose
        private String categoryId;
        @SerializedName("video_desc")
        @Expose
        private Object videoDesc;
        @SerializedName("video_uri")
        @Expose
        private String videoUri;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("image")
        @Expose
        private String image;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getIntroVideoType() {
            return introVideoType;
        }

        public void setIntroVideoType(String introVideoType) {
            this.introVideoType = introVideoType;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getVideoThumnails() {
            return videoThumnails;
        }

        public void setVideoThumnails(String videoThumnails) {
            this.videoThumnails = videoThumnails;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public Object getVideoDesc() {
            return videoDesc;
        }

        public void setVideoDesc(Object videoDesc) {
            this.videoDesc = videoDesc;
        }

        public String getVideoUri() {
            return videoUri;
        }

        public void setVideoUri(String videoUri) {
            this.videoUri = videoUri;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }
    public class Category {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("key")
        @Expose
        private String key;
        @SerializedName("category_image")
        @Expose
        private String categoryImage;
        @SerializedName("cate_id")
        @Expose
        private String cateId;
        @SerializedName("is_basic")
        @Expose
        private Object isBasic;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getCategoryImage() {
            return categoryImage;
        }

        public void setCategoryImage(String categoryImage) {
            this.categoryImage = categoryImage;
        }

        public String getCateId() {
            return cateId;
        }

        public void setCateId(String cateId) {
            this.cateId = cateId;
        }

        public Object getIsBasic() {
            return isBasic;
        }

        public void setIsBasic(Object isBasic) {
            this.isBasic = isBasic;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

    }
}
