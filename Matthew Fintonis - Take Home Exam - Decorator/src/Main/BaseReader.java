package Main;
import java.io.IOException;
import java.io.Reader;

public class BaseReader extends AdverbDecorator {
	
	public BaseReader(Reader reader) {
		super(reader);
	}

	@Override
	public String readLine() throws IOException {
		return super.readLine();
	}
	
}
