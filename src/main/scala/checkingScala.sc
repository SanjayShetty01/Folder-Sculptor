val csvFilePath = getClass.getResource("/data/DS_members.csv").getPath
val csvData = CsvImporter.importCsvData(csvFilePath)

val h = csvData.map(_.head)
