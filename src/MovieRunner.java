
public class MovieRunner {
	public static void main(String[] args) {
		Movie bp = new Movie("Black Panther", 5);
		Movie ww = new Movie("WonderWoman", 4);
		Movie aiw = new Movie("Avengers Infinity Wars", 3);
		Movie cra = new Movie("Crazy Rich Asians", 4);
		Movie mif = new Movie("Mission Impossible: Fallout", 5);
		Movie t = new Movie("Twilight", 1);
		bp.getTicketPrice();
		ww.getTicketPrice();
		aiw.getTicketPrice();
		cra.getTicketPrice();
		mif.getTicketPrice();
		t.getTicketPrice();
		NetflixQueue nq = new NetflixQueue();
		nq.addMovie(bp);
		nq.addMovie(ww);
		nq.addMovie(aiw);
		nq.addMovie(cra);
		nq.addMovie(mif);
		nq.addMovie(t);
		System.out.println("The best movie is..."+nq.getBestMovie());
		nq.sortMoviesByRating();
		nq.printMovies();
	}
}
