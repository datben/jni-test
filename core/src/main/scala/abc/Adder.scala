package abc

import com.github.sbt.jni.syntax.NativeLoader

class Adder(val base: Int) extends NativeLoader("a") {
  @native def jniA(term: Int): Int
}