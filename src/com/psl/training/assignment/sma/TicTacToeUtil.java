package com.psl.training.assignment.sma;

import java.util.Scanner;

public class TicTacToeUtil {

	public static char board[][] = new char[3][3];

	public static void init() {
		System.out.println("Welcome to Somraj's Tic Tac Toe:");
		for (int i = 0; i < board.length; i++) {
			char[] cs = board[i];
			for (int j = 0; j < cs.length; j++) {
				cs[j] = '-';
			}
		}
	}

	public static boolean isValid(int i, int j) {
		return (i >= 0 && i <= 2) && (j >= 0 && j <= 2);
	}

	public static boolean isOccupied(int i, int j) {
		if (board[i][j] != '-') {
			return true;
		}
		return false;
	}

	public static void takeInputO(int i, int j) {
		board[i][j] = 'O';
	}

	public static void takeInputX(int i, int j) {
		board[i][j] = 'X';
	}

	public static void takeInput(char symbol) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Turn for " + symbol + ": ");
		System.out.println("Enter row:");
		int row = sc.nextInt();
		System.out.println("Enter col:");
		int col = sc.nextInt();
		if(!isValid(row, col)) {
			System.out.println("Position is invalid!");
			takeInput(symbol);
		} else {
			if (isOccupied(row, col)) {
				System.out.println("Position is occupied!");
				takeInput(symbol);
			} else {
				if (symbol == 'X') {
					takeInputX(row, col);
				} else {
					takeInputO(row, col);
				}
				if (hasWon(symbol, row, col)) {
					display();
					System.out.println(symbol + " has won");
					System.out.println("Thanks for playing!");
					System.exit(25);
				}
			}
		}
	}

	public static boolean hasWon(char symbol, int currentRow, int currentCol) {
		return ((board[currentRow][0] == symbol && board[currentRow][1] == symbol && board[currentRow][2] == symbol)
				|| (board[0][currentCol] == symbol && board[1][currentCol] == symbol && board[2][currentCol] == symbol)
				|| ((currentRow == currentCol) && board[0][0] == symbol && board[1][1] == symbol
						&& board[2][2] == symbol)
				|| ((currentRow + currentCol == 2) && board[0][2] == symbol && board[1][1] == symbol
						&& board[2][0] == symbol));
	}

	public static void gameCycle() {
		init();
		for (int i = 0; i < 9; i++) {
			display();
			if (i % 2 == 0) {
				takeInput('X');
			} else {
				takeInput('O');
			}
		}
		System.out.println("This is a tie!");
		System.out.println("Thanks for playing!");
	}

	public static void display() {
		System.out.println("The board:\n");
		for (int i = 0; i < board.length; i++) {
			char[] cs = board[i];
			for (int j = 0; j < cs.length; j++) {
				char c = cs[j];
				System.out.print("\ti:" + i + " j:" + j + " " + c);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		gameCycle();
	}

}
