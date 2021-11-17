
File csvFile = new File(pathToCsv);
if (csvFile.isFile()) {
    // create BufferedReader and read data from csv
BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
while ((row = csvReader.readLine()) != null) {
    String[] data = row.split(",");
    // do something with the data
}
csvReader.close();
}
