package com.example.mysimplecleanarchitecture.data

import com.example.mysimplecleanarchitecture.domain.IMessageRepository


class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {

    /*
     class Repository yang merupakan turunan dari kelas IMessageRepository yang ada di package
     Domain. Kelas ini akan mengatur datasource yang akan diberikan kepada Use Case
     */

    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}