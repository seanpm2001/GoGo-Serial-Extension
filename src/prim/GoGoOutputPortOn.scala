package org.nlogo.extensions.gogo.prim

import org.nlogo.api.{ Argument, Context, DefaultCommand, Syntax }

class GoGoOutputPortOn extends DefaultCommand {
  override def getSyntax = Syntax.commandSyntax
  override def perform(args: Array[Argument], context: Context) {
    ensureGoGoPort()
    controller.outputPortOn()
  }
}
