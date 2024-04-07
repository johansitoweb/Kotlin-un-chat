package com.scalablescripts.kotlinchat.controllers

import com.pusher.rest.Pusher
import com.scalablescripts.kotlinchat.dtos.MessageDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api")
class ChatController {

    @PostMapping("/messages")
    fun message(@RequestBody body: MessageDTO): ResponseEntity<Any> {
        val pusher = Pusher("", "", "")
        pusher.setCluster("")
        pusher.setEncrypted(true)

        pusher.trigger("chat", "message", body)

        return ResponseEntity.ok(emptyArray<String>())
    }
}