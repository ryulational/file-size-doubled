//> using lib "com.lihaoyi::os-lib:0.9.0"
//> using lib "org.typelevel::squants:1.8.3"

import os._
import squants.information.{Bytes, Kilobytes, Megabytes, Gigabytes}

val file = os.Path(args(0))

val size: Double = os.size(file).toDouble
val sizeDoubled: Double = size * 2

val bytes = Bytes(sizeDoubled)
val kb = bytes in Kilobytes
val mb = bytes in Megabytes
val gb = bytes in Gigabytes

println("Bytes: " + bytes)
println("Kilobytes: " + kb)
println("Megabytes: " + mb)
println("Gigabytes: " + gb)
