package com.example.mysimplecleanarchitecture.data

import com.example.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {

    /*
    implementasi datasource yang merupakan sumber data message yang akan didapat
     */

    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}