public class Playlist {

	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		Album album = new Album("um", "dois");
		album.addSong("aa", 4.4);
		album.addSong("eg", 4.3);
		album.addSong("erger", 4.1);
		album.addSong("aerg", 4.9);
		albums.add(album);
	}
}