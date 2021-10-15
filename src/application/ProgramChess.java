package application;

import java.util.Scanner;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class ProgramChess {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.print("Source: ");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("Target: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		
		}
	
	}
	
}
/*
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

ChessMatch chessMatch = new ChessMatch();
List<ChessPiece> captured = new ArrayList<>();

while (!chessMatch.getCheckMate()) {
	try {
		UI.clearScreen();
		UI.printMatch(chessMatch, captured);
		System.out.println();
		System.out.print("Source: ");
		ChessPosition souce = UI.readChessPosition(sc);
		
		boolean[][] possibleMoves = chessMatch.possibleMoves(source);
		UI.clearScreen();
		
	}
	
}

}*/