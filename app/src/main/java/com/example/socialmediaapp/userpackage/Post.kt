package com.example.socialapp.models

import com.example.socialmediaapp.userpackage.User

data class Post (
    val text: String = "",
    val createdBy: User = User(),
    val createdAt: Long = 0L,
    val likedBy: ArrayList<String> = ArrayList())