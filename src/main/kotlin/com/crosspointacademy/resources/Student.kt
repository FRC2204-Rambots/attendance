package com.crosspointacademy.resources

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import javax.persistence.Entity
import kotlin.time.Duration

@Entity
class Student : PanacheEntity() {

    companion object : PanacheCompanion<Student>

    lateinit var name: String

    var timeSpent: Duration = Duration.ZERO


}
