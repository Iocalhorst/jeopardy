
File csvFile = new File(pathToCsv);
if (csvFile.isFile()) {
    // create BufferedReader and read data from csv
BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
while ((row = csvReader.readLine()) != null) {
    String[] data = row.split(",");
    // do something with the data
}
List<List<String>> rows = Arrays.asList(
    Arrays.asList("Jean", "author", "Java"),
    Arrays.asList("David", "editor", "Python"),
    Arrays.asList("Scott", "editor", "Node.js")
);

FileWriter csvWriter = new FileWriter("new.csv");
csvWriter.append("Name");
csvWriter.append(",");
csvWriter.append("Role");
csvWriter.append(",");
csvWriter.append("Topic");
csvWriter.append("\n");

for (List<String> rowData : rows) {
    csvWriter.append(String.join(",", rowData));
    csvWriter.append("\n");
}

csvWriter.flush();
    
    csvReader.close();
}

