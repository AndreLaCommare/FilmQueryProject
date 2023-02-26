package com.skilldistillery.filmquery.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {

	DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) throws SQLException {
		FilmQueryApp app = new FilmQueryApp();
		// app.test();
		app.launch();
	}

	private void test() throws SQLException {
		Film film = db.findFilmById(23);
		System.out.println(film);
//	Actor anActor = db.findActorById(1);
//	System.out.println(anActor);
//    List<Film> actorFilms = db.findFilmsByActorId(13);
//    System.out.println(actorFilms.size());
//    System.out.println(actorFilms);
//    
//    List<Actor> actorsInThisFilm = db.findActorsByFilmId(13);
//    System.out.println(actorsInThisFilm.size());
//    System.out.println(actorsInThisFilm);
	}

	private void launch() {
		Scanner input = new Scanner(System.in);

		startUserInterface(input);

		input.close();
	}

	private void startUserInterface(Scanner input) {
		String userInput = "";
		while (!(userInput.equals("0"))) {
			System.out.println("Welcome to the Film Query App:");
			System.out.println("Please select an option, or 0 to exit.");
			System.out.println("1.) Look up a film by its ID.");
			System.out.println("2.) Look up a film by a search keyword.");
			userInput = input.nextLine();
			switch (userInput) {
			case "0":
				System.out.println("Goodbye");
				break;
			case "1":
				System.out.println("Enter a film id:");
				userInput = input.nextLine();
				int filmId = Integer.parseInt(userInput);
				if (db.findFilmById(filmId) != (null)) {
					System.out.println(db.findFilmById(filmId));
					
				} else {
					System.out.println("There is no such film.");
				}
				break;
			case "2":
				System.out.println("Please enter a keyword/phrase to search for in film title or description:");
				userInput = input.nextLine();
				if (!(db.findFilmsByKeyword(userInput).isEmpty())){
					System.out.println(db.findFilmsByKeyword(userInput));
				}else {
					System.out.println("There are no films with any such keyword");
				}
				break;				

			default:
				System.out.println("Invalid Option, Please Select Again");
				break;
			}
		}
	}

}
