import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class PopUpTests extends TestBase {

    @CsvFileSource(resources = "dataSearchTests.csv")
    @ParameterizedTest(name = "Поиск по атрибуту: {0}")
    void positiveTest(String value) {
        mainPage.openMyShows().searchInput(value).searchResults(value);
    }

}
