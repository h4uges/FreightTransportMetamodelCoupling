package cepmodel.logitopp.extraction;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

public class LogiToppBuilderBase {

	protected CSVParser getCSVParser(String filePath) throws IOException {
		Reader reader = new FileReader(Path.of(System.getProperty("user.dir"), filePath).toString());
		return CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader().setDelimiter(';').build()
				.parse(reader);
	}
}
