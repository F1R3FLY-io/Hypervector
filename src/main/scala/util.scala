package hv

import java.util.Random

type HyperVectorSize = 8192
val hyperVectorSize: HyperVectorSize = 8192

//private[hv] val rand = java.util.random.RandomGenerator.getDefault

private[hv] val rand = java.util.Random()
