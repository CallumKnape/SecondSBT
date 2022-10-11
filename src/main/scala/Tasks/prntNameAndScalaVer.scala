package Tasks

object prntNameAndScalaVer extends App {
  print("Callum Knape\n" + util.Properties.versionString + "\n" +
    util.Properties.versionNumberString + "\n" +
    util.Properties.versionMsg)
}
