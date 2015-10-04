
import language.postfixOps

print("This is simple script")

if (args isEmpty)
  println
else {
  println(", with arguments")
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

args foreach println
for (arg <- args)
  println(arg)


