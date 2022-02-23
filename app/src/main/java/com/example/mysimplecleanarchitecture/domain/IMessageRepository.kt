package com.example.mysimplecleanarchitecture.domain

interface IMessageRepository {
    /*
    Kelas ini berisi proses bisnis yang akan dipanggil dari Use Case
     */
    fun getWelcomeMessage(nama: String): MessageEntity
}