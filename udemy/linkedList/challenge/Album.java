public class Album {

	private String name;
	private String artist;
	ArrayList<Song> songs;

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		songs = new ArrayList<String>();
	}

	public boolean addSong(String title, int duration) {
		if(findSong(title) == null) {
			Song song = new Song(title, duration);
			songs.add(song);
			return true;
		}
		return false;
	}

	private Song findSong(String title) {
		for(Song checkedSong : songs) {
			if(checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}

	public boolean addToPlayList(int track, LinkedList<Song> playList) {
		int index = track - 1;
		if((index >= 0) && (index <= songs.size())) {
			playList.add(songs.get(i));
			return true;
		}
		System.out.println("No track with number " + track);
		return false;
	}

	public boolean addToPlaylist(String title, LinkedList<String> playlist) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in this album");
	}
}