package bestbucketlist2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.print.attribute.standard.Destination;

import bestbucketlist2022.Destinations.Country;
import bestbucketlist2022.Destinations.Sightseeing;

/* 
 * definieert een class met een nieuw bestemming
 * 
 */

public class IdeaList extends Destinations {

	public IdeaList(String location, Country country, Sightseeing sightseeing) {
		super(location, country, sightseeing);
	
	}

	public static void main(String[] args) {
		
		List<Destinations> destination = new ArrayList<Destinations>();

		destination.add(new Destinations("1", Country.SURINAME, Sightseeing.BLANCHE_MARIEFALLS));
		destination.add(new Destinations("2", Country.INDONESIA, Sightseeing.BALI));
		destination.add(new Destinations("3", Country.INDIA, Sightseeing.THE_TAJ_MAHAL));
		
		// initializing random class
        Random destinations = new Random();
        
        int ideas = destinations.nextInt(destination.size());
        int[] chosen = {ideas};
        Destinations radomDetination = destination.get(ideas);
        System.out.println(radomDetination.toString());
	}

}
