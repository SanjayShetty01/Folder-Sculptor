import java.io.File

object TeamMemberExtractor {

  /**
   * Extracts the team members from the CSV data.
   *
   * @param csvData The CSV data as a list of lists.
   * @return A list of team members extracted from the CSV data.
   */
  def extractTeamMembers(csvData: List[List[String]]): List[String] = {
    csvData.map(_.head)
  }

  /**
   * Creates team member folders in the specified destination folder.
   *
   * @param teamMembers       A list of team members.
   * @param destinationFolder The destination folder where the team member folders will be created.
   */
  def createTeamMemberFolders(teamMembers: List[String], destinationFolder: String): Unit = {
    teamMembers.foreach { teamMember =>
      val folder = new File(s"$destinationFolder/$teamMember")
      folder.mkdirs()
    }
  }

}