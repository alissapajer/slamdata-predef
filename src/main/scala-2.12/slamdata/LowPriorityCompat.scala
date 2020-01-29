/*
 * Copyright 2014–2020 SlamData Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package slamdata

import scala.{inline, Predef => P}
import scala.collection.{immutable => I}

import java.lang.String

private[slamdata] trait LowPriorityCompat {
  @inline implicit def wrapString(x: String): I.WrappedString    = P.wrapString(x)
  @inline implicit def unwrapString(x: I.WrappedString): String  = P.unwrapString(x)
}
