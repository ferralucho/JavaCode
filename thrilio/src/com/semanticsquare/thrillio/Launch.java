package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class Launch {
	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		DataStore.loadData();
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();

	}
	
	private static void printUserData() {
		for (User user : users) {

		}
	}
	
	private static void printBookmarks() {
		for (Bookmark[] bookmarks : bookmarks) {
			
		}
	}

	public static void main(String[] args) {
		loadData();
	}
}
