import services.{CsvImporter, TeamMemberExtractor}

object Main {
  def main(args: Array[String]): Unit = {
    val csvFilePath = "src/main/resources/data/members.csv"
    val destinationFolder = "src/output"

    try {
      val csvData = CsvImporter.importCsvData(csvFilePath)
      val teamMembers = TeamMemberExtractor.extractTeamMembers(csvData)
      TeamMemberExtractor.createTeamMemberFolders(teamMembers, destinationFolder)
      println("Folders created successfully!")
    } catch {
      case e: Exception =>
        println(s"An error occurred: ${e.getMessage}")
    }
  }
}
