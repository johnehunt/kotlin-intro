package com.jjh.people

/**
 * Creates a public class Person with 'properties' name and age.
 * Name is a public read only property (i.e. a val)
 * age is a public read-write property (i.e. a var)
 *
 * To construct the class must provide a name and age as part of constrcutor
 * Note keyword constructor is optional
 *
 * Note {} for class body are optional here as there is no class body
 */
class Person constructor(val name: String, // readonly property
                         var age: Int ) { }