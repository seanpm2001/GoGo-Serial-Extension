package org.nlogo.extensions.gogo.prim

import org.nlogo.api.{ Argument, Context, DefaultReporter, Syntax }

class GoGoOpenPredicate extends DefaultReporter {
  override def getSyntax = Syntax.reporterSyntax(Syntax.BooleanType)
  override def report(args: Array[Argument], context: Context) =
    Boolean.box(((controller != null) && (controller.currentPort != null)))
}
