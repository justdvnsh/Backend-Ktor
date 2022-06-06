package com.example.models

@kotlinx.serialization.Serializable
data class Customer(
    val id: String,
    val name: String,
    val email: String
)

val customerStorage = mutableListOf<Customer>()