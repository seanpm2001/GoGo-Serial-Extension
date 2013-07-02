package org.nlogo.extensions.gogo.prim

import org.nlogo.api.{ Argument, Context, DefaultCommand, Syntax }

class GoGoOutputPortOff extends DefaultCommand {
  override def getSyntax = Syntax.commandSyntax
  override def perform(args: Array[Argument], context: Context) {
    ensureGoGoPort()
    controller.outputPortOff()
  }
}
