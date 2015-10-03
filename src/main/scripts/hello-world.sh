#!/bin/sh

exec scala "$0" "$@"

!#

object HelloWorldScript extends App {
  println("Hello, world! from script")
}

HelloWorldScript.main(args)