BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
while ((row = csvReader.readLine()) != null) {
    String[] data = row.split(",");
    // do something with the data
}
csvReader.close();
