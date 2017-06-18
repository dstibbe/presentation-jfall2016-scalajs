package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

/**
  * Created by dstibbe on 31-10-2016.
  */
object Chap3JavaScript extends Section {
  override def content =
    section(
      subsection("Problems with JavaScript")(
        revealImg("js_good_vs_bad.jpg")(width := "800", height := "450")
      ),
      subsection("Typo")(
        prettyCode(javaScript,
          """function foobar() {
            |    var bar = 3;
            |    //
            |    // ...
            |    //
            |    baz = 20;
            |}""")
      ),
      subsection("Scoping")(
        prettyCode(javaScript,
          """
            |function foobar(foo) {
            |    if(foo === 0) {
            |        var bar = 20;
            |    }
            |    return bar;
            |}""")
      ),
      subsection("Function arguments")(
        prettyCode(javaScript,
          """var myTwoArgFunc = function( one, two ){
            |    console.log("Called with [one: " + one + ", two: " + two + "]");
            |}"""),

        fragment(
          regCode("""Called with [one: 2, two: undefined]""")
        ),
        fragment(
          regCode("""Called with [one: undefined, two: undefined]""")
        ),
        fragment(
          regCode("""Called with [one: 2, two: 3]""")
        )
      ),
      subsection("Semicolon insertion")(
        prettyCode(javaScript,
          """function myObject(){
            |  return
            |  {
            |    a: 5
            |  };
            |}"""),
        fragment(
          regCode("""undefined""")
        )
      ),
      subsection("Conditionals")(
        prettyCode(javaScript,
          """!'';"""),
        fragment(
          regCode("""true""")
        ),
        fragment(
          prettyCode(javaScript,
            """!new String('');""")
        ),
        fragment(
          regCode("""false""")
        ),
        fragment(
          prettyCode(javaScript,
            """'' == new String('');""")
        ),
        fragment(
          regCode("""true""")
        )
      ),
      subsection("Type conversion")(
        prettyCode(javaScript,
          """var j = "1";
            |j++;
            |j+=1;
          """),
        fragment(
          regCode("""j=3""")
        ),
        prettyCode(javaScript,
          """var j = "1";
            |j+=1;
            |j++;
          """),
        fragment(
          regCode("""j=12""")
        )
      ),
      subsection("Function parameter types")(

        prettyCode(javaScript,"""$mdPanel.create(config);"""),

        revealImg("func-description.jpg")(fragment)
      ),
      subsection("But ...")(
        fragment(
          inlinequote("The only scripting language that is supported by all the browsers.")
        )
      )
    )
}
