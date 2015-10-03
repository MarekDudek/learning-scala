
import language.postfixOps


print("This is simple script")

if (args isEmpty)
  println
else {
  println(", with arguments")
  args foreach println
}
