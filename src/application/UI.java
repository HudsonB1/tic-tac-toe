package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import TTT.TTTPiece;
import TTT.TTTPosition;
import enums.Shape;

public class UI {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	// https://stackoverflow.com/questions/2979383/java-clear-the-console
	public static void clearScreen() {
	 System.out.println("\033[H\033[2J");
	 System.out.flush();
	} 
	
	public static TTTPosition readerTTTPosition(Scanner reader) {
		try {
			String m = reader.nextLine();
			char column = m.charAt(0);
			Integer row = Integer.parseInt(m.substring(1));
			return new TTTPosition(column, row);
		}
		catch (RuntimeException e) {
			throw new InputMismatchException("Posição incorreta!");
		}
	}
	
	
	public static void printBoard(TTTPiece[][] pieces) {
		
		for (int i=0; i < pieces.length; i++ ) {
			System.out.print(ANSI_RED + (3 - i) + ANSI_RESET);
			for (int j=0; j < pieces.length; j++ ) {
				printPositions(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println(ANSI_GREEN + "  A  B  C" + ANSI_RESET);
	}
	
	private static void printPositions (TTTPiece piece) {
		if (piece == null)  {
			System.out.print(" - ");
		}
		if (piece.getShape() == Shape.X) {
			System.out.print(" X ");
		}
		System.out.print(ANSI_YELLOW + " O " + ANSI_RESET);
	}

}
