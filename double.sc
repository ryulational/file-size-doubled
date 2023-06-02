//> using lib "com.lihaoyi::os-lib:0.9.1"
//> using lib "org.typelevel::squants:1.8.3"

import os._
import squants.information.{Bytes, Kilobytes, Megabytes, Gigabytes}

val file = args(0)
val path = os.pwd / file

val size: Double = os.size(path).toDouble
val sizeDoubled: Double = size * 2

val bytes = Bytes(sizeDoubled)
val kb = bytes in Kilobytes
val mb = bytes in Megabytes
val gb = bytes in Gigabytes

println("Bytes: " + bytes)
println("Kilobytes: " + kb)
println("Megabytes: " + mb)
println("Gigabytes: " + gb)
