package com.crosspointacademy.entities

import com.crosspointacademy.resources.Student
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam

@Path("/student")
class StudentResource {

    @POST
    fun addStudent(student: Student) {
        student.persist()
    }

    @GET
    @Path("/{id}")
    fun getStudent(@PathParam("id") id: Long) {
        Student.findById(id)
    }

}