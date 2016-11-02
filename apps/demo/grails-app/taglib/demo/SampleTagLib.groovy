package demo

// tag::basic_declaration[]
class SampleTagLib {

    static defaultEncodeAs = [taglib:'html']

    static namespace = 'demo'

    // end::basic_declaration[]
    // tag::hello_world[]
    def helloWorld = { attrs ->
        out << 'Hello, World!'
    }
    // end::hello_world[]
    // tag::say_hello[]
    def sayHello = { attrs ->
        out << "Hello, ${attrs.name}!"
    }
    // end::say_hello[]
// tag::basic_declaration[]
}
// end::basic_declaration[]
