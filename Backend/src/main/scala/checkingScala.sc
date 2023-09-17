import services.CsvImporter

val csvFilePath = getClass.getResource("/data/members.csv").getPath
val csvData = CsvImporter.importCsvData(csvFilePath)

val h = csvData.map(_.head)
