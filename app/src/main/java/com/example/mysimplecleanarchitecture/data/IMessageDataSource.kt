package com.example.mysimplecleanarchitecture.data

import com.example.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {

    /*
    interface untuk datasource yang merupakan template untuk implementasinya
     */

    fun getMessageFromSource(name: String): MessageEntity
}