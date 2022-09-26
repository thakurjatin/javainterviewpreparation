package string;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BallotsCounter {

	public static String getWinner(final List<String> listOfBallots) {
	      return listOfBallots.stream().collect(Collectors.groupingBy(Object::toString, Collectors.counting())).
	        entrySet().stream().filter((e) -> e.getValue() >= listOfBallots.size() / 2 +1).
	        map(Map.Entry::getKey).findFirst().orElse(null);
	    }
}
