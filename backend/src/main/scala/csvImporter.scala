import com.github.tototoshi.csv._
import java.io.File

object CsvImporter {

  /**
   * Imports CSV data from a file.
   *
   * @param csvPath The path to the CSV file.
   * @return The CSV data as a list of lists.
   */
  def importCsvData(csvPath: String): List[List[String]] = {
    val csvFile = new File(csvPath)
    val reader = CSVReader.open(csvFile)
    val rows: List[List[String]] = reader.all()
    rows
  }

}