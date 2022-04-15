package application;

import java.util.Scanner;

import TTT.TTTMatch;
import TTT.TTTPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		TTTMatch tttMatch = new TTTMatch();
		
		try {
			for (int shapeInt=0; shapeInt <= 9; shapeInt++) {
				
				UI.clearScreen();
				
				UI.printBoard(tttMatch.getPieces());
			
				TTTPosition TTTposition = UI.readerTTTPosition(reader);
				
				tttMatch.placePiece(TTTposition, shapeInt);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		reader.close();
	}

}
