package org.csvparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple CSV parser that reads data from a CSV file.
 */
public class CSVParser {
    private String file;
    private String separator;
    private List<String[]> parsedData;

    /**
     * Constructs a CSVParser with the specified file and separator.
     *
     * @param file      The path to the CSV file to be parsed.
     * @param separator The delimiter used to separate fields in the CSV file.
     */
    CSVParser(String file, String separator) {
        this.file = file;
        this.separator = separator;
        parsedData = new ArrayList<>();
    }

    /**
     * Constructs a CSVParser with the specified file and default separator (`,`).
     *
     * @param file The path to the CSV file to be parsed.
     */
    CSVParser(String file) {
        this(file, ",");
    }

    /**
     * Sets the separator used to parse the CSV file.
     *
     * @param separator The delimiter used to separate fields in the CSV file.
     */
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    /**
     * Returns the parsed data from the CSV file.
     *
     * @return A list of string arrays representing the parsed CSV data.
     */
    public List<String[]> getParsedData() {
        return parsedData;
    }

    /**
     * Parses the CSV file and returns the parsed data.
     *
     * @return A list of string arrays representing the parsed CSV data.
     * @throws IOException If an I/O error occurs while reading the CSV file.
     */
    public List<String[]> parsing() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";

        while ((line = reader.readLine()) != null) {
            String[] row = line.split(separator);
            parsedData.add(row);
        }
        reader.close();
        return parsedData;
    }
}
