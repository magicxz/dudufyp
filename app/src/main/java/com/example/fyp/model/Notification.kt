package com.example.fyp.model

class Notification(var notificationId : String, var date : String, var receiver : String, var sender : String, var type : String, var status : String, var postId : String) {
    constructor() : this("","","","","","",""){

    }
}