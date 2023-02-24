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
    app.test();
//    app.launch();
  }

  private void test() throws SQLException {
	Film film = db.findFilmById(23);
	System.out.println(film);
	Actor anActor = db.findActorById(1);
	System.out.println(anActor);
    List<Film> actorFilms = db.findFilmsByActorId(13);
    System.out.println(actorFilms.size());
    System.out.println(actorFilms);
    
    List<Actor> actorsInThisFilm = db.findActorsByFilmId(13);
    System.out.println(actorsInThisFilm.size());
    System.out.println(actorsInThisFilm);
  }

  private void launch() {
    Scanner input = new Scanner(System.in);
    
    startUserInterface(input);
    
    input.close();
  }

  private void startUserInterface(Scanner input) {
    
  }

}
