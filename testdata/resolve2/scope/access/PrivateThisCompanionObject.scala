object Foo {
	private[this] def f {}
}

class Foo {
	println(Foo./* line: 6, accessible: false */f)
}

