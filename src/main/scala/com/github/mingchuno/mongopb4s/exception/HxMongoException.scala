package com.github.mingchuno.mongopb4s.exception

abstract class HxMongoException(msg: String, cause: Exception) extends Exception(msg, cause)

class DataNotFoundException extends HxMongoException("Data not found in DB which is the None case.", null)
