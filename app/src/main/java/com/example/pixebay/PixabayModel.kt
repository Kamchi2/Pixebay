package com.example.pixebay

data class PixabayModel (
    val hits: ArrayList<ImageModel>
        )

data class ImageModel (
    val largeImageURL: String
        )
