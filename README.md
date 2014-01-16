Spray-json vs. Argonaut Benchmarking
====================================

This is a simple benchmark.  Take it with a few tons of salt.

For information, see [this blog post][1].

**Update:**

Actually, I added a check against [Play's Json][2] library after @dyross suggested it in a Tweet.  So it's really Spray-Json vs. Argonaut vs. Play Json in the "Just the Parser against a very simple JSON string" shootout.  Yeah, it's really not a great "benchmark", but it suits me for what I'm looking for.

**Parboiled2**

In order to satisfy the parboiled2 dependency you should clone [parboiled2][3] and do a `publish-local` on sbt. 

  [1]: http://derekwyatt.org/2014/01/14/benchmarking-spray-json-vs-argonaut "first blog post"
  [2]: http://www.playframework.com/documentation/2.1-RC4/ScalaJson "Play Json"
  [3]: https://github.com/sirthias/parboiled2/ "Parboiled2"
